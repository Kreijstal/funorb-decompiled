/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm {
    static hg field_c;
    static String field_a;
    static nl field_b;

    abstract ug b(byte param0);

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(boolean param0) {
        if (param0) {
            return;
        }
        if (lf.field_S > 10) {
            an.a(-10 + lf.field_S, (byte) 120);
        } else {
            an.a(0, (byte) 96);
        }
    }

    public static void a(byte param0) {
        int var1 = 100 / ((param0 - 19) / 62);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static c a(int param0, um param1, String param2, um param3, String param4) {
        int var5 = param1.a(param4, param0 ^ param0);
        int var6 = param1.a(param2, param0 + 7, var5);
        return ig.a(var6, param3, -122, var5, param1);
    }

    abstract void a(p param0, byte param1);

    final static void a(lh param0, um param1, int param2) {
        int var3 = 0;
        j var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        var9 = Chess.field_G;
        var3 = se.field_V;
        rh.field_c = new ci(0L, (ci) null);
        if (param1 == null) {
          var10 = null;
          fg.a((Throwable) null, (byte) -77, "QC1");
          return;
        } else {
          param1.field_f = 0;
          param1.field_k = false;
          ak.field_u = new kj(var3, param1, param1);
          oa.field_b = new qc(var3, param1, param1, (ui) (Object) new th());
          var4 = p.a(param2 + -1529624);
          if (var4 != null) {
            dh.a(121, var4);
            var12 = null;
            vj.field_g = aj.a(1513239, 65793, 2245737, 65793, 0, 5138823, (lh) null, 4020342, 65793, (byte) 116, param2, 8947848, 1127256);
            wk.field_c = aj.a(0, 0, 0, 0, 16764006, 0, param0, 0, 0, (byte) -95, 0, 0, 0);
            va.field_d = aj.a(0, 0, 0, 0, 16777215, 0, param0, 0, 0, (byte) -28, 0, 0, 0);
            var5 = wb.field_h;
            var6 = wb.field_c;
            var16 = wb.field_d;
            mc.field_b = new km(10, 14);
            mc.field_b.e();
            var8 = 2;
            L0: while (true) {
              if (var8 >= 7) {
                wb.a(var16, var5, var6);
                ng.field_c = vc.a((byte) 88, vj.field_g, va.field_d, wk.field_c, var4);
                rh.field_c.field_I = new jc();
                return;
              } else {
                wb.f(var8, var8 - -1, 14 + -(var8 << -1438167807), 16777215);
                var8++;
                continue L0;
              }
            }
          } else {
            var11 = null;
            fg.a((Throwable) null, (byte) -77, "QC2");
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new hg(15, 0, 1, 0);
        field_a = "Fastest";
    }
}
