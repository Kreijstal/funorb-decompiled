/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    static int field_c;
    static volatile boolean field_a;
    static String field_d;
    static int field_b;

    final static void a(boolean param0, boolean param1) {
        al.a(-47, param0);
        if (param1) {
            tq.a((byte) 89);
            wc.a(param0, true);
            return;
        }
        wc.a(param0, true);
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param2 >= 74) {
          if (param1) {
            qn.b(0, 0, qn.field_l, qn.field_g, 0, 192);
            if (!ArmiesOfGielinor.field_M) {
              nw.b((byte) 92, param1);
              return;
            } else {
              qn.b();
              nw.b((byte) 92, param1);
              return;
            }
          } else {
            qn.b();
            nw.b((byte) 92, param1);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param0);
        var2.b(param1 ^ 1, 1);
        var2.b(1, param1);
    }

    final static wk[] a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        wk var9 = null;
        wk var10 = null;
        wk var11 = null;
        wk var12 = null;
        wk var13 = null;
        Object var14 = null;
        int[] var15 = null;
        wk var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var18 = qn.field_d;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = qn.field_l;
        var8 = qn.field_g;
        var9 = new wk(param4, -(2 * param4) + param2);
        var9.b();
        qn.a(0, 0, param4, -(2 * param4) + param2, param0, param5);
        var10 = new wk(param4, param4);
        var10.b();
        if (param1) {
          return (wk[]) null;
        } else {
          L0: {
            qn.f(0, 0, param4, param4, param0);
            var11 = new wk(16, param4);
            var11.b();
            qn.f(0, 0, 16, param4, param0);
            var12 = new wk(param4, param4);
            var12.b();
            qn.f(0, 0, param4, param4, param5);
            var13 = new wk(16, param4);
            var13.b();
            qn.f(0, 0, 16, param4, param5);
            var14 = null;
            if ((param3 ^ -1) >= -1) {
              break L0;
            } else {
              var16 = new wk(16, 16);
              var14 = var16;
              var16.b();
              qn.f(0, 0, 16, 16, param3);
              break L0;
            }
          }
          qn.a(var18, var7, var8);
          return new wk[]{var10, var11, var10, var9, (wk) (var14), var9, var12, var13, var12};
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -84) {
            field_d = (String) null;
        }
    }

    static {
        field_a = false;
        field_d = "Private";
    }
}
