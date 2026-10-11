/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static int[] field_a;

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$22 = 0;
        int fieldTemp$19 = 0;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        int fieldTemp$18 = 0;
        int dupTemp$16 = 0;
        byte[][] arrayValue$17 = null;
        int fieldTemp$13 = 0;
        int dupTemp$2 = 0;
        byte[][] arrayValue$3 = null;
        int fieldTemp$6 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int fieldTemp$12 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int fieldTemp$11 = 0;
        int dupTemp$9 = 0;
        byte[][] arrayValue$10 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime1Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var3Lifetime4;
        byte[] var3Lifetime5;
        byte[] var3Lifetime1Lifetime1;
        if (param1 != -2) {
          return (byte[]) null;
        }
        if (param0 != 100) {
          if (5000 == param0) {
            if (0 < ae.field_L) {
              fieldTemp$22 = ae.field_L - 1;
              ae.field_L = ae.field_L - 1;
              var2_ref_byte__ = bg.field_j[fieldTemp$22];
              bg.field_j[ae.field_L] = null;
              return var2_ref_byte__;
            }
            if (param0 == 30000 &&
              uf.field_e > 0) {
              fieldTemp$19 = uf.field_e - 1;
              uf.field_e = uf.field_e - 1;
              var2_ref_byte__ = ng.field_q[fieldTemp$19];
              ng.field_q[uf.field_e] = null;
              return var2_ref_byte__;
            }
            if (rk.field_c == null) {
              return new byte[param0];
            }
            for (var2 = 0; ed.field_V.length > var2; var2++) {
              if (param0 == ed.field_V[var2] &&
                0 < im.field_d[var2]) {
                dupTemp$20 = im.field_d[var2] - 1;
                arrayValue$21 = rk.field_c[var2];
                im.field_d[var2] = dupTemp$20;
                var3 = arrayValue$21[dupTemp$20];
                rk.field_c[var2][im.field_d[var2]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          if (param0 != 30000) {
            if (rk.field_c == null) {
              return new byte[param0];
            }
            for (var2Lifetime4 = 0; ed.field_V.length > var2Lifetime4; var2Lifetime4++) {
              if (param0 == ed.field_V[var2Lifetime4] &&
                0 < im.field_d[var2Lifetime4]) {
                dupTemp$14 = im.field_d[var2Lifetime4] - 1;
                arrayValue$15 = rk.field_c[var2Lifetime4];
                im.field_d[var2Lifetime4] = dupTemp$14;
                var3Lifetime4 = arrayValue$15[dupTemp$14];
                rk.field_c[var2Lifetime4][im.field_d[var2Lifetime4]] = null;
                return var3Lifetime4;
              }
            }
            return new byte[param0];
          }
          if (uf.field_e > 0) {
            fieldTemp$18 = uf.field_e - 1;
            uf.field_e = uf.field_e - 1;
            var2_ref_byte__Lifetime5 = ng.field_q[fieldTemp$18];
            ng.field_q[uf.field_e] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (rk.field_c == null) {
            return new byte[param0];
          }
          for (var2Lifetime5 = 0; ed.field_V.length > var2Lifetime5; var2Lifetime5++) {
            if (param0 == ed.field_V[var2Lifetime5] &&
              0 < im.field_d[var2Lifetime5]) {
              dupTemp$16 = im.field_d[var2Lifetime5] - 1;
              arrayValue$17 = rk.field_c[var2Lifetime5];
              im.field_d[var2Lifetime5] = dupTemp$16;
              var3Lifetime5 = arrayValue$17[dupTemp$16];
              rk.field_c[var2Lifetime5][im.field_d[var2Lifetime5]] = null;
              return var3Lifetime5;
            }
          }
          return new byte[param0];
        }
        if (0 < nn.field_cb) {
          fieldTemp$13 = nn.field_cb - 1;
          nn.field_cb = nn.field_cb - 1;
          var2_ref_byte__Lifetime1 = d.field_f[fieldTemp$13];
          d.field_f[nn.field_cb] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (5000 != param0) {
          if (param0 != 30000) {
            if (rk.field_c == null) {
              return new byte[param0];
            }
            for (var2Lifetime1 = 0; ed.field_V.length > var2Lifetime1; var2Lifetime1++) {
              if (param0 == ed.field_V[var2Lifetime1] &&
                0 < im.field_d[var2Lifetime1]) {
                dupTemp$2 = im.field_d[var2Lifetime1] - 1;
                arrayValue$3 = rk.field_c[var2Lifetime1];
                im.field_d[var2Lifetime1] = dupTemp$2;
                var3Lifetime1 = arrayValue$3[dupTemp$2];
                rk.field_c[var2Lifetime1][im.field_d[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param0];
          }
          if (uf.field_e > 0) {
            fieldTemp$6 = uf.field_e - 1;
            uf.field_e = uf.field_e - 1;
            var2_ref_byte__Lifetime2 = ng.field_q[fieldTemp$6];
            ng.field_q[uf.field_e] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (rk.field_c == null) {
            return new byte[param0];
          }
          for (var2Lifetime1Lifetime1 = 0; ed.field_V.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
            if (param0 == ed.field_V[var2Lifetime1Lifetime1] &&
              0 < im.field_d[var2Lifetime1Lifetime1]) {
              dupTemp$4 = im.field_d[var2Lifetime1Lifetime1] - 1;
              arrayValue$5 = rk.field_c[var2Lifetime1Lifetime1];
              im.field_d[var2Lifetime1Lifetime1] = dupTemp$4;
              var3Lifetime1Lifetime1 = arrayValue$5[dupTemp$4];
              rk.field_c[var2Lifetime1Lifetime1][im.field_d[var2Lifetime1Lifetime1]] = null;
              return var3Lifetime1Lifetime1;
            }
          }
          return new byte[param0];
        }
        if (0 < ae.field_L) {
          fieldTemp$12 = ae.field_L - 1;
          ae.field_L = ae.field_L - 1;
          var2_ref_byte__Lifetime3 = bg.field_j[fieldTemp$12];
          bg.field_j[ae.field_L] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (param0 != 30000) {
          if (rk.field_c == null) {
            return new byte[param0];
          }
          for (var2Lifetime2 = 0; ed.field_V.length > var2Lifetime2; var2Lifetime2++) {
            if (param0 == ed.field_V[var2Lifetime2] &&
              0 < im.field_d[var2Lifetime2]) {
              dupTemp$7 = im.field_d[var2Lifetime2] - 1;
              arrayValue$8 = rk.field_c[var2Lifetime2];
              im.field_d[var2Lifetime2] = dupTemp$7;
              var3Lifetime2 = arrayValue$8[dupTemp$7];
              rk.field_c[var2Lifetime2][im.field_d[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (uf.field_e > 0) {
          fieldTemp$11 = uf.field_e - 1;
          uf.field_e = uf.field_e - 1;
          var2_ref_byte__Lifetime4 = ng.field_q[fieldTemp$11];
          ng.field_q[uf.field_e] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (rk.field_c == null) {
          return new byte[param0];
        }
        for (var2Lifetime3 = 0; ed.field_V.length > var2Lifetime3; var2Lifetime3++) {
          if (param0 == ed.field_V[var2Lifetime3] &&
            0 < im.field_d[var2Lifetime3]) {
            dupTemp$9 = im.field_d[var2Lifetime3] - 1;
            arrayValue$10 = rk.field_c[var2Lifetime3];
            im.field_d[var2Lifetime3] = dupTemp$9;
            var3Lifetime3 = arrayValue$10[dupTemp$9];
            rk.field_c[var2Lifetime3][im.field_d[var2Lifetime3]] = null;
            return var3Lifetime3;
          }
        }
        return new byte[param0];
    }

    final static void a(byte param0) {
        ph.field_w = kb.field_q.g((byte) 81);
        if (param0 < 18) {
          return;
        }
        CharSequence var2 = (CharSequence) ((Object) ph.field_w);
        ik.field_f = cc.a(var2, (byte) 105);
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          pe.a(80, (byte) 40);
        }
    }

    static {
        field_a = new int[8192];
    }
}
