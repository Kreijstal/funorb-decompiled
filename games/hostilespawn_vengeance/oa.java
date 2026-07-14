/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_j;
    static bd[] field_m;
    static wm field_b;
    static int[] field_c;
    static nd field_g;
    static String field_h;
    static je field_k;
    static int field_f;
    static bd field_i;
    static p field_d;
    static int field_a;
    static kk field_l;
    static bd field_e;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 32) {
          return;
        } else {
          field_i = null;
          field_c = null;
          field_j = null;
          field_m = null;
          field_e = null;
          field_b = null;
          field_l = null;
          field_g = null;
          field_k = null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0, int param1, p param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var6 = param3 << 2146270914;
        var7 = param1 << -1619765406;
        var12 = param2.field_c;
        var14 = 25.0;
        var16 = var12 * 3.141592653589793 / 128.0;
        var18 = Math.sin(var16) * -var14;
        var20 = Math.cos(var16) * -var14;
        var4 = (int)(-var18 + (double)var6);
        var8 = 8;
        if (param0 != -17652) {
          field_i = null;
          var10 = 1;
          var5 = (int)(-var20 + (double)var7);
          var11 = 1;
          var9 = 16;
          var22 = 200 * (-param2.field_e + 32) / 32;
          km.a((byte) var10, var7, var5, ni.field_c, var9, var6, (byte) var11, param0 + 17752, var4, var22, var8);
          var23 = (int)((double)var8 / 1.3);
          var24 = (int)((double)var9 / 1.3);
          bh.a((byte) var10, HostileSpawn.field_E, (byte) var11, var23, var4, var5, var7, var24, var22, var6, 9233);
          return;
        } else {
          var10 = 1;
          var5 = (int)(-var20 + (double)var7);
          var11 = 1;
          var9 = 16;
          var22 = 200 * (-param2.field_e + 32) / 32;
          km.a((byte) var10, var7, var5, ni.field_c, var9, var6, (byte) var11, param0 + 17752, var4, var22, var8);
          var23 = (int)((double)var8 / 1.3);
          var24 = (int)((double)var9 / 1.3);
          bh.a((byte) var10, HostileSpawn.field_E, (byte) var11, var23, var4, var5, var7, var24, var22, var6, 9233);
          return;
        }
    }

    final static jd a(int[] param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        jd var9 = null;
        if (param5) {
          return null;
        } else {
          var9 = new jd(param2, param6, param4, param3, param7, param8, param0);
          ib.field_a.a((am) (Object) var9, 117);
          ea.a(var9, param1, 62);
          return var9;
        }
    }

    final static vb a(byte param0, String param1) {
        String var2 = null;
        int var3 = 0;
        vb var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (null != n.field_t) {
          L0: {
            var3 = -23 / ((34 - param0) / 41);
            var7 = (CharSequence) (Object) param1;
            var2 = mf.a(false, var7);
            if (var2 == null) {
              var2 = (String) (Object) var7;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = (vb) (Object) n.field_t.a((long)var2.hashCode(), -30828);
          L1: while (true) {
            if (var4 != null) {
              L2: {
                var8 = (CharSequence) (Object) var4.field_Ib;
                var5 = mf.a(false, var8);
                if (var5 != null) {
                  break L2;
                } else {
                  var5 = var4.field_Ib;
                  break L2;
                }
              }
              if (var5.equals((Object) (Object) var2)) {
                return var4;
              } else {
                var4 = (vb) (Object) n.field_t.a(83);
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Total time: <col=ffffff>";
        field_c = new int[8192];
        field_h = "More suggestions";
        field_g = new nd(14, 0, 4, 1);
        field_k = new je();
        field_d = new p();
        field_a = 0;
    }
}
