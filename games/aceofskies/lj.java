/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements ir {
    private int field_k;
    private int field_g;
    private hc field_l;
    private int field_o;
    private int field_h;
    static al[] field_c;
    private int field_i;
    static String field_e;
    static String field_a;
    private int field_m;
    private int field_b;
    private int field_j;
    private int field_f;
    private int field_d;
    private int field_n;

    final static int a(int param0, byte[] param1, int param2) {
        byte[] var4 = null;
        if (param0 > -117) {
          var4 = (byte[]) null;
          int discarded$2 = lj.a(-124, (byte[]) null, 84);
          return cl.a(0, param1, param2, (byte) -105);
        } else {
          return cl.a(0, param1, param2, (byte) -105);
        }
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sq var11 = null;
        ea stackIn_5_0 = null;
        ea stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        if (param1 == -7592) {
          L0: {
            if (param3 instanceof sq) {
              stackOut_4_0 = (ea) param3;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_5_0 = (ea) (Object) stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var11 = (sq) (sq) stackIn_5_0;
            if (var11 == null) {
              break L1;
            } else {
              param0 = param0 & ((sq) var11).field_u;
              break L1;
            }
          }
          L2: {
            var7 = 5592405;
            vp.b(param2 - -((ea) param3).field_p, param4 - -((ea) param3).field_h, ((ea) param3).field_q, ((ea) param3).field_n, ((lj) this).field_o);
            if (!param0) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          var8 = param2 - -((ea) param3).field_p + ((lj) this).field_n;
          var9 = ((lj) this).field_h + param4 + ((ea) param3).field_h;
          vp.d(var8, var9, ((lj) this).field_m, ((lj) this).field_j, 5592405);
          vp.b(var8, var9, ((lj) this).field_m, ((lj) this).field_j, var7);
          if (((sq) var11).field_s) {
            L3: {
              vp.f(var8, var9, var8 + ((lj) this).field_m, var9 - -((lj) this).field_j, 1);
              vp.f(var8 + ((lj) this).field_m, var9, var8, ((lj) this).field_j + var9, 1);
              if (null == ((lj) this).field_l) {
                break L3;
              } else {
                var10 = ((lj) this).field_m + (((lj) this).field_n - -((lj) this).field_f);
                int discarded$2 = ((lj) this).field_l.a(((ea) param3).field_f, param2 + ((ea) param3).field_p - -var10, param4 + (((ea) param3).field_h - -((lj) this).field_i), ((ea) param3).field_q - (((lj) this).field_f + var10), ((ea) param3).field_n - (((lj) this).field_f << -709448575), ((lj) this).field_g, ((lj) this).field_k, ((lj) this).field_b, ((lj) this).field_d, 0);
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null == ((lj) this).field_l) {
                break L4;
              } else {
                var10 = ((lj) this).field_m + (((lj) this).field_n - -((lj) this).field_f);
                int discarded$3 = ((lj) this).field_l.a(((ea) param3).field_f, param2 + ((ea) param3).field_p - -var10, param4 + (((ea) param3).field_h - -((lj) this).field_i), ((ea) param3).field_q - (((lj) this).field_f + var10), ((ea) param3).field_n - (((lj) this).field_f << -709448575), ((lj) this).field_g, ((lj) this).field_k, ((lj) this).field_b, ((lj) this).field_d, 0);
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
        field_c = null;
        field_a = null;
        field_e = null;
        if (!param0) {
            lj.a(107);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (-33 <= l.field_c) {
          ve.a((byte) 43, 0);
          if (param0 > 97) {
            return;
          } else {
            lj.a(true);
            return;
          }
        } else {
          L0: {
            var1 = l.field_c % 32;
            if (-1 == var1) {
              var1 = 32;
              break L0;
            } else {
              break L0;
            }
          }
          ve.a((byte) 43, l.field_c - var1);
          if (param0 > 97) {
            return;
          } else {
            lj.a(true);
            return;
          }
        }
    }

    lj(hc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((lj) this).field_b = 1;
        ((lj) this).field_d = 1;
        ((lj) this).field_m = param8;
        ((lj) this).field_h = param6;
        ((lj) this).field_n = param5;
        ((lj) this).field_f = param1;
        ((lj) this).field_g = param3;
        ((lj) this).field_o = param9;
        ((lj) this).field_j = param7;
        ((lj) this).field_l = param0;
        ((lj) this).field_k = param4;
        ((lj) this).field_i = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Confirm Email:";
        field_a = "Try again";
    }
}
