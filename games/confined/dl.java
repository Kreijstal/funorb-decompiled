/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static mn field_b;
    static String field_a;
    static nf[] field_d;
    static String[] field_c;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 >= 43) {
          field_b = null;
          field_d = null;
          return;
        }
        field_a = (String) null;
        field_b = null;
        field_d = null;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        java.awt.Component var4 = null;
        java.awt.Component var4Lifetime1;
        if (!param2) {
          fn.d();
          if (!param1) {
            var4 = (java.awt.Component) null;
            dl.a((java.awt.Component) null, (byte) 72);
            kh.a((byte) 35, param2);
            return;
          }
          kh.a((byte) 35, param2);
          return;
        }
        fn.b(0, 0, fn.field_g, fn.field_l, 0, 192);
        if (!param1) {
          var4Lifetime1 = (java.awt.Component) null;
          dl.a((java.awt.Component) null, (byte) 72);
          kh.a((byte) 35, param2);
          return;
        }
        kh.a((byte) 35, param2);
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$31 = 0;
        int fieldTemp$28 = 0;
        int dupTemp$29 = 0;
        byte[][] arrayValue$30 = null;
        int fieldTemp$21 = 0;
        int fieldTemp$25 = 0;
        int dupTemp$26 = 0;
        byte[][] arrayValue$27 = null;
        int fieldTemp$22 = 0;
        int dupTemp$23 = 0;
        byte[][] arrayValue$24 = null;
        int fieldTemp$20 = 0;
        int fieldTemp$17 = 0;
        int dupTemp$18 = 0;
        byte[][] arrayValue$19 = null;
        int dupTemp$12 = 0;
        byte[][] arrayValue$13 = null;
        int fieldTemp$16 = 0;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        int dupTemp$2 = 0;
        byte[][] arrayValue$3 = null;
        int fieldTemp$4 = 0;
        int dupTemp$5 = 0;
        byte[][] arrayValue$6 = null;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime1Lifetime1;
        int var2Lifetime1Lifetime2;
        int var2Lifetime2Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var3Lifetime4;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var2_ref_byte__Lifetime6;
        byte[] var2_ref_byte__Lifetime7;
        byte[] var3Lifetime5;
        byte[] var3Lifetime6;
        byte[] var2_ref_byte__Lifetime1Lifetime1;
        byte[] var2_ref_byte__Lifetime1Lifetime2;
        byte[] var3Lifetime1Lifetime1;
        byte[] var3Lifetime1Lifetime2;
        byte[] var3Lifetime2Lifetime1;
        if (param0 == 100) {
          if (fi.field_c > 0) {
            fieldTemp$31 = fi.field_c - 1;
            fi.field_c = fi.field_c - 1;
            var2_ref_byte__ = wd.field_d[fieldTemp$31];
            wd.field_d[fi.field_c] = null;
            return var2_ref_byte__;
          }
          if (param0 != 5000) {
            if (param1 >= -98) {
              dl.a(40, 47);
            }
            if (30000 == param0 &&
              sc.field_f > 0) {
              fieldTemp$28 = sc.field_f - 1;
              sc.field_f = sc.field_f - 1;
              var2_ref_byte__Lifetime4 = hf.field_Z[fieldTemp$28];
              hf.field_Z[sc.field_f] = null;
              return var2_ref_byte__Lifetime4;
            }
            if (null == fh.field_a) {
              return new byte[param0];
            }
            for (var2 = 0; vl.field_d.length > var2; var2++) {
              if (param0 == vl.field_d[var2] &&
                ld.field_d[var2] > 0) {
                dupTemp$29 = ld.field_d[var2] - 1;
                arrayValue$30 = fh.field_a[var2];
                ld.field_d[var2] = dupTemp$29;
                var3 = arrayValue$30[dupTemp$29];
                fh.field_a[var2][ld.field_d[var2]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          if (rj.field_a > 0) {
            fieldTemp$21 = rj.field_a - 1;
            rj.field_a = rj.field_a - 1;
            var2_ref_byte__Lifetime5 = rk.field_c[fieldTemp$21];
            rk.field_c[rj.field_a] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (param1 < -98) {
            if (30000 == param0 &&
              sc.field_f > 0) {
              fieldTemp$25 = sc.field_f - 1;
              sc.field_f = sc.field_f - 1;
              var2_ref_byte__Lifetime6 = hf.field_Z[fieldTemp$25];
              hf.field_Z[sc.field_f] = null;
              return var2_ref_byte__Lifetime6;
            }
            if (null == fh.field_a) {
              return new byte[param0];
            }
            for (var2Lifetime5 = 0; vl.field_d.length > var2Lifetime5; var2Lifetime5++) {
              if (param0 == vl.field_d[var2Lifetime5] &&
                ld.field_d[var2Lifetime5] > 0) {
                dupTemp$26 = ld.field_d[var2Lifetime5] - 1;
                arrayValue$27 = fh.field_a[var2Lifetime5];
                ld.field_d[var2Lifetime5] = dupTemp$26;
                var3Lifetime5 = arrayValue$27[dupTemp$26];
                fh.field_a[var2Lifetime5][ld.field_d[var2Lifetime5]] = null;
                return var3Lifetime5;
              }
            }
            return new byte[param0];
          }
          dl.a(40, 47);
          if (30000 == param0 &&
            sc.field_f > 0) {
            fieldTemp$22 = sc.field_f - 1;
            sc.field_f = sc.field_f - 1;
            var2_ref_byte__Lifetime7 = hf.field_Z[fieldTemp$22];
            hf.field_Z[sc.field_f] = null;
            return var2_ref_byte__Lifetime7;
          }
          if (null == fh.field_a) {
            return new byte[param0];
          }
          for (var2Lifetime6 = 0; vl.field_d.length > var2Lifetime6; var2Lifetime6++) {
            if (param0 == vl.field_d[var2Lifetime6] &&
              ld.field_d[var2Lifetime6] > 0) {
              dupTemp$23 = ld.field_d[var2Lifetime6] - 1;
              arrayValue$24 = fh.field_a[var2Lifetime6];
              ld.field_d[var2Lifetime6] = dupTemp$23;
              var3Lifetime6 = arrayValue$24[dupTemp$23];
              fh.field_a[var2Lifetime6][ld.field_d[var2Lifetime6]] = null;
              return var3Lifetime6;
            }
          }
          return new byte[param0];
        }
        if (param0 == 5000) {
          if (rj.field_a > 0) {
            fieldTemp$20 = rj.field_a - 1;
            rj.field_a = rj.field_a - 1;
            var2_ref_byte__Lifetime1 = rk.field_c[fieldTemp$20];
            rk.field_c[rj.field_a] = null;
            return var2_ref_byte__Lifetime1;
          }
          if (param1 >= -98) {
            dl.a(40, 47);
            if (30000 == param0 &&
              sc.field_f > 0) {
              fieldTemp$17 = sc.field_f - 1;
              sc.field_f = sc.field_f - 1;
              var2_ref_byte__Lifetime1Lifetime1 = hf.field_Z[fieldTemp$17];
              hf.field_Z[sc.field_f] = null;
              return var2_ref_byte__Lifetime1Lifetime1;
            }
            if (null == fh.field_a) {
              return new byte[param0];
            }
            for (var2Lifetime1 = 0; vl.field_d.length > var2Lifetime1; var2Lifetime1++) {
              if (param0 == vl.field_d[var2Lifetime1] &&
                ld.field_d[var2Lifetime1] > 0) {
                dupTemp$18 = ld.field_d[var2Lifetime1] - 1;
                arrayValue$19 = fh.field_a[var2Lifetime1];
                ld.field_d[var2Lifetime1] = dupTemp$18;
                var3Lifetime1 = arrayValue$19[dupTemp$18];
                fh.field_a[var2Lifetime1][ld.field_d[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param0];
          }
          if (30000 != param0) {
            if (null == fh.field_a) {
              return new byte[param0];
            }
            for (var2Lifetime1Lifetime1 = 0; vl.field_d.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
              if (param0 == vl.field_d[var2Lifetime1Lifetime1] &&
                ld.field_d[var2Lifetime1Lifetime1] > 0) {
                dupTemp$12 = ld.field_d[var2Lifetime1Lifetime1] - 1;
                arrayValue$13 = fh.field_a[var2Lifetime1Lifetime1];
                ld.field_d[var2Lifetime1Lifetime1] = dupTemp$12;
                var3Lifetime1Lifetime1 = arrayValue$13[dupTemp$12];
                fh.field_a[var2Lifetime1Lifetime1][ld.field_d[var2Lifetime1Lifetime1]] = null;
                return var3Lifetime1Lifetime1;
              }
            }
            return new byte[param0];
          }
          if (sc.field_f > 0) {
            fieldTemp$16 = sc.field_f - 1;
            sc.field_f = sc.field_f - 1;
            var2_ref_byte__Lifetime1Lifetime2 = hf.field_Z[fieldTemp$16];
            hf.field_Z[sc.field_f] = null;
            return var2_ref_byte__Lifetime1Lifetime2;
          }
          if (null == fh.field_a) {
            return new byte[param0];
          }
          for (var2Lifetime1Lifetime2 = 0; vl.field_d.length > var2Lifetime1Lifetime2; var2Lifetime1Lifetime2++) {
            if (param0 == vl.field_d[var2Lifetime1Lifetime2] &&
              ld.field_d[var2Lifetime1Lifetime2] > 0) {
              dupTemp$14 = ld.field_d[var2Lifetime1Lifetime2] - 1;
              arrayValue$15 = fh.field_a[var2Lifetime1Lifetime2];
              ld.field_d[var2Lifetime1Lifetime2] = dupTemp$14;
              var3Lifetime1Lifetime2 = arrayValue$15[dupTemp$14];
              fh.field_a[var2Lifetime1Lifetime2][ld.field_d[var2Lifetime1Lifetime2]] = null;
              return var3Lifetime1Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (param1 < -98) {
          if (30000 != param0) {
            if (null == fh.field_a) {
              return new byte[param0];
            }
            for (var2Lifetime2 = 0; vl.field_d.length > var2Lifetime2; var2Lifetime2++) {
              if (param0 == vl.field_d[var2Lifetime2] &&
                ld.field_d[var2Lifetime2] > 0) {
                dupTemp$2 = ld.field_d[var2Lifetime2] - 1;
                arrayValue$3 = fh.field_a[var2Lifetime2];
                ld.field_d[var2Lifetime2] = dupTemp$2;
                var3Lifetime2 = arrayValue$3[dupTemp$2];
                fh.field_a[var2Lifetime2][ld.field_d[var2Lifetime2]] = null;
                return var3Lifetime2;
              }
            }
            return new byte[param0];
          }
          if (sc.field_f > 0) {
            fieldTemp$4 = sc.field_f - 1;
            sc.field_f = sc.field_f - 1;
            var2_ref_byte__Lifetime2 = hf.field_Z[fieldTemp$4];
            hf.field_Z[sc.field_f] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (null == fh.field_a) {
            return new byte[param0];
          }
          for (var2Lifetime2Lifetime1 = 0; vl.field_d.length > var2Lifetime2Lifetime1; var2Lifetime2Lifetime1++) {
            if (param0 == vl.field_d[var2Lifetime2Lifetime1] &&
              ld.field_d[var2Lifetime2Lifetime1] > 0) {
              dupTemp$5 = ld.field_d[var2Lifetime2Lifetime1] - 1;
              arrayValue$6 = fh.field_a[var2Lifetime2Lifetime1];
              ld.field_d[var2Lifetime2Lifetime1] = dupTemp$5;
              var3Lifetime2Lifetime1 = arrayValue$6[dupTemp$5];
              fh.field_a[var2Lifetime2Lifetime1][ld.field_d[var2Lifetime2Lifetime1]] = null;
              return var3Lifetime2Lifetime1;
            }
          }
          return new byte[param0];
        }
        dl.a(40, 47);
        if (30000 != param0) {
          if (null == fh.field_a) {
            return new byte[param0];
          }
          for (var2Lifetime3 = 0; vl.field_d.length > var2Lifetime3; var2Lifetime3++) {
            if (param0 == vl.field_d[var2Lifetime3] &&
              ld.field_d[var2Lifetime3] > 0) {
              dupTemp$7 = ld.field_d[var2Lifetime3] - 1;
              arrayValue$8 = fh.field_a[var2Lifetime3];
              ld.field_d[var2Lifetime3] = dupTemp$7;
              var3Lifetime3 = arrayValue$8[dupTemp$7];
              fh.field_a[var2Lifetime3][ld.field_d[var2Lifetime3]] = null;
              return var3Lifetime3;
            }
          }
          return new byte[param0];
        }
        if (sc.field_f > 0) {
          fieldTemp$9 = sc.field_f - 1;
          sc.field_f = sc.field_f - 1;
          var2_ref_byte__Lifetime3 = hf.field_Z[fieldTemp$9];
          hf.field_Z[sc.field_f] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (null != fh.field_a) {
          for (var2Lifetime4 = 0; vl.field_d.length > var2Lifetime4; var2Lifetime4++) {
            if (param0 == vl.field_d[var2Lifetime4] &&
              ld.field_d[var2Lifetime4] > 0) {
              dupTemp$10 = ld.field_d[var2Lifetime4] - 1;
              arrayValue$11 = fh.field_a[var2Lifetime4];
              ld.field_d[var2Lifetime4] = dupTemp$10;
              var3Lifetime4 = arrayValue$11[dupTemp$10];
              fh.field_a[var2Lifetime4][ld.field_d[var2Lifetime4]] = null;
              return var3Lifetime4;
            }
          }
        }
        return new byte[param0];
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeKeyListener(tf.field_p);
          param0.removeFocusListener(tf.field_p);
          int var2_int = -9 / ((param1 - 20) / 56);
          ab.field_a = -1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "dl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = new mn();
        field_a = "Loading graphics";
    }
}
