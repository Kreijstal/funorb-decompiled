/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static vh field_b;
    static String field_d;
    static tf field_a;
    static tf[] field_c;

    final static ak a(int param0) {
        if (param0 != 0) {
          return (ak) null;
        }
        return jm.field_b.field_Fb;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        int fieldTemp$14 = 0;
        int dupTemp$12 = 0;
        byte[][] arrayValue$13 = null;
        int fieldTemp$8 = 0;
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$7 = 0;
        int dupTemp$5 = 0;
        byte[][] arrayValue$6 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime3;
        if (100 != param1) {
          if (~param1 == param0 &&
            fa.field_c > 0) {
            fieldTemp$9 = fa.field_c - 1;
            fa.field_c = fa.field_c - 1;
            var2_ref_byte__ = db.field_S[fieldTemp$9];
            db.field_S[fa.field_c] = null;
            return var2_ref_byte__;
          }
          if (param1 != 30000) {
            if (null == jd.field_o) {
              return new byte[param1];
            }
            for (var2 = 0; an.field_c.length > var2; var2++) {
              if (param1 == an.field_c[var2] &&
                f.field_p[var2] > 0) {
                dupTemp$10 = f.field_p[var2] - 1;
                arrayValue$11 = jd.field_o[var2];
                f.field_p[var2] = dupTemp$10;
                var3 = arrayValue$11[dupTemp$10];
                jd.field_o[var2][f.field_p[var2]] = null;
                return var3;
              }
            }
            return new byte[param1];
          }
          if (0 < jd.field_n) {
            fieldTemp$14 = jd.field_n - 1;
            jd.field_n = jd.field_n - 1;
            var2_ref_byte__Lifetime4 = pc.field_w[fieldTemp$14];
            pc.field_w[jd.field_n] = null;
            return var2_ref_byte__Lifetime4;
          }
          if (null == jd.field_o) {
            return new byte[param1];
          }
          for (var2Lifetime3 = 0; an.field_c.length > var2Lifetime3; var2Lifetime3++) {
            if (param1 == an.field_c[var2Lifetime3] &&
              f.field_p[var2Lifetime3] > 0) {
              dupTemp$12 = f.field_p[var2Lifetime3] - 1;
              arrayValue$13 = jd.field_o[var2Lifetime3];
              f.field_p[var2Lifetime3] = dupTemp$12;
              var3Lifetime3 = arrayValue$13[dupTemp$12];
              jd.field_o[var2Lifetime3][f.field_p[var2Lifetime3]] = null;
              return var3Lifetime3;
            }
          }
          return new byte[param1];
        }
        if (0 < fb.field_Hb) {
          fieldTemp$8 = fb.field_Hb - 1;
          fb.field_Hb = fb.field_Hb - 1;
          var2_ref_byte__Lifetime1 = sc.field_e[fieldTemp$8];
          sc.field_e[fb.field_Hb] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (~param1 == param0 &&
          fa.field_c > 0) {
          fieldTemp$2 = fa.field_c - 1;
          fa.field_c = fa.field_c - 1;
          var2_ref_byte__Lifetime2 = db.field_S[fieldTemp$2];
          db.field_S[fa.field_c] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param1 != 30000) {
          if (null == jd.field_o) {
            return new byte[param1];
          }
          for (var2Lifetime1 = 0; an.field_c.length > var2Lifetime1; var2Lifetime1++) {
            if (param1 == an.field_c[var2Lifetime1] &&
              f.field_p[var2Lifetime1] > 0) {
              dupTemp$3 = f.field_p[var2Lifetime1] - 1;
              arrayValue$4 = jd.field_o[var2Lifetime1];
              f.field_p[var2Lifetime1] = dupTemp$3;
              var3Lifetime1 = arrayValue$4[dupTemp$3];
              jd.field_o[var2Lifetime1][f.field_p[var2Lifetime1]] = null;
              return var3Lifetime1;
            }
          }
          return new byte[param1];
        }
        if (0 < jd.field_n) {
          fieldTemp$7 = jd.field_n - 1;
          jd.field_n = jd.field_n - 1;
          var2_ref_byte__Lifetime3 = pc.field_w[fieldTemp$7];
          pc.field_w[jd.field_n] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (null == jd.field_o) {
          return new byte[param1];
        }
        for (var2Lifetime2 = 0; an.field_c.length > var2Lifetime2; var2Lifetime2++) {
          if (param1 == an.field_c[var2Lifetime2] &&
            f.field_p[var2Lifetime2] > 0) {
            dupTemp$5 = f.field_p[var2Lifetime2] - 1;
            arrayValue$6 = jd.field_o[var2Lifetime2];
            f.field_p[var2Lifetime2] = dupTemp$5;
            var3Lifetime2 = arrayValue$6[dupTemp$5];
            jd.field_o[var2Lifetime2][f.field_p[var2Lifetime2]] = null;
            return var3Lifetime2;
          }
        }
        return new byte[param1];
    }

    public static void b(int param0) {
        if (param0 == -24465) {
          field_d = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
        fd.b(119);
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_b = new vh();
        field_d = "If you are not, please change your password to something more obscure!";
    }
}
