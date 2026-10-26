/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    private static String field_z;

    final synchronized static byte[] a(int param0, byte param1) {
        byte[] var2_ref_byte__;
        byte[] var2_ref_byte__Lifetime5;
        if (100 != param0) {
          if (param1 < 110) {
            kd.a(-122, (byte) 55);
            if (5000 == param0 &&
              fa.field_a > 0) {
              int fieldTemp$25 = fa.field_a - 1;
              fa.field_a = fa.field_a - 1;
              var2_ref_byte__ = tq.field_f[fieldTemp$25];
              tq.field_f[fa.field_a] = null;
              return var2_ref_byte__;
            }
            if (param0 == 30000 &&
              rm.field_e > 0) {
              int fieldTemp$26 = rm.field_e - 1;
              rm.field_e = rm.field_e - 1;
              var2_ref_byte__ = fb.field_d[fieldTemp$26];
              fb.field_d[rm.field_e] = null;
              return var2_ref_byte__;
            }
            if (null == lm.field_c) {
              return new byte[param0];
            }
            for (int var2 = 0; te.field_g.length > var2; var2++) {
              if (param0 == te.field_g[var2] &&
                0 < bb.field_m[var2]) {
                int dupTemp$27 = bb.field_m[var2] - 1;
                byte[][] arrayValue$28 = lm.field_c[var2];
                bb.field_m[var2] = dupTemp$27;
                byte[] var3 = arrayValue$28[dupTemp$27];
                lm.field_c[var2][bb.field_m[var2]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          if (5000 == param0) {
            if (fa.field_a > 0) {
              int fieldTemp$24 = fa.field_a - 1;
              fa.field_a = fa.field_a - 1;
              var2_ref_byte__Lifetime5 = tq.field_f[fieldTemp$24];
              tq.field_f[fa.field_a] = null;
              return var2_ref_byte__Lifetime5;
            }
            if (param0 == 30000 &&
              rm.field_e > 0) {
              int fieldTemp$21 = rm.field_e - 1;
              rm.field_e = rm.field_e - 1;
              var2_ref_byte__Lifetime5 = fb.field_d[fieldTemp$21];
              fb.field_d[rm.field_e] = null;
              return var2_ref_byte__Lifetime5;
            }
            if (null == lm.field_c) {
              return new byte[param0];
            }
            for (int var2Lifetime5 = 0; te.field_g.length > var2Lifetime5; var2Lifetime5++) {
              if (param0 == te.field_g[var2Lifetime5] &&
                0 < bb.field_m[var2Lifetime5]) {
                int dupTemp$22 = bb.field_m[var2Lifetime5] - 1;
                byte[][] arrayValue$23 = lm.field_c[var2Lifetime5];
                bb.field_m[var2Lifetime5] = dupTemp$22;
                byte[] var3Lifetime5 = arrayValue$23[dupTemp$22];
                lm.field_c[var2Lifetime5][bb.field_m[var2Lifetime5]] = null;
                return var3Lifetime5;
              }
            }
            return new byte[param0];
          }
          if (param0 != 30000) {
            if (null == lm.field_c) {
              return new byte[param0];
            }
            for (int var2Lifetime6 = 0; te.field_g.length > var2Lifetime6; var2Lifetime6++) {
              if (param0 == te.field_g[var2Lifetime6] &&
                0 < bb.field_m[var2Lifetime6]) {
                int dupTemp$16 = bb.field_m[var2Lifetime6] - 1;
                byte[][] arrayValue$17 = lm.field_c[var2Lifetime6];
                bb.field_m[var2Lifetime6] = dupTemp$16;
                byte[] var3Lifetime6 = arrayValue$17[dupTemp$16];
                lm.field_c[var2Lifetime6][bb.field_m[var2Lifetime6]] = null;
                return var3Lifetime6;
              }
            }
            return new byte[param0];
          }
          if (rm.field_e > 0) {
            int fieldTemp$20 = rm.field_e - 1;
            rm.field_e = rm.field_e - 1;
            byte[] var2_ref_byte__Lifetime6 = fb.field_d[fieldTemp$20];
            fb.field_d[rm.field_e] = null;
            return var2_ref_byte__Lifetime6;
          }
          if (null == lm.field_c) {
            return new byte[param0];
          }
          for (int var2Lifetime7 = 0; te.field_g.length > var2Lifetime7; var2Lifetime7++) {
            if (param0 == te.field_g[var2Lifetime7] &&
              0 < bb.field_m[var2Lifetime7]) {
              int dupTemp$18 = bb.field_m[var2Lifetime7] - 1;
              byte[][] arrayValue$19 = lm.field_c[var2Lifetime7];
              bb.field_m[var2Lifetime7] = dupTemp$18;
              byte[] var3Lifetime7 = arrayValue$19[dupTemp$18];
              lm.field_c[var2Lifetime7][bb.field_m[var2Lifetime7]] = null;
              return var3Lifetime7;
            }
          }
          return new byte[param0];
        }
        if (0 < ki.field_e) {
          int fieldTemp$15 = ki.field_e - 1;
          ki.field_e = ki.field_e - 1;
          byte[] var2_ref_byte__Lifetime1 = pg.field_c[fieldTemp$15];
          pg.field_c[ki.field_e] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 < 110) {
          kd.a(-122, (byte) 55);
          if (5000 == param0 &&
            fa.field_a > 0) {
            int fieldTemp$11 = fa.field_a - 1;
            fa.field_a = fa.field_a - 1;
            byte[] var2_ref_byte__Lifetime2 = tq.field_f[fieldTemp$11];
            tq.field_f[fa.field_a] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (param0 == 30000 &&
            rm.field_e > 0) {
            int fieldTemp$12 = rm.field_e - 1;
            rm.field_e = rm.field_e - 1;
            byte[] var2_ref_byte__Lifetime2Lifetime1 = fb.field_d[fieldTemp$12];
            fb.field_d[rm.field_e] = null;
            return var2_ref_byte__Lifetime2Lifetime1;
          }
          if (null == lm.field_c) {
            return new byte[param0];
          }
          for (int var2Lifetime1 = 0; te.field_g.length > var2Lifetime1; var2Lifetime1++) {
            if (param0 == te.field_g[var2Lifetime1] &&
              0 < bb.field_m[var2Lifetime1]) {
              int dupTemp$13 = bb.field_m[var2Lifetime1] - 1;
              byte[][] arrayValue$14 = lm.field_c[var2Lifetime1];
              bb.field_m[var2Lifetime1] = dupTemp$13;
              byte[] var3Lifetime1 = arrayValue$14[dupTemp$13];
              lm.field_c[var2Lifetime1][bb.field_m[var2Lifetime1]] = null;
              return var3Lifetime1;
            }
          }
          return new byte[param0];
        }
        if (5000 == param0) {
          if (fa.field_a > 0) {
            int fieldTemp$10 = fa.field_a - 1;
            fa.field_a = fa.field_a - 1;
            byte[] var2_ref_byte__Lifetime3 = tq.field_f[fieldTemp$10];
            tq.field_f[fa.field_a] = null;
            return var2_ref_byte__Lifetime3;
          }
          if (param0 == 30000 &&
            rm.field_e > 0) {
            int fieldTemp$7 = rm.field_e - 1;
            rm.field_e = rm.field_e - 1;
            byte[] var2_ref_byte__Lifetime3Lifetime1 = fb.field_d[fieldTemp$7];
            fb.field_d[rm.field_e] = null;
            return var2_ref_byte__Lifetime3Lifetime1;
          }
          if (null == lm.field_c) {
            return new byte[param0];
          }
          for (int var2Lifetime2 = 0; te.field_g.length > var2Lifetime2; var2Lifetime2++) {
            if (param0 == te.field_g[var2Lifetime2] &&
              0 < bb.field_m[var2Lifetime2]) {
              int dupTemp$8 = bb.field_m[var2Lifetime2] - 1;
              byte[][] arrayValue$9 = lm.field_c[var2Lifetime2];
              bb.field_m[var2Lifetime2] = dupTemp$8;
              byte[] var3Lifetime2 = arrayValue$9[dupTemp$8];
              lm.field_c[var2Lifetime2][bb.field_m[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (param0 != 30000) {
          if (null == lm.field_c) {
            return new byte[param0];
          }
          for (int var2Lifetime3 = 0; te.field_g.length > var2Lifetime3; var2Lifetime3++) {
            if (param0 == te.field_g[var2Lifetime3] &&
              0 < bb.field_m[var2Lifetime3]) {
              int dupTemp$2 = bb.field_m[var2Lifetime3] - 1;
              byte[][] arrayValue$3 = lm.field_c[var2Lifetime3];
              bb.field_m[var2Lifetime3] = dupTemp$2;
              byte[] var3Lifetime3 = arrayValue$3[dupTemp$2];
              lm.field_c[var2Lifetime3][bb.field_m[var2Lifetime3]] = null;
              return var3Lifetime3;
            }
          }
          return new byte[param0];
        }
        if (rm.field_e > 0) {
          int fieldTemp$6 = rm.field_e - 1;
          rm.field_e = rm.field_e - 1;
          byte[] var2_ref_byte__Lifetime4 = fb.field_d[fieldTemp$6];
          fb.field_d[rm.field_e] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (null == lm.field_c) {
          return new byte[param0];
        }
        for (int var2Lifetime4 = 0; te.field_g.length > var2Lifetime4; var2Lifetime4++) {
          if (param0 == te.field_g[var2Lifetime4] &&
            0 < bb.field_m[var2Lifetime4]) {
            int dupTemp$4 = bb.field_m[var2Lifetime4] - 1;
            byte[][] arrayValue$5 = lm.field_c[var2Lifetime4];
            bb.field_m[var2Lifetime4] = dupTemp$4;
            byte[] var3Lifetime4 = arrayValue$5[dupTemp$4];
            lm.field_c[var2Lifetime4][bb.field_m[var2Lifetime4]] = null;
            return var3Lifetime4;
          }
        }
        return new byte[param0];
    }

    static {
        field_z = "kd.A(";
    }
}
