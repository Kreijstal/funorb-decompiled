/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    static vo field_a;
    static int field_b;
    static int field_c;

    final static void a(int param0, int param1, mf param2, mf param3, int param4, int param5) {
        lb.field_Y = param0;
        qb.field_i = param4;
        dd.field_b = param2;
        nb.field_m = param1;
        if (param5 != -386) {
            return;
        }
        qi.field_G = param3;
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -26) {
            Object var2 = null;
            ro.a(66, -67, (mf) null, (mf) null, -121, 83);
        }
    }

    final static vn[] a(byte param0) {
        vn[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var14 = null;
        int[] var15 = null;
        var7 = ZombieDawn.field_J;
        var1 = new vn[t.field_h];
        if (param0 != 110) {
          field_a = null;
          var2 = 0;
          L0: while (true) {
            if (t.field_h <= var2) {
              no.f((byte) -111);
              return var1;
            } else {
              var3 = uf.field_n[var2] * bn.field_c[var2];
              var12 = vj.field_m[var2];
              var13 = new int[var3];
              var9 = var13;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new vn(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var13);
                  var2++;
                  continue L0;
                } else {
                  var5[var6] = j.field_a[eg.a((int) var12[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } else {
          var2 = 0;
          L2: while (true) {
            if (t.field_h <= var2) {
              no.f((byte) -111);
              return var1;
            } else {
              var3 = uf.field_n[var2] * bn.field_c[var2];
              var14 = vj.field_m[var2];
              var15 = new int[var3];
              var11 = var15;
              var5 = var11;
              var6 = 0;
              L3: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new vn(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var15);
                  var2++;
                  continue L2;
                } else {
                  var5[var6] = j.field_a[eg.a((int) var14[var6], 255)];
                  var6++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new vo();
        field_b = 10;
    }
}
