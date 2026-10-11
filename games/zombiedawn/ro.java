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
        try {
          qi.field_G = param3;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ro.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -26) {
          mf var2 = (mf) null;
          ro.a(66, -67, (mf) null, (mf) null, -121, 83);
        }
    }

    final static vn[] a(byte param0) {
        byte[] var11 = null;
        byte[] var10 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        vn[] var1 = new vn[t.field_h];
        int[] var5Lifetime1;
        int var2Lifetime1;
        int var6Lifetime1;
        int var3Lifetime1;
        if (param0 == 110) {
          for (var2 = 0; t.field_h > var2; var2++) {
            var3 = uf.field_n[var2] * bn.field_c[var2];
            var11 = vj.field_m[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
              var5[var6] = j.field_a[eg.a((int) var11[var6], 255)];
            }
            var1[var2] = new vn(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var5);
          }
          no.f((byte) -111);
          return var1;
        }
        field_a = (vo) null;
        for (var2Lifetime1 = 0; t.field_h > var2Lifetime1; var2Lifetime1++) {
          var3Lifetime1 = uf.field_n[var2Lifetime1] * bn.field_c[var2Lifetime1];
          var10 = vj.field_m[var2Lifetime1];
          var5Lifetime1 = new int[var3Lifetime1];
          for (var6Lifetime1 = 0; var3Lifetime1 > var6Lifetime1; var6Lifetime1++) {
            var5Lifetime1[var6Lifetime1] = j.field_a[eg.a((int) var10[var6Lifetime1], 255)];
          }
          var1[var2Lifetime1] = new vn(gl.field_F, kd.field_pb, sl.field_d[var2Lifetime1], bo.field_o[var2Lifetime1], bn.field_c[var2Lifetime1], uf.field_n[var2Lifetime1], var5Lifetime1);
        }
        no.f((byte) -111);
        return var1;
    }

    static {
        field_a = new vo();
        field_b = 10;
    }
}
