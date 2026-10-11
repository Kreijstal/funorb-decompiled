/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj {
    static si field_a;

    public static void a(boolean param0) {
        if (!param0) {
          jj.a(false);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (!param1) {
            field_a = (si) null;
          }
          if (dh.field_a != null && (param0 < 0 ||
            pj.field_a == b.field_b)) {
            if (0 == hh.field_p.field_h &&
              fa.a(101) > (10000L + wa.field_e)) {
              hh.field_p.a(true, param0);
            }
            if (0 < hh.field_p.field_h) {
              try {
                dh.field_a.a(hh.field_p.field_h, hh.field_p.field_i, 0, 0);
                wa.field_e = fa.a(-76);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                kc.a((byte) 18);
              }
              hh.field_p.field_h = 0;
            }
            return;
          }
          hh.field_p.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sg a(int param0) {
        if (param0 != 10000) {
          field_a = (si) null;
          return (sg) ((Object) new el());
        }
        return (sg) ((Object) new el());
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int dupTemp$29 = 0;
        byte[][] arrayValue$30 = null;
        int fieldTemp$19 = 0;
        int fieldTemp$24 = 0;
        int dupTemp$25 = 0;
        byte[][] arrayValue$26 = null;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int dupTemp$22 = 0;
        byte[][] arrayValue$23 = null;
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int fieldTemp$18 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$14 = 0;
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int dupTemp$12 = 0;
        byte[][] arrayValue$13 = null;
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
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var3Lifetime4;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var2_ref_byte__Lifetime6;
        byte[] var2_ref_byte__Lifetime7;
        byte[] var2_ref_byte__Lifetime8;
        byte[] var3Lifetime5;
        byte[] var3Lifetime6;
        byte[] var2_ref_byte__Lifetime1Lifetime1;
        byte[] var2_ref_byte__Lifetime1Lifetime2;
        byte[] var2_ref_byte__Lifetime3Lifetime1;
        byte[] var3Lifetime1Lifetime1;
        if (param0 != 10000) {
          field_a = (si) null;
          if (100 != param1) {
            if (param1 == 5000 &&
              hj.field_b > 0) {
              fieldTemp$27 = hj.field_b - 1;
              hj.field_b = hj.field_b - 1;
              var2_ref_byte__ = jh.field_r[fieldTemp$27];
              jh.field_r[hj.field_b] = null;
              return var2_ref_byte__;
            }
            if (30000 == param1 &&
              ch.field_a > 0) {
              fieldTemp$28 = ch.field_a - 1;
              ch.field_a = ch.field_a - 1;
              var2_ref_byte__ = hh.field_r[fieldTemp$28];
              hh.field_r[ch.field_a] = null;
              return var2_ref_byte__;
            }
            if (ri.field_B == null) {
              return new byte[param1];
            }
            for (var2 = 0; ok.field_c.length > var2; var2++) {
              if (param1 == ok.field_c[var2] &&
                de.field_e[var2] > 0) {
                dupTemp$29 = de.field_e[var2] - 1;
                arrayValue$30 = ri.field_B[var2];
                de.field_e[var2] = dupTemp$29;
                var3 = arrayValue$30[dupTemp$29];
                ri.field_B[var2][de.field_e[var2]] = null;
                return var3;
              }
            }
            return new byte[param1];
          }
          if (dk.field_a > 0) {
            fieldTemp$19 = dk.field_a - 1;
            dk.field_a = dk.field_a - 1;
            var2_ref_byte__Lifetime5 = qh.field_b[fieldTemp$19];
            qh.field_b[dk.field_a] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (param1 != 5000) {
            if (30000 == param1 &&
              ch.field_a > 0) {
              fieldTemp$24 = ch.field_a - 1;
              ch.field_a = ch.field_a - 1;
              var2_ref_byte__Lifetime6 = hh.field_r[fieldTemp$24];
              hh.field_r[ch.field_a] = null;
              return var2_ref_byte__Lifetime6;
            }
            if (ri.field_B == null) {
              return new byte[param1];
            }
            for (var2Lifetime5 = 0; ok.field_c.length > var2Lifetime5; var2Lifetime5++) {
              if (param1 == ok.field_c[var2Lifetime5] &&
                de.field_e[var2Lifetime5] > 0) {
                dupTemp$25 = de.field_e[var2Lifetime5] - 1;
                arrayValue$26 = ri.field_B[var2Lifetime5];
                de.field_e[var2Lifetime5] = dupTemp$25;
                var3Lifetime5 = arrayValue$26[dupTemp$25];
                ri.field_B[var2Lifetime5][de.field_e[var2Lifetime5]] = null;
                return var3Lifetime5;
              }
            }
            return new byte[param1];
          }
          if (hj.field_b > 0) {
            fieldTemp$20 = hj.field_b - 1;
            hj.field_b = hj.field_b - 1;
            var2_ref_byte__Lifetime7 = jh.field_r[fieldTemp$20];
            jh.field_r[hj.field_b] = null;
            return var2_ref_byte__Lifetime7;
          }
          if (30000 == param1 &&
            ch.field_a > 0) {
            fieldTemp$21 = ch.field_a - 1;
            ch.field_a = ch.field_a - 1;
            var2_ref_byte__Lifetime8 = hh.field_r[fieldTemp$21];
            hh.field_r[ch.field_a] = null;
            return var2_ref_byte__Lifetime8;
          }
          if (ri.field_B == null) {
            return new byte[param1];
          }
          for (var2Lifetime6 = 0; ok.field_c.length > var2Lifetime6; var2Lifetime6++) {
            if (param1 == ok.field_c[var2Lifetime6] &&
              de.field_e[var2Lifetime6] > 0) {
              dupTemp$22 = de.field_e[var2Lifetime6] - 1;
              arrayValue$23 = ri.field_B[var2Lifetime6];
              de.field_e[var2Lifetime6] = dupTemp$22;
              var3Lifetime6 = arrayValue$23[dupTemp$22];
              ri.field_B[var2Lifetime6][de.field_e[var2Lifetime6]] = null;
              return var3Lifetime6;
            }
          }
          return new byte[param1];
        }
        if (100 != param1) {
          if (param1 != 5000) {
            if (30000 == param1 &&
              ch.field_a > 0) {
              fieldTemp$2 = ch.field_a - 1;
              ch.field_a = ch.field_a - 1;
              var2_ref_byte__Lifetime1 = hh.field_r[fieldTemp$2];
              hh.field_r[ch.field_a] = null;
              return var2_ref_byte__Lifetime1;
            }
            if (ri.field_B == null) {
              return new byte[param1];
            }
            for (var2Lifetime1 = 0; ok.field_c.length > var2Lifetime1; var2Lifetime1++) {
              if (param1 == ok.field_c[var2Lifetime1] &&
                de.field_e[var2Lifetime1] > 0) {
                dupTemp$3 = de.field_e[var2Lifetime1] - 1;
                arrayValue$4 = ri.field_B[var2Lifetime1];
                de.field_e[var2Lifetime1] = dupTemp$3;
                var3Lifetime1 = arrayValue$4[dupTemp$3];
                ri.field_B[var2Lifetime1][de.field_e[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param1];
          }
          if (hj.field_b > 0) {
            fieldTemp$5 = hj.field_b - 1;
            hj.field_b = hj.field_b - 1;
            var2_ref_byte__Lifetime1Lifetime1 = jh.field_r[fieldTemp$5];
            jh.field_r[hj.field_b] = null;
            return var2_ref_byte__Lifetime1Lifetime1;
          }
          if (30000 == param1 &&
            ch.field_a > 0) {
            fieldTemp$6 = ch.field_a - 1;
            ch.field_a = ch.field_a - 1;
            var2_ref_byte__Lifetime1Lifetime2 = hh.field_r[fieldTemp$6];
            hh.field_r[ch.field_a] = null;
            return var2_ref_byte__Lifetime1Lifetime2;
          }
          if (ri.field_B == null) {
            return new byte[param1];
          }
          for (var2Lifetime1Lifetime1 = 0; ok.field_c.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
            if (param1 == ok.field_c[var2Lifetime1Lifetime1] &&
              de.field_e[var2Lifetime1Lifetime1] > 0) {
              dupTemp$7 = de.field_e[var2Lifetime1Lifetime1] - 1;
              arrayValue$8 = ri.field_B[var2Lifetime1Lifetime1];
              de.field_e[var2Lifetime1Lifetime1] = dupTemp$7;
              var3Lifetime1Lifetime1 = arrayValue$8[dupTemp$7];
              ri.field_B[var2Lifetime1Lifetime1][de.field_e[var2Lifetime1Lifetime1]] = null;
              return var3Lifetime1Lifetime1;
            }
          }
          return new byte[param1];
        }
        if (dk.field_a > 0) {
          fieldTemp$18 = dk.field_a - 1;
          dk.field_a = dk.field_a - 1;
          var2_ref_byte__Lifetime2 = qh.field_b[fieldTemp$18];
          qh.field_b[dk.field_a] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param1 == 5000) {
          if (hj.field_b > 0) {
            fieldTemp$17 = hj.field_b - 1;
            hj.field_b = hj.field_b - 1;
            var2_ref_byte__Lifetime3 = jh.field_r[fieldTemp$17];
            jh.field_r[hj.field_b] = null;
            return var2_ref_byte__Lifetime3;
          }
          if (30000 == param1 &&
            ch.field_a > 0) {
            fieldTemp$14 = ch.field_a - 1;
            ch.field_a = ch.field_a - 1;
            var2_ref_byte__Lifetime3Lifetime1 = hh.field_r[fieldTemp$14];
            hh.field_r[ch.field_a] = null;
            return var2_ref_byte__Lifetime3Lifetime1;
          }
          if (ri.field_B == null) {
            return new byte[param1];
          }
          for (var2Lifetime2 = 0; ok.field_c.length > var2Lifetime2; var2Lifetime2++) {
            if (param1 == ok.field_c[var2Lifetime2] &&
              de.field_e[var2Lifetime2] > 0) {
              dupTemp$15 = de.field_e[var2Lifetime2] - 1;
              arrayValue$16 = ri.field_B[var2Lifetime2];
              de.field_e[var2Lifetime2] = dupTemp$15;
              var3Lifetime2 = arrayValue$16[dupTemp$15];
              ri.field_B[var2Lifetime2][de.field_e[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param1];
        }
        if (30000 != param1) {
          if (ri.field_B == null) {
            return new byte[param1];
          }
          for (var2Lifetime3 = 0; ok.field_c.length > var2Lifetime3; var2Lifetime3++) {
            if (param1 == ok.field_c[var2Lifetime3] &&
              de.field_e[var2Lifetime3] > 0) {
              dupTemp$12 = de.field_e[var2Lifetime3] - 1;
              arrayValue$13 = ri.field_B[var2Lifetime3];
              de.field_e[var2Lifetime3] = dupTemp$12;
              var3Lifetime3 = arrayValue$13[dupTemp$12];
              ri.field_B[var2Lifetime3][de.field_e[var2Lifetime3]] = null;
              return var3Lifetime3;
            }
          }
          return new byte[param1];
        }
        if (ch.field_a > 0) {
          fieldTemp$9 = ch.field_a - 1;
          ch.field_a = ch.field_a - 1;
          var2_ref_byte__Lifetime4 = hh.field_r[fieldTemp$9];
          hh.field_r[ch.field_a] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (ri.field_B == null) {
          return new byte[param1];
        }
        for (var2Lifetime4 = 0; ok.field_c.length > var2Lifetime4; var2Lifetime4++) {
          if (param1 == ok.field_c[var2Lifetime4] &&
            de.field_e[var2Lifetime4] > 0) {
            dupTemp$10 = de.field_e[var2Lifetime4] - 1;
            arrayValue$11 = ri.field_B[var2Lifetime4];
            de.field_e[var2Lifetime4] = dupTemp$10;
            var3Lifetime4 = arrayValue$11[dupTemp$10];
            ri.field_B[var2Lifetime4][de.field_e[var2Lifetime4]] = null;
            return var3Lifetime4;
          }
        }
        return new byte[param1];
    }

    final static String a(byte param0) {
        if (param0 != -54) {
          jj.a((byte) -57);
          return jc.field_g.b(true);
        }
        return jc.field_g.b(true);
    }

    static {
    }
}
