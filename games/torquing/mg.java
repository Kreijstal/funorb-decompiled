/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static gd field_b;
    static double[][] field_a;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int dupTemp$21 = 0;
        byte[][] arrayValue$22 = null;
        int fieldTemp$18 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int dupTemp$16 = 0;
        byte[][] arrayValue$17 = null;
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        int fieldTemp$13 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$12 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime1Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var2_ref_byte__Lifetime6;
        byte[] var2_ref_byte__Lifetime7;
        byte[] var3Lifetime4;
        byte[] var3Lifetime1Lifetime1;
        if (param0 >= -46) {
          field_b = (gd) null;
          if (param1 != 100) {
            if (5000 == param1 &&
              ok.field_E > 0) {
              fieldTemp$19 = ok.field_E - 1;
              ok.field_E = ok.field_E - 1;
              var2_ref_byte__ = pd.field_b[fieldTemp$19];
              pd.field_b[ok.field_E] = null;
              return var2_ref_byte__;
            }
            if (param1 == 30000 &&
              d.field_s > 0) {
              fieldTemp$20 = d.field_s - 1;
              d.field_s = d.field_s - 1;
              var2_ref_byte__ = lk.field_t[fieldTemp$20];
              lk.field_t[d.field_s] = null;
              return var2_ref_byte__;
            }
            if (null == l.field_d) {
              return new byte[param1];
            }
            for (var2 = 0; rf.field_r.length > var2; var2++) {
              if (rf.field_r[var2] == param1 &&
                ke.field_a[var2] > 0) {
                dupTemp$21 = ke.field_a[var2] - 1;
                arrayValue$22 = l.field_d[var2];
                ke.field_a[var2] = dupTemp$21;
                var3 = arrayValue$22[dupTemp$21];
                l.field_d[var2][ke.field_a[var2]] = null;
                return var3;
              }
            }
            return new byte[param1];
          }
          if (gl.field_q > 0) {
            fieldTemp$18 = gl.field_q - 1;
            gl.field_q = gl.field_q - 1;
            var2_ref_byte__Lifetime5 = mb.field_b[fieldTemp$18];
            mb.field_b[gl.field_q] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (5000 == param1 &&
            ok.field_E > 0) {
            fieldTemp$14 = ok.field_E - 1;
            ok.field_E = ok.field_E - 1;
            var2_ref_byte__Lifetime6 = pd.field_b[fieldTemp$14];
            pd.field_b[ok.field_E] = null;
            return var2_ref_byte__Lifetime6;
          }
          if (param1 == 30000 &&
            d.field_s > 0) {
            fieldTemp$15 = d.field_s - 1;
            d.field_s = d.field_s - 1;
            var2_ref_byte__Lifetime7 = lk.field_t[fieldTemp$15];
            lk.field_t[d.field_s] = null;
            return var2_ref_byte__Lifetime7;
          }
          if (null == l.field_d) {
            return new byte[param1];
          }
          for (var2Lifetime4 = 0; rf.field_r.length > var2Lifetime4; var2Lifetime4++) {
            if (rf.field_r[var2Lifetime4] == param1 &&
              ke.field_a[var2Lifetime4] > 0) {
              dupTemp$16 = ke.field_a[var2Lifetime4] - 1;
              arrayValue$17 = l.field_d[var2Lifetime4];
              ke.field_a[var2Lifetime4] = dupTemp$16;
              var3Lifetime4 = arrayValue$17[dupTemp$16];
              l.field_d[var2Lifetime4][ke.field_a[var2Lifetime4]] = null;
              return var3Lifetime4;
            }
          }
          return new byte[param1];
        }
        if (param1 == 100 &&
          gl.field_q > 0) {
          fieldTemp$2 = gl.field_q - 1;
          gl.field_q = gl.field_q - 1;
          var2_ref_byte__Lifetime1 = mb.field_b[fieldTemp$2];
          mb.field_b[gl.field_q] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (5000 != param1) {
          if (param1 != 30000) {
            if (null == l.field_d) {
              return new byte[param1];
            }
            for (var2Lifetime1 = 0; rf.field_r.length > var2Lifetime1; var2Lifetime1++) {
              if (rf.field_r[var2Lifetime1] == param1 &&
                ke.field_a[var2Lifetime1] > 0) {
                dupTemp$3 = ke.field_a[var2Lifetime1] - 1;
                arrayValue$4 = l.field_d[var2Lifetime1];
                ke.field_a[var2Lifetime1] = dupTemp$3;
                var3Lifetime1 = arrayValue$4[dupTemp$3];
                l.field_d[var2Lifetime1][ke.field_a[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param1];
          }
          if (d.field_s > 0) {
            fieldTemp$5 = d.field_s - 1;
            d.field_s = d.field_s - 1;
            var2_ref_byte__Lifetime2 = lk.field_t[fieldTemp$5];
            lk.field_t[d.field_s] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (null == l.field_d) {
            return new byte[param1];
          }
          for (var2Lifetime1Lifetime1 = 0; rf.field_r.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
            if (rf.field_r[var2Lifetime1Lifetime1] == param1 &&
              ke.field_a[var2Lifetime1Lifetime1] > 0) {
              dupTemp$6 = ke.field_a[var2Lifetime1Lifetime1] - 1;
              arrayValue$7 = l.field_d[var2Lifetime1Lifetime1];
              ke.field_a[var2Lifetime1Lifetime1] = dupTemp$6;
              var3Lifetime1Lifetime1 = arrayValue$7[dupTemp$6];
              l.field_d[var2Lifetime1Lifetime1][ke.field_a[var2Lifetime1Lifetime1]] = null;
              return var3Lifetime1Lifetime1;
            }
          }
          return new byte[param1];
        }
        if (ok.field_E > 0) {
          fieldTemp$13 = ok.field_E - 1;
          ok.field_E = ok.field_E - 1;
          var2_ref_byte__Lifetime3 = pd.field_b[fieldTemp$13];
          pd.field_b[ok.field_E] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (param1 != 30000) {
          if (null == l.field_d) {
            return new byte[param1];
          }
          for (var2Lifetime2 = 0; rf.field_r.length > var2Lifetime2; var2Lifetime2++) {
            if (rf.field_r[var2Lifetime2] == param1 &&
              ke.field_a[var2Lifetime2] > 0) {
              dupTemp$8 = ke.field_a[var2Lifetime2] - 1;
              arrayValue$9 = l.field_d[var2Lifetime2];
              ke.field_a[var2Lifetime2] = dupTemp$8;
              var3Lifetime2 = arrayValue$9[dupTemp$8];
              l.field_d[var2Lifetime2][ke.field_a[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param1];
        }
        if (d.field_s > 0) {
          fieldTemp$12 = d.field_s - 1;
          d.field_s = d.field_s - 1;
          var2_ref_byte__Lifetime4 = lk.field_t[fieldTemp$12];
          lk.field_t[d.field_s] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (null != l.field_d) {
          for (var2Lifetime3 = 0; rf.field_r.length > var2Lifetime3; var2Lifetime3++) {
            if (rf.field_r[var2Lifetime3] == param1 &&
              ke.field_a[var2Lifetime3] > 0) {
              dupTemp$10 = ke.field_a[var2Lifetime3] - 1;
              arrayValue$11 = l.field_d[var2Lifetime3];
              ke.field_a[var2Lifetime3] = dupTemp$10;
              var3Lifetime3 = arrayValue$11[dupTemp$10];
              l.field_d[var2Lifetime3][ke.field_a[var2Lifetime3]] = null;
              return var3Lifetime3;
            }
          }
        }
        return new byte[param1];
    }

    final static void a(int param0, int param1, int param2, int param3, vh param4, int param5, String param6, int param7, int param8) {
        tl.field_u = param7;
        um.field_r = param1;
        if (param0 != -1) {
          return;
        }
        try {
          gi.field_c = param3;
          gf.field_g = param2;
          hq.field_a = param4;
          eg.field_x = param5;
          qg.field_A = param8;
          cl.field_d = param6;
          nn.field_c = (jp) ((Object) new fh());
          gh.field_a = new co(param4);
          no.field_n = new bo(nn.field_c, gh.field_a);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = (double[][]) null;
        if (param0 >= -23) {
          String var2 = (String) null;
          mg.a(-36, 74, 14, 75, (vh) null, 80, (String) null, -11, -19);
        }
    }

    static {
        field_a = new double[9][9];
        field_b = new gd();
    }
}
