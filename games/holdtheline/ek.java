/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek implements dh {
    private int field_k;
    private int field_e;
    static String field_q;
    private int field_g;
    static int field_o;
    static String field_u;
    private qi field_h;
    private int field_t;
    private int field_r;
    private int field_s;
    static String field_w;
    private int field_p;
    static int field_x;
    static String field_d;
    static hj field_m;
    static int field_l;
    private int field_f;
    static int[] field_n;
    private int field_i;
    static int field_j;
    private int field_b;
    static float[] field_c;
    private int field_a;
    static String field_v;

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sj var11 = null;
        n stackIn_3_0 = null;
        n stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof sj) {
            stackOut_2_0 = (n) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (n) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (sj) (Object) stackIn_3_0;
          if (var11 == null) {
            break L1;
          } else {
            param0 = param0 & var11.field_D;
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
        if (param2 < -48) {
          tc.f(param1 + param3.field_k, param3.field_o + param4, param3.field_x, param3.field_u, ((ek) this).field_k);
          var8 = ((ek) this).field_t + (param3.field_k + param1);
          var9 = param3.field_o + param4 - -((ek) this).field_g;
          tc.e(var8, var9, ((ek) this).field_s, ((ek) this).field_i, 5592405);
          tc.f(var8, var9, ((ek) this).field_s, ((ek) this).field_i, var7);
          if (var11.field_B) {
            L3: {
              tc.d(var8, var9, var8 - -((ek) this).field_s, ((ek) this).field_i + var9, 1);
              tc.d(((ek) this).field_s + var8, var9, var8, ((ek) this).field_i + var9, 1);
              if (((ek) this).field_h != null) {
                var10 = ((ek) this).field_r + ((ek) this).field_s + ((ek) this).field_t;
                int discarded$2 = ((ek) this).field_h.a(param3.field_q, param1 - (-param3.field_k + -var10), ((ek) this).field_f + param3.field_o + param4, param3.field_x + (-var10 + -((ek) this).field_r), -(((ek) this).field_r << -663333695) + param3.field_u, ((ek) this).field_a, ((ek) this).field_p, ((ek) this).field_e, ((ek) this).field_b, 0);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (((ek) this).field_h != null) {
                var10 = ((ek) this).field_r + ((ek) this).field_s + ((ek) this).field_t;
                int discarded$3 = ((ek) this).field_h.a(param3.field_q, param1 - (-param3.field_k + -var10), ((ek) this).field_f + param3.field_o + param4, param3.field_x + (-var10 + -((ek) this).field_r), -(((ek) this).field_r << -663333695) + param3.field_u, ((ek) this).field_a, ((ek) this).field_p, ((ek) this).field_e, ((ek) this).field_b, 0);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_c = null;
        field_u = null;
        field_q = null;
        field_v = null;
        field_w = null;
        if (!param0) {
          field_w = null;
          field_d = null;
          field_m = null;
          return;
        } else {
          field_d = null;
          field_m = null;
          return;
        }
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        if ((param1 ^ -1) == -1025) {
          dd.a(param0 + 7091, param5, param2, param3, param4);
          return;
        } else {
          param5 = param5 - ((-1024 + param1) * param2.field_y >> 1924542539);
          param3 = param3 - (param2.field_s * (-1024 + param1) >> -1180991861);
          var6 = param0 + tc.field_j * param5 - -param3;
          var8 = 0;
          var9 = 0;
          var10 = param1 * param2.field_y >> -1267855414;
          L0: while (true) {
            if (var10 <= 0) {
              return;
            } else {
              var8 = param2.field_s * (var9 >> 1126547082) << 118556810;
              var7 = var6 - 1;
              var11 = param1 * param2.field_s >> -760114742;
              L1: while (true) {
                if (0 >= var11) {
                  var9 = var9 + 1048576 / param1;
                  var6 = var6 + tc.field_j;
                  var10--;
                  continue L0;
                } else {
                  L2: {
                    if (-1 != (param2.field_z[var8 >> 1353800298] ^ -1)) {
                      if (16777215 == param2.field_z[var8 >> 420158826]) {
                        var7++;
                        tc.field_b[var7] = param4;
                        break L2;
                      } else {
                        var7++;
                        tc.field_b[var7] = param2.field_z[var8 >> 952050282];
                        break L2;
                      }
                    } else {
                      var7++;
                      break L2;
                    }
                  }
                  var8 = var8 + 1048576 / param1;
                  var11--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    ek(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ek) this).field_e = 1;
        ((ek) this).field_b = 1;
        ((ek) this).field_h = param0;
        ((ek) this).field_t = param5;
        ((ek) this).field_i = param7;
        ((ek) this).field_s = param8;
        ((ek) this).field_g = param6;
        ((ek) this).field_p = param4;
        ((ek) this).field_f = param2;
        ((ek) this).field_r = param1;
        ((ek) this).field_k = param9;
        ((ek) this).field_a = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "To server list";
        field_q = "Loading";
        field_d = "From only <%0>/month";
        field_j = 500;
        field_w = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = new float[]{1.0f, 4.0f, 10.0f, 50.0f};
        field_v = "Create";
    }
}
