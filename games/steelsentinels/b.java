/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b implements qk {
    static String field_g;
    static wk[] field_q;
    private int field_d;
    static String field_p;
    private int field_s;
    static String field_i;
    static boolean field_f;
    private mi field_o;
    private int field_m;
    private int field_k;
    static wk[] field_n;
    private int field_h;
    static String field_j;
    static int field_c;
    static String field_l;
    static int field_b;
    static gh field_e;
    private int field_r;
    private int field_a;

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nl var14 = null;
        lh stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        lh stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof nl)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (lh) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (lh) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (nl) (Object) stackIn_3_0;
          pb.a(param0 - -param1.field_o, param4 + param1.field_z, param1.field_x, param1.field_E, ((b) this).field_m);
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 != -30) {
          return;
        } else {
          L2: {
            var7 = var14.field_cb + (param1.field_o + param0);
            var8 = var14.field_Y + (param4 - -param1.field_z);
            pb.e(var7, var8, var14.field_ab, ((b) this).field_a);
            if (-1 == var14.field_W) {
              break L2;
            } else {
              var9 = (double)var14.field_W * 3.141592653589793 * 2.0 / (double)var14.field_bb;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_ab);
              var12 = (int)(Math.cos(var9) * (double)var14.field_ab);
              pb.e(var11 + var7, var12 + var8, 1, ((b) this).field_k);
              break L2;
            }
          }
          L3: {
            pb.e(var7, var8, 2, 1);
            var9 = (double)var14.field_eb * 3.141592653589793 * 2.0 / (double)var14.field_bb;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_ab);
            var12 = (int)(Math.cos(var9) * (double)var14.field_ab);
            pb.d(var7, var8, var7 + var11, var12 + var8, 1);
            if (null == ((b) this).field_o) {
              break L3;
            } else {
              var13 = ((b) this).field_s + var14.field_cb - -var14.field_ab;
              int discarded$1 = ((b) this).field_o.a(param1.field_y, param0 + param1.field_o + var13, ((b) this).field_h + param4 + param1.field_z, -var13 - ((b) this).field_s + param1.field_x, param1.field_E - (((b) this).field_s << -1020367199), ((b) this).field_r, ((b) this).field_d, 1, 1, 0);
              break L3;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1) {
        kj var2 = null;
        int var3 = 0;
        var2 = mm.field_g;
        var2.a(param1, (byte) -117);
        var2.field_p = var2.field_p + 1;
        var3 = var2.field_p;
        var2.a((byte) 113, 2);
        var2.a(rb.field_i.length, (byte) -122, 0, rb.field_i);
        var2.a((byte) 125, fi.field_l);
        var2.a((byte) 110, nb.field_L);
        var2.a(ti.field_s.length, (byte) -122, 0, ti.field_s);
        var2.b((byte) 123, var2.field_p - var3);
        if (param0 >= -21) {
          field_g = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1) {
        kj var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 123, 2);
        var2.a((byte) 112, 4);
        var2.a((byte) 127, nd.a((byte) 56));
        int var3 = -47 % ((param1 - -35) / 61);
    }

    public static void a(int param0) {
        field_j = null;
        field_l = null;
        field_i = null;
        field_g = null;
        field_p = null;
        field_e = null;
        field_q = null;
        field_n = null;
        if (param0 != 0) {
            field_p = null;
        }
    }

    final static e a(boolean param0, String param1) {
        if (!param0) {
          if (jn.field_b != nj.field_ab) {
            if (sn.field_p == jn.field_b) {
              if (!param1.equals((Object) (Object) kh.field_z)) {
                jn.field_b = nj.field_ab;
                vl.field_x = null;
                kh.field_z = param1;
                return null;
              } else {
                jn.field_b = mm.field_e;
                return vl.field_x;
              }
            } else {
              jn.field_b = nj.field_ab;
              vl.field_x = null;
              kh.field_z = param1;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_n = null;
          if (jn.field_b != nj.field_ab) {
            if (sn.field_p == jn.field_b) {
              if (!param1.equals((Object) (Object) kh.field_z)) {
                jn.field_b = nj.field_ab;
                vl.field_x = null;
                kh.field_z = param1;
                return null;
              } else {
                jn.field_b = mm.field_e;
                return vl.field_x;
              }
            } else {
              jn.field_b = nj.field_ab;
              vl.field_x = null;
              kh.field_z = param1;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    b(mi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((b) this).field_m = param7;
        ((b) this).field_h = param2;
        ((b) this).field_s = param1;
        ((b) this).field_o = param0;
        ((b) this).field_r = param3;
        ((b) this).field_k = param6;
        ((b) this).field_d = param4;
        ((b) this).field_a = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new wk[3];
        field_j = "Off";
        field_p = "S";
        field_l = "Complete three training missions to unlock your first sentinel.";
        field_i = "Research into <col=00ffff>energy shields</col> is needed before the <%0> can be engineered.";
        field_c = 500;
        field_f = false;
        field_b = 67;
    }
}
