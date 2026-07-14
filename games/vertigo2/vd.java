/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_c;
    static int field_a;
    static mk field_b;
    static od field_d;

    final static void a(int param0, mp param1, int param2, int param3, int param4, mp param5) {
        qc.field_z = param3;
        al.field_z = param4;
        gl.field_l = param0;
        gl.field_i = param5;
        mq.field_v = param1;
        if (param2 != 1516482162) {
            field_a = -77;
        }
    }

    final static void a(ed param0, int param1) {
        int var2 = 0;
        Object var3 = null;
        br.field_U = param0.a((byte) -11) << -1983012731;
        if (param1 != 11591) {
          var3 = null;
          vd.a(-51, (mp) null, 54, -38, -24, (mp) null);
          var2 = param0.h(-11);
          af.field_E = (var2 & 7) << 1516482162;
          br.field_U = br.field_U + (var2 >> 879055395);
          af.field_E = af.field_E + (param0.a((byte) -11) << -2001037374);
          var2 = param0.h(-11);
          af.field_E = af.field_E + (var2 >> 83302502);
          bp.field_z = (var2 & 63) << -341765201;
          bp.field_z = bp.field_z + (param0.h(-11) << -26703417);
          var2 = param0.h(-11);
          kp.field_P = var2 << -582943088 & 65536;
          bp.field_z = bp.field_z + (var2 >> 978233921);
          kp.field_P = kp.field_P + param0.a((byte) -11);
          return;
        } else {
          var2 = param0.h(-11);
          af.field_E = (var2 & 7) << 1516482162;
          br.field_U = br.field_U + (var2 >> 879055395);
          af.field_E = af.field_E + (param0.a((byte) -11) << -2001037374);
          var2 = param0.h(-11);
          af.field_E = af.field_E + (var2 >> 83302502);
          bp.field_z = (var2 & 63) << -341765201;
          bp.field_z = bp.field_z + (param0.h(-11) << -26703417);
          var2 = param0.h(-11);
          kp.field_P = var2 << -582943088 & 65536;
          bp.field_z = bp.field_z + (var2 >> 978233921);
          kp.field_P = kp.field_P + param0.a((byte) -11);
          return;
        }
    }

    final static er[] a(byte param0) {
        er[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        var1 = new er[eo.field_m];
        if (param0 != 76) {
          return null;
        } else {
          var2 = 0;
          L0: while (true) {
            if (eo.field_m <= var2) {
              la.a((byte) 60);
              return var1;
            } else {
              var3 = mh.field_c[var2] * vi.field_w[var2];
              var4 = se.field_y[var2];
              var5 = new int[var3];
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new er(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], var5);
                  var2++;
                  continue L0;
                } else {
                  var5[var6] = in.field_c[b.a((int) var4[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        int var1 = 1 / ((param0 - -56) / 56);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading fonts";
    }
}
