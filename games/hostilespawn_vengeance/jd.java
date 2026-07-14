/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends am {
    int field_u;
    int field_p;
    static bd field_h;
    int field_t;
    static String field_x;
    static bd[] field_o;
    static int field_l;
    static int field_q;
    int field_r;
    static vm field_s;
    int field_j;
    static String[] field_v;
    int field_m;
    int[] field_w;
    static String field_i;
    long field_k;
    int field_n;

    final static int[] a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = ni.a(param1, param2 ^ -8114);
        var4 = of.a((byte) 75, param1);
        var5 = ni.a(param0, 8191);
        var6 = of.a((byte) -81, param0);
        if (param2 != -79) {
          field_l = -78;
          var7 = (int)((long)var5 * (long)var3 >> -1919457136);
          var8 = (int)((long)var6 * (long)var3 >> -321886960);
          var9 = (int)((long)var5 * (long)var4 >> 1745029456);
          var10 = (int)((long)var6 * (long)var4 >> 881464016);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var7 = (int)((long)var5 * (long)var3 >> -1919457136);
          var8 = (int)((long)var6 * (long)var3 >> -321886960);
          var9 = (int)((long)var5 * (long)var4 >> 1745029456);
          var10 = (int)((long)var6 * (long)var4 >> 881464016);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final static void a(int param0, int param1) {
        am var2 = null;
        int var3 = 0;
        Object var4 = null;
        m var5 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var5 = (m) (Object) wk.field_g.g(-107);
        L0: while (true) {
          if (var5 == null) {
            if (param1 == 65535) {
              var2 = ve.field_b.g(-68);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  pe.a((byte) 51, param0);
                  var2 = ve.field_b.a(param1 ^ 52851);
                  continue L1;
                }
              }
            } else {
              var4 = null;
              bd[] discarded$2 = jd.a((byte) 125, (String) null, (gb) null, (String) null);
              var2 = ve.field_b.g(-68);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  pe.a((byte) 51, param0);
                  var2 = ve.field_b.a(param1 ^ 52851);
                  continue L2;
                }
              }
            }
          } else {
            fj.a(param0, var5, true);
            var5 = (m) (Object) wk.field_g.a(12684);
            continue L0;
          }
        }
    }

    jd(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((jd) this).field_n = param3;
        ((jd) this).field_t = param0;
        ((jd) this).field_r = param2;
        ((jd) this).field_j = param1;
        ((jd) this).field_m = param5;
        ((jd) this).field_w = param6;
        ((jd) this).field_p = param4;
        tf.field_c = tf.field_c + 1;
        ((jd) this).field_u = 65535 & tf.field_c;
    }

    final static bd[] a(byte param0, String param1, gb param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 33) {
          jd.c(45);
          var4 = param2.a((byte) -2, param1);
          var5 = param2.a(var4, param3, -1);
          return mg.a(param2, var4, var5, false);
        } else {
          var4 = param2.a((byte) -2, param1);
          var5 = param2.a(var4, param3, -1);
          return mg.a(param2, var4, var5, false);
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_h = null;
        field_x = null;
        field_s = null;
        field_o = null;
        if (param0 != 0) {
          field_q = -13;
          field_v = null;
          return;
        } else {
          field_v = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Mouse over an icon for details";
        field_x = "CLICK TO SKIP";
    }
}
