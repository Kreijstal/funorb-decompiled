/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi implements dh {
    private int field_f;
    private int field_k;
    private int field_i;
    private int field_l;
    private int field_m;
    private int field_d;
    private m field_b;
    private int field_e;
    private int field_j;
    private int field_n;
    private int field_a;
    static int field_g;
    private int field_h;
    static String[] field_c;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        if (kk.a(param0, param1, (byte) 118)) {
          if (param2 < -32) {
            var3 = 0;
            L0: while (true) {
              if (param1.length() > var3) {
                if (q.a(param1.charAt(var3), (byte) 118)) {
                  var3++;
                  continue L0;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vi var11 = null;
        el stackIn_3_0 = null;
        el stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof vi) {
            stackOut_2_0 = (el) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (el) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (vi) (Object) stackIn_3_0;
          if (var11 != null) {
            param3 = param3 & var11.field_D;
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 <= -5) {
          L2: {
            var7 = 5592405;
            vb.a(param4.field_v + param0, param2 - -param4.field_m, param4.field_r, param4.field_h, ((bi) this).field_d);
            if (!param3) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          var8 = ((bi) this).field_k + (param0 + param4.field_v);
          var9 = ((bi) this).field_j + (param4.field_m + param2);
          vb.f(var8, var9, ((bi) this).field_n, ((bi) this).field_h, 5592405);
          vb.a(var8, var9, ((bi) this).field_n, ((bi) this).field_h, var7);
          if (var11.field_y) {
            L3: {
              vb.g(var8, var9, ((bi) this).field_n + var8, var9 + ((bi) this).field_h, 1);
              vb.g(var8 + ((bi) this).field_n, var9, var8, ((bi) this).field_h + var9, 1);
              if (null == ((bi) this).field_b) {
                break L3;
              } else {
                var10 = ((bi) this).field_m + ((bi) this).field_n + ((bi) this).field_k;
                int discarded$4 = ((bi) this).field_b.a(param4.field_s, var10 + param4.field_v + param0, param4.field_m + param2 - -((bi) this).field_i, param4.field_r + (-((bi) this).field_m + -var10), -(((bi) this).field_m << -221141407) + param4.field_h, ((bi) this).field_e, ((bi) this).field_f, ((bi) this).field_a, ((bi) this).field_l, 0);
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null == ((bi) this).field_b) {
                break L4;
              } else {
                var10 = ((bi) this).field_m + ((bi) this).field_n + ((bi) this).field_k;
                int discarded$5 = ((bi) this).field_b.a(param4.field_s, var10 + param4.field_v + param0, param4.field_m + param2 - -((bi) this).field_i, param4.field_r + (-((bi) this).field_m + -var10), -(((bi) this).field_m << -221141407) + param4.field_h, ((bi) this).field_e, ((bi) this).field_f, ((bi) this).field_a, ((bi) this).field_l, 0);
                break L4;
              }
            }
            return;
          }
        } else {
          L5: {
            ((bi) this).field_a = -3;
            var7 = 5592405;
            vb.a(param4.field_v + param0, param2 - -param4.field_m, param4.field_r, param4.field_h, ((bi) this).field_d);
            if (!param3) {
              break L5;
            } else {
              var7 = 16777215;
              break L5;
            }
          }
          var8 = ((bi) this).field_k + (param0 + param4.field_v);
          var9 = ((bi) this).field_j + (param4.field_m + param2);
          vb.f(var8, var9, ((bi) this).field_n, ((bi) this).field_h, 5592405);
          vb.a(var8, var9, ((bi) this).field_n, ((bi) this).field_h, var7);
          if (!var11.field_y) {
            L6: {
              if (null == ((bi) this).field_b) {
                break L6;
              } else {
                var10 = ((bi) this).field_m + ((bi) this).field_n + ((bi) this).field_k;
                int discarded$6 = ((bi) this).field_b.a(param4.field_s, var10 + param4.field_v + param0, param4.field_m + param2 - -((bi) this).field_i, param4.field_r + (-((bi) this).field_m + -var10), -(((bi) this).field_m << -221141407) + param4.field_h, ((bi) this).field_e, ((bi) this).field_f, ((bi) this).field_a, ((bi) this).field_l, 0);
                break L6;
              }
            }
            return;
          } else {
            L7: {
              vb.g(var8, var9, ((bi) this).field_n + var8, var9 + ((bi) this).field_h, 1);
              vb.g(var8 + ((bi) this).field_n, var9, var8, ((bi) this).field_h + var9, 1);
              if (null == ((bi) this).field_b) {
                break L7;
              } else {
                var10 = ((bi) this).field_m + ((bi) this).field_n + ((bi) this).field_k;
                int discarded$7 = ((bi) this).field_b.a(param4.field_s, var10 + param4.field_v + param0, param4.field_m + param2 - -((bi) this).field_i, param4.field_r + (-((bi) this).field_m + -var10), -(((bi) this).field_m << -221141407) + param4.field_h, ((bi) this).field_e, ((bi) this).field_f, ((bi) this).field_a, ((bi) this).field_l, 0);
                break L7;
              }
            }
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        field_c = null;
    }

    bi(m param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((bi) this).field_a = 1;
        ((bi) this).field_l = 1;
        ((bi) this).field_f = param4;
        ((bi) this).field_m = param1;
        ((bi) this).field_b = param0;
        ((bi) this).field_n = param8;
        ((bi) this).field_h = param7;
        ((bi) this).field_e = param3;
        ((bi) this).field_i = param2;
        ((bi) this).field_k = param5;
        ((bi) this).field_d = param9;
        ((bi) this).field_j = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
