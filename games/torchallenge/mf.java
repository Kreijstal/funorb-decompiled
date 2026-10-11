/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String[] field_b;
    static String field_a;

    final static void c(int param0) {
        if (param0 >= -68) {
          field_a = (String) null;
        }
    }

    final static boolean a(byte param0) {
        int var1 = -57 / ((param0 - 35) / 35);
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3) {
          return;
        }
        field_b = null;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (~param0 == param1 &&
          ol.field_h > 0) {
          fieldTemp$3 = ol.field_h - 1;
          ol.field_h = ol.field_h - 1;
          var2_ref_byte__ = di.field_E[fieldTemp$3];
          di.field_E[ol.field_h] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          0 < bl.field_P) {
          fieldTemp$4 = bl.field_P - 1;
          bl.field_P = bl.field_P - 1;
          var2_ref_byte__Lifetime1 = nk.field_b[fieldTemp$4];
          nk.field_b[bl.field_P] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 == 30000 &&
          0 < oj.field_c) {
          fieldTemp$5 = oj.field_c - 1;
          oj.field_c = oj.field_c - 1;
          var2_ref_byte__Lifetime2 = cd.field_j[fieldTemp$5];
          cd.field_j[oj.field_c] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (null != cg.field_i) {
          for (var2 = 0; var2 < pe.field_gb.length; var2++) {
            if (param0 == pe.field_gb[var2] &&
              fk.field_v[var2] > 0) {
              dupTemp$6 = fk.field_v[var2] - 1;
              arrayValue$7 = cg.field_i[var2];
              fk.field_v[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              cg.field_i[var2][fk.field_v[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static void a(boolean param0, byte[] param1, int param2, boolean param3) {
        int incrementValue$1 = 0;
        int incrementValue$11 = 0;
        int[][] array$5 = null;
        int incrementValue$10 = 0;
        int var17 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var18 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var5Lifetime2Lifetime1;
        int var5Lifetime2Lifetime2;
        var18 = TorChallenge.field_F ? 1 : 0;
        try {
          of.field_f = 0;
          wb.field_p = null;
          if (param2 != 24233) {
            mf.a(-120);
          }
          var4_int = 0;
          fg.field_N = 0;
          var6 = 5;
          if (param0) {
            var7 = param1[var4_int++];
            if (var7 == 1) {
              incrementValue$1 = var4_int;
              var4_int++;
              fh.field_e = param1[incrementValue$1];
            }
          }
          var7Lifetime1 = param1[var4_int++];
          var5 = 0;
          while (6 > var5) {
            if ((var7Lifetime1 & 1 << var5) <= 0) {
              var5++;
              continue;
            }
            var5++;
            break;
          }
          if (var7Lifetime1 == 0) {
            var5Lifetime1 = 0;
          }
          var4_int++;
          for (var8 = 0; var8 < 64; var8++) {
            for (var9 = 0; var9 < ba.field_i.field_a; var9++) {
              incrementValue$11 = var4_int;
              var4_int++;
              ic.field_E[var8][var9] = param1[incrementValue$11];
            }
          }
          if (param3) {
            var8Lifetime1 = param1[var4_int++];
            if (var8Lifetime1 < 0) {
              var8Lifetime1 = var8Lifetime1 + 256;
            }
            var9Lifetime1 = param1[var4_int++];
            if (var9Lifetime1 < 0) {
              var9Lifetime1 = 256 + var9Lifetime1;
            }
            var14 = 0;
            ea.field_g = new qe[(var8Lifetime1 << 8) + var9Lifetime1];
            if (n.field_kb == null ||
              !(ba.field_i.field_a < n.field_kb[0].length)) {
              n.field_kb = new int[64][][];
              for (var5Lifetime2 = 0; var5Lifetime2 < 64; var5Lifetime2++) {
                array$5 = new int[ba.field_i.field_a][];
                n.field_kb[var5Lifetime2] = array$5;
              }
            }
            var15 = ea.field_e * 5;
            var16 = null;
            w.field_m = 0;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < ea.field_g.length; var5Lifetime2Lifetime1++) {
              var10 = param1[var4_int++];
              var11 = param1[var4_int++];
              var12 = param1[var4_int++];
              var13 = param1[var4_int++];
              ea.field_g[var5Lifetime2Lifetime1] = new qe(var11, var12, var10, var13);
              if (var10 == 28) {
                cj.field_f = ea.field_g[var5Lifetime2Lifetime1];
              }
              if (var10 == 19) {
                incrementValue$10 = var4_int;
                var4_int++;
                ea.field_g[var5Lifetime2Lifetime1].field_hb = param1[incrementValue$10];
              }
              if (var10 == 8 ||
                var10 == 9 ||
                var10 == 10 ||
                var10 == 11) {
                fg.field_N = fg.field_N + 1;
              }
              if (vg.a(var10, param2 - 24234) && (6 != var10 ||
                var13 != 0 &&
                var13 != 2)) {
                of.field_f = of.field_f + 1;
              }
              ea.field_g[var5Lifetime2Lifetime1].field_y = var5Lifetime2Lifetime1;
              kf.a(ea.field_g[var5Lifetime2Lifetime1], var5Lifetime2Lifetime1, 8);
              if (var10 == 0) {
                wb.field_p = ea.field_g[var5Lifetime2Lifetime1];
              }
              if (15 == ea.field_g[var5Lifetime2Lifetime1].field_F) {
                bl.field_O[0][var14] = var12;
                bl.field_O[1][var14] = var5Lifetime2Lifetime1;
                ea.field_g[var5Lifetime2Lifetime1].field_V = var15;
                if (0 < (pi.field_d[vj.field_c][ea.field_e] & 1 << -(var6 * ea.field_e) + var15)) {
                  ea.field_g[var5Lifetime2Lifetime1].field_nb = true;
                  if (var15 == ci.field_n) {
                    var16 = ea.field_g[var5Lifetime2Lifetime1];
                    ci.field_n = -1;
                  }
                }
                ie.field_e[var15 - ea.field_e * 5] = ea.field_g[var5Lifetime2Lifetime1];
                var14++;
                var15++;
              }
              if (6 == var10) {
                w.field_m = w.field_m + 1;
              }
            }
            if (var16 != null &&
              null != wb.field_p) {
              wb.field_p.field_r = ((qe) (var16)).field_r;
              wb.field_p.field_f = ((qe) (var16)).field_f;
            }
            ol.field_g = ba.field_i;
            pg.d(0);
            qk.field_lb = 0;
            wj.field_a = 0;
            cb.field_c = new int[w.field_m][4];
            for (var5Lifetime2Lifetime2 = 0; w.field_m > var5Lifetime2Lifetime2; var5Lifetime2Lifetime2++) {
              for (var17 = 0; var17 < 4; var17++) {
                cb.field_c[var5Lifetime2Lifetime2][var17] = -1;
              }
            }
            ch.a(bl.field_O[0], bl.field_O[1], 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_80_0 = var4;
          stackIn_80_1 = new StringBuilder().append("mf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0) {
        int[] var17 = null;
        int[] var8 = null;
        int[] var4 = new int[]{5};
        int[] var15 = lg.field_d[4];
        da.a(200, 440, var15[6] + var15[8], 61, var15[3], 4, var4);
        ug.field_i[4] = new pd(4, be.field_e);
        int[] var16 = lg.field_d[2];
        int[] var6 = new int[]{8, 9, 10, 5};
        da.a(var16[1], var16[2], var16[6] + var16[8], 74, var16[3], param0, var6);
        ug.field_i[2] = new pd(2, be.field_e);
        if (0 < ee.field_o &&
          ol.a((byte) -119, sh.field_u)) {
          var17 = lg.field_d[1];
          var8 = new int[]{1, 12, 13, 4, 31, 3, 7};
          da.a(var17[1], var17[2], var17[6] + var17[8], 118, var17[3], 1, var8);
          ug.field_i[1] = new pd(1, be.field_e);
        }
        ll.field_b = -1;
    }

    static {
        field_b = new String[255];
    }
}
