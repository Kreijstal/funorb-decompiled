/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static sa field_d;
    static rf field_f;
    static String[] field_b;
    static oi field_e;
    static he[] field_a;
    static nh field_c;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$28 = 0;
        int fieldTemp$25 = 0;
        int dupTemp$26 = 0;
        byte[][] arrayValue$27 = null;
        int fieldTemp$17 = 0;
        int dupTemp$23 = 0;
        byte[][] arrayValue$24 = null;
        int fieldTemp$22 = 0;
        int dupTemp$18 = 0;
        byte[][] arrayValue$19 = null;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int dupTemp$5 = 0;
        byte[][] arrayValue$6 = null;
        int fieldTemp$7 = 0;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int fieldTemp$8 = 0;
        int dupTemp$9 = 0;
        byte[][] arrayValue$10 = null;
        int dupTemp$11 = 0;
        byte[][] arrayValue$12 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var2Lifetime1Lifetime1;
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
        byte[] var3Lifetime5;
        byte[] var3Lifetime6;
        byte[] var3Lifetime7;
        byte[] var3Lifetime1Lifetime1;
        byte[] var3Lifetime2Lifetime1;
        if (100 == param1) {
          if (0 < uf.field_k) {
            fieldTemp$28 = uf.field_k - 1;
            uf.field_k = uf.field_k - 1;
            var2_ref_byte__ = vc.field_f[fieldTemp$28];
            vc.field_f[uf.field_k] = null;
            return var2_ref_byte__;
          }
          if (param1 != 5000) {
            if (30000 == param1 &&
              uh.field_m > 0) {
              fieldTemp$25 = uh.field_m - 1;
              uh.field_m = uh.field_m - 1;
              var2_ref_byte__Lifetime4 = sj.field_c[fieldTemp$25];
              sj.field_c[uh.field_m] = null;
              return var2_ref_byte__Lifetime4;
            }
            if (param0 != -16705) {
              field_b = (String[]) null;
            }
            if (null == gi.field_a) {
              return new byte[param1];
            }
            for (var2 = 0; mf.field_E.length > var2; var2++) {
              if (param1 == mf.field_E[var2] &&
                eb.field_b[var2] > 0) {
                dupTemp$26 = eb.field_b[var2] - 1;
                arrayValue$27 = gi.field_a[var2];
                eb.field_b[var2] = dupTemp$26;
                var3 = arrayValue$27[dupTemp$26];
                gi.field_a[var2][eb.field_b[var2]] = null;
                return var3;
              }
            }
            return new byte[param1];
          }
          if (pk.field_s > 0) {
            fieldTemp$17 = pk.field_s - 1;
            pk.field_s = pk.field_s - 1;
            var2_ref_byte__Lifetime5 = eb.field_f[fieldTemp$17];
            eb.field_f[pk.field_s] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (30000 != param1) {
            if (param0 != -16705) {
              field_b = (String[]) null;
            }
            if (null == gi.field_a) {
              return new byte[param1];
            }
            for (var2Lifetime5 = 0; mf.field_E.length > var2Lifetime5; var2Lifetime5++) {
              if (param1 == mf.field_E[var2Lifetime5] &&
                eb.field_b[var2Lifetime5] > 0) {
                dupTemp$23 = eb.field_b[var2Lifetime5] - 1;
                arrayValue$24 = gi.field_a[var2Lifetime5];
                eb.field_b[var2Lifetime5] = dupTemp$23;
                var3Lifetime5 = arrayValue$24[dupTemp$23];
                gi.field_a[var2Lifetime5][eb.field_b[var2Lifetime5]] = null;
                return var3Lifetime5;
              }
            }
            return new byte[param1];
          }
          if (uh.field_m > 0) {
            fieldTemp$22 = uh.field_m - 1;
            uh.field_m = uh.field_m - 1;
            var2_ref_byte__Lifetime6 = sj.field_c[fieldTemp$22];
            sj.field_c[uh.field_m] = null;
            return var2_ref_byte__Lifetime6;
          }
          if (param0 == -16705) {
            if (null == gi.field_a) {
              return new byte[param1];
            }
            for (var2Lifetime6 = 0; mf.field_E.length > var2Lifetime6; var2Lifetime6++) {
              if (param1 == mf.field_E[var2Lifetime6] &&
                eb.field_b[var2Lifetime6] > 0) {
                dupTemp$18 = eb.field_b[var2Lifetime6] - 1;
                arrayValue$19 = gi.field_a[var2Lifetime6];
                eb.field_b[var2Lifetime6] = dupTemp$18;
                var3Lifetime6 = arrayValue$19[dupTemp$18];
                gi.field_a[var2Lifetime6][eb.field_b[var2Lifetime6]] = null;
                return var3Lifetime6;
              }
            }
            return new byte[param1];
          }
          field_b = (String[]) null;
          if (null == gi.field_a) {
            return new byte[param1];
          }
          for (var2Lifetime7 = 0; mf.field_E.length > var2Lifetime7; var2Lifetime7++) {
            if (param1 == mf.field_E[var2Lifetime7] &&
              eb.field_b[var2Lifetime7] > 0) {
              dupTemp$20 = eb.field_b[var2Lifetime7] - 1;
              arrayValue$21 = gi.field_a[var2Lifetime7];
              eb.field_b[var2Lifetime7] = dupTemp$20;
              var3Lifetime7 = arrayValue$21[dupTemp$20];
              gi.field_a[var2Lifetime7][eb.field_b[var2Lifetime7]] = null;
              return var3Lifetime7;
            }
          }
          return new byte[param1];
        }
        if (param1 != 5000) {
          if (30000 == param1 &&
            uh.field_m > 0) {
            fieldTemp$2 = uh.field_m - 1;
            uh.field_m = uh.field_m - 1;
            var2_ref_byte__Lifetime1 = sj.field_c[fieldTemp$2];
            sj.field_c[uh.field_m] = null;
            return var2_ref_byte__Lifetime1;
          }
          if (param0 == -16705) {
            if (null != gi.field_a) {
              for (var2Lifetime1 = 0; mf.field_E.length > var2Lifetime1; var2Lifetime1++) {
                if (param1 == mf.field_E[var2Lifetime1] &&
                  eb.field_b[var2Lifetime1] > 0) {
                  dupTemp$3 = eb.field_b[var2Lifetime1] - 1;
                  arrayValue$4 = gi.field_a[var2Lifetime1];
                  eb.field_b[var2Lifetime1] = dupTemp$3;
                  var3Lifetime1 = arrayValue$4[dupTemp$3];
                  gi.field_a[var2Lifetime1][eb.field_b[var2Lifetime1]] = null;
                  return var3Lifetime1;
                }
              }
            }
            return new byte[param1];
          }
          field_b = (String[]) null;
          if (null != gi.field_a) {
            for (var2Lifetime1Lifetime1 = 0; mf.field_E.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
              if (param1 == mf.field_E[var2Lifetime1Lifetime1] &&
                eb.field_b[var2Lifetime1Lifetime1] > 0) {
                dupTemp$5 = eb.field_b[var2Lifetime1Lifetime1] - 1;
                arrayValue$6 = gi.field_a[var2Lifetime1Lifetime1];
                eb.field_b[var2Lifetime1Lifetime1] = dupTemp$5;
                var3Lifetime1Lifetime1 = arrayValue$6[dupTemp$5];
                gi.field_a[var2Lifetime1Lifetime1][eb.field_b[var2Lifetime1Lifetime1]] = null;
                return var3Lifetime1Lifetime1;
              }
            }
          }
          return new byte[param1];
        }
        if (pk.field_s > 0) {
          fieldTemp$7 = pk.field_s - 1;
          pk.field_s = pk.field_s - 1;
          var2_ref_byte__Lifetime2 = eb.field_f[fieldTemp$7];
          eb.field_f[pk.field_s] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (30000 != param1) {
          if (param0 == -16705) {
            if (null != gi.field_a) {
              for (var2Lifetime2 = 0; mf.field_E.length > var2Lifetime2; var2Lifetime2++) {
                if (param1 == mf.field_E[var2Lifetime2] &&
                  eb.field_b[var2Lifetime2] > 0) {
                  dupTemp$13 = eb.field_b[var2Lifetime2] - 1;
                  arrayValue$14 = gi.field_a[var2Lifetime2];
                  eb.field_b[var2Lifetime2] = dupTemp$13;
                  var3Lifetime2 = arrayValue$14[dupTemp$13];
                  gi.field_a[var2Lifetime2][eb.field_b[var2Lifetime2]] = null;
                  return var3Lifetime2;
                }
              }
            }
            return new byte[param1];
          }
          field_b = (String[]) null;
          if (null != gi.field_a) {
            for (var2Lifetime2Lifetime1 = 0; mf.field_E.length > var2Lifetime2Lifetime1; var2Lifetime2Lifetime1++) {
              if (param1 == mf.field_E[var2Lifetime2Lifetime1] &&
                eb.field_b[var2Lifetime2Lifetime1] > 0) {
                dupTemp$15 = eb.field_b[var2Lifetime2Lifetime1] - 1;
                arrayValue$16 = gi.field_a[var2Lifetime2Lifetime1];
                eb.field_b[var2Lifetime2Lifetime1] = dupTemp$15;
                var3Lifetime2Lifetime1 = arrayValue$16[dupTemp$15];
                gi.field_a[var2Lifetime2Lifetime1][eb.field_b[var2Lifetime2Lifetime1]] = null;
                return var3Lifetime2Lifetime1;
              }
            }
          }
          return new byte[param1];
        }
        if (uh.field_m > 0) {
          fieldTemp$8 = uh.field_m - 1;
          uh.field_m = uh.field_m - 1;
          var2_ref_byte__Lifetime3 = sj.field_c[fieldTemp$8];
          sj.field_c[uh.field_m] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (param0 == -16705) {
          if (null != gi.field_a) {
            for (var2Lifetime3 = 0; mf.field_E.length > var2Lifetime3; var2Lifetime3++) {
              if (param1 == mf.field_E[var2Lifetime3] &&
                eb.field_b[var2Lifetime3] > 0) {
                dupTemp$9 = eb.field_b[var2Lifetime3] - 1;
                arrayValue$10 = gi.field_a[var2Lifetime3];
                eb.field_b[var2Lifetime3] = dupTemp$9;
                var3Lifetime3 = arrayValue$10[dupTemp$9];
                gi.field_a[var2Lifetime3][eb.field_b[var2Lifetime3]] = null;
                return var3Lifetime3;
              }
            }
          }
          return new byte[param1];
        }
        field_b = (String[]) null;
        if (null != gi.field_a) {
          for (var2Lifetime4 = 0; mf.field_E.length > var2Lifetime4; var2Lifetime4++) {
            if (param1 == mf.field_E[var2Lifetime4] &&
              eb.field_b[var2Lifetime4] > 0) {
              dupTemp$11 = eb.field_b[var2Lifetime4] - 1;
              arrayValue$12 = gi.field_a[var2Lifetime4];
              eb.field_b[var2Lifetime4] = dupTemp$11;
              var3Lifetime4 = arrayValue$12[dupTemp$11];
              gi.field_a[var2Lifetime4][eb.field_b[var2Lifetime4]] = null;
              return var3Lifetime4;
            }
          }
        }
        return new byte[param1];
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 < -38) {
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        }
        ok var2 = (ok) null;
        sc.a(-96, false, (ok) null);
        field_b = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0, boolean param1, ok param2) {
        if (param2 == null ||
          param2 == hj.field_g) {
          return;
        }
        try {
          s.field_a.a((byte) -114);
          el.field_sb.g();
          hj.field_g = param2;
          s.field_a.a(hj.field_g, param1, (byte) 120);
          if (param0 != -1) {
            sc.a(-73, -118);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "sc.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new sa(11, 0, 1, 2);
        field_b = new String[]{"Victorus Morti", "Victorus Legioni", "Victorus Goliath", "Victorus Campus", "Pacifist Award", "Untouchable Award", "Safety Award", "Collector Award", "Anti-collector Award", "Total Destruction Award", "Earth Defender Award", "Star Defender Award", "Ultimate Defender Award", "Friend of Earth", "Victorus Ultima"};
    }
}
