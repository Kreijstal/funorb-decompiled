/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static float field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 <= 96) {
          q.a(false, -77, -89, 87, 85);
        }
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$22 = 0;
        int fieldTemp$19 = 0;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int fieldTemp$13 = 0;
        int dupTemp$17 = 0;
        byte[][] arrayValue$18 = null;
        int fieldTemp$14 = 0;
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int dupTemp$2 = 0;
        byte[][] arrayValue$3 = null;
        int fieldTemp$4 = 0;
        int dupTemp$5 = 0;
        byte[][] arrayValue$6 = null;
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$10 = 0;
        int dupTemp$11 = 0;
        byte[][] arrayValue$12 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3_ref_byte__;
        int var3;
        byte[] var4;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime1Lifetime1;
        byte[] var3_ref_byte__Lifetime1;
        byte[] var3_ref_byte__Lifetime2;
        byte[] var3_ref_byte__Lifetime3;
        byte[] var4Lifetime1;
        byte[] var4Lifetime2;
        byte[] var4Lifetime3;
        byte[] var3_ref_byte__Lifetime4;
        byte[] var3_ref_byte__Lifetime5;
        byte[] var4Lifetime4;
        byte[] var4Lifetime5;
        byte[] var4Lifetime1Lifetime1;
        if (param0 == 100) {
          if (gg.field_Q > 0) {
            fieldTemp$22 = gg.field_Q - 1;
            gg.field_Q = gg.field_Q - 1;
            var2_ref_byte__ = qh.field_b[fieldTemp$22];
            qh.field_b[gg.field_Q] = null;
            return var2_ref_byte__;
          }
          var2 = 25 % ((param1 + 16) / 48);
          if (param0 != 5000) {
            if (param0 == 30000 &&
              lf.field_d > 0) {
              fieldTemp$19 = lf.field_d - 1;
              lf.field_d = lf.field_d - 1;
              var3_ref_byte__ = vf.field_c[fieldTemp$19];
              vf.field_c[lf.field_d] = null;
              return var3_ref_byte__;
            }
            if (null == ef.field_g) {
              return new byte[param0];
            }
            for (var3 = 0; ec.field_E.length > var3; var3++) {
              if (ec.field_E[var3] == param0 &&
                fb.field_f[var3] > 0) {
                dupTemp$20 = fb.field_f[var3] - 1;
                arrayValue$21 = ef.field_g[var3];
                fb.field_f[var3] = dupTemp$20;
                var4 = arrayValue$21[dupTemp$20];
                ef.field_g[var3][fb.field_f[var3]] = null;
                return var4;
              }
            }
            return new byte[param0];
          }
          if (pd.field_C > 0) {
            fieldTemp$13 = pd.field_C - 1;
            pd.field_C = pd.field_C - 1;
            var3_ref_byte__Lifetime4 = pe.field_a[fieldTemp$13];
            pe.field_a[pd.field_C] = null;
            return var3_ref_byte__Lifetime4;
          }
          if (param0 != 30000) {
            if (null == ef.field_g) {
              return new byte[param0];
            }
            for (var3Lifetime4 = 0; ec.field_E.length > var3Lifetime4; var3Lifetime4++) {
              if (ec.field_E[var3Lifetime4] == param0 &&
                fb.field_f[var3Lifetime4] > 0) {
                dupTemp$17 = fb.field_f[var3Lifetime4] - 1;
                arrayValue$18 = ef.field_g[var3Lifetime4];
                fb.field_f[var3Lifetime4] = dupTemp$17;
                var4Lifetime4 = arrayValue$18[dupTemp$17];
                ef.field_g[var3Lifetime4][fb.field_f[var3Lifetime4]] = null;
                return var4Lifetime4;
              }
            }
            return new byte[param0];
          }
          if (lf.field_d > 0) {
            fieldTemp$14 = lf.field_d - 1;
            lf.field_d = lf.field_d - 1;
            var3_ref_byte__Lifetime5 = vf.field_c[fieldTemp$14];
            vf.field_c[lf.field_d] = null;
            return var3_ref_byte__Lifetime5;
          }
          if (null == ef.field_g) {
            return new byte[param0];
          }
          for (var3Lifetime5 = 0; ec.field_E.length > var3Lifetime5; var3Lifetime5++) {
            if (ec.field_E[var3Lifetime5] == param0 &&
              fb.field_f[var3Lifetime5] > 0) {
              dupTemp$15 = fb.field_f[var3Lifetime5] - 1;
              arrayValue$16 = ef.field_g[var3Lifetime5];
              fb.field_f[var3Lifetime5] = dupTemp$15;
              var4Lifetime5 = arrayValue$16[dupTemp$15];
              ef.field_g[var3Lifetime5][fb.field_f[var3Lifetime5]] = null;
              return var4Lifetime5;
            }
          }
          return new byte[param0];
        }
        var2Lifetime1 = 25 % ((param1 + 16) / 48);
        if (param0 != 5000) {
          if (param0 != 30000) {
            if (null != ef.field_g) {
              for (var3Lifetime1 = 0; ec.field_E.length > var3Lifetime1; var3Lifetime1++) {
                if (ec.field_E[var3Lifetime1] == param0 &&
                  fb.field_f[var3Lifetime1] > 0) {
                  dupTemp$2 = fb.field_f[var3Lifetime1] - 1;
                  arrayValue$3 = ef.field_g[var3Lifetime1];
                  fb.field_f[var3Lifetime1] = dupTemp$2;
                  var4Lifetime1 = arrayValue$3[dupTemp$2];
                  ef.field_g[var3Lifetime1][fb.field_f[var3Lifetime1]] = null;
                  return var4Lifetime1;
                }
              }
            }
            return new byte[param0];
          }
          if (lf.field_d > 0) {
            fieldTemp$4 = lf.field_d - 1;
            lf.field_d = lf.field_d - 1;
            var3_ref_byte__Lifetime1 = vf.field_c[fieldTemp$4];
            vf.field_c[lf.field_d] = null;
            return var3_ref_byte__Lifetime1;
          }
          if (null != ef.field_g) {
            for (var3Lifetime1Lifetime1 = 0; ec.field_E.length > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
              if (ec.field_E[var3Lifetime1Lifetime1] == param0 &&
                fb.field_f[var3Lifetime1Lifetime1] > 0) {
                dupTemp$5 = fb.field_f[var3Lifetime1Lifetime1] - 1;
                arrayValue$6 = ef.field_g[var3Lifetime1Lifetime1];
                fb.field_f[var3Lifetime1Lifetime1] = dupTemp$5;
                var4Lifetime1Lifetime1 = arrayValue$6[dupTemp$5];
                ef.field_g[var3Lifetime1Lifetime1][fb.field_f[var3Lifetime1Lifetime1]] = null;
                return var4Lifetime1Lifetime1;
              }
            }
          }
          return new byte[param0];
        }
        if (pd.field_C > 0) {
          fieldTemp$7 = pd.field_C - 1;
          pd.field_C = pd.field_C - 1;
          var3_ref_byte__Lifetime2 = pe.field_a[fieldTemp$7];
          pe.field_a[pd.field_C] = null;
          return var3_ref_byte__Lifetime2;
        }
        if (param0 != 30000) {
          if (null != ef.field_g) {
            for (var3Lifetime2 = 0; ec.field_E.length > var3Lifetime2; var3Lifetime2++) {
              if (ec.field_E[var3Lifetime2] == param0 &&
                fb.field_f[var3Lifetime2] > 0) {
                dupTemp$8 = fb.field_f[var3Lifetime2] - 1;
                arrayValue$9 = ef.field_g[var3Lifetime2];
                fb.field_f[var3Lifetime2] = dupTemp$8;
                var4Lifetime2 = arrayValue$9[dupTemp$8];
                ef.field_g[var3Lifetime2][fb.field_f[var3Lifetime2]] = null;
                return var4Lifetime2;
              }
            }
          }
          return new byte[param0];
        }
        if (lf.field_d > 0) {
          fieldTemp$10 = lf.field_d - 1;
          lf.field_d = lf.field_d - 1;
          var3_ref_byte__Lifetime3 = vf.field_c[fieldTemp$10];
          vf.field_c[lf.field_d] = null;
          return var3_ref_byte__Lifetime3;
        }
        if (null != ef.field_g) {
          for (var3Lifetime3 = 0; ec.field_E.length > var3Lifetime3; var3Lifetime3++) {
            if (ec.field_E[var3Lifetime3] == param0 &&
              fb.field_f[var3Lifetime3] > 0) {
              dupTemp$11 = fb.field_f[var3Lifetime3] - 1;
              arrayValue$12 = ef.field_g[var3Lifetime3];
              fb.field_f[var3Lifetime3] = dupTemp$11;
              var4Lifetime3 = arrayValue$12[dupTemp$11];
              ef.field_g[var3Lifetime3][fb.field_f[var3Lifetime3]] = null;
              return var4Lifetime3;
            }
          }
        }
        return new byte[param0];
    }

    final static hj[] a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          return (hj[]) null;
        }
        return kk.a(3, 1, param1, 1, (byte) 123, param3, 1, param2, param4);
    }

    static {
        field_a = "Log in";
        field_c = "BEAM BLAST";
    }
}
