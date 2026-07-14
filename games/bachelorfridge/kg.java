/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_c;
    volatile boolean field_f;
    static sna field_e;
    static sna field_a;
    java.awt.Frame field_g;
    static sna field_d;
    static int field_b;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        if (param0 != 36) {
            Object var2 = null;
            kg.a((vr) null, -47);
        }
        field_d = null;
        field_c = null;
        field_a = null;
        field_e = null;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((kg) this).field_f = true;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7 = null;
        if ((gk.field_d ^ -1) != param4) {
            var7 = ama.field_k;
        } else {
            var7 = oka.field_t;
        }
        jna.a(param1, param2, -1, param3, var7, param5, param6, param0);
    }

    final void a(int param0, ht param1) {
        int var3 = 80 / ((-61 - param0) / 41);
        gv.a(-110, param1, ((kg) this).field_g);
    }

    kg() {
    }

    final static void a(vr param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ma var5 = null;
        int[] var6 = null;
        int var7 = 0;
        pf var8 = null;
        int var9 = 0;
        pf var10 = null;
        var7 = BachelorFridge.field_y;
        var8 = new pf(param0.a((byte) 123, "", "logo.fo3d"));
        var10 = var8;
        var3 = var10.b(16711935);
        var10.m(1);
        ld.field_o = ni.a((byte) 41, var10);
        bd.field_l = new int[var3][];
        gaa.field_i = new ma[var3];
        if (param1 >= 110) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3) {
              var10.i((byte) -86);
              var9 = 0;
              var4 = var9;
              L1: while (true) {
                if (var3 <= var9) {
                  return;
                } else {
                  var5 = gaa.field_i[var9];
                  var5.a(0, 6, 6, 6, 1);
                  var5.b(117);
                  var6 = new int[]{var5.field_u + var5.field_A >> 1139542017, var5.field_G - -var5.field_B >> -1853191519, var5.field_q + var5.field_I >> 882145889};
                  bd.field_l[var9] = var6;
                  var5.a(-var6[2], 0, -var6[1], -var6[0]);
                  var9++;
                  continue L1;
                }
              }
            } else {
              gaa.field_i[var4] = sa.a(false, var8);
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Friends";
    }
}
