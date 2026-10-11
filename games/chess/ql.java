/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static hg field_g;
    static int[][] field_a;
    static ci field_d;
    static char field_f;
    static String field_b;
    static boolean field_c;
    static String field_e;

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = -18 / ((param0 + 37) / 32);
        field_g = null;
        field_a = (int[][]) null;
    }

    final synchronized static byte[] a(byte param0, int param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int fieldTemp$12 = 0;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        int fieldTemp$11 = 0;
        int dupTemp$9 = 0;
        byte[][] arrayValue$10 = null;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        byte[] var2;
        int var2_int;
        byte[] var3;
        if (param1 == 100) {
          if (g.field_h > 0) {
            fieldTemp$1 = g.field_h - 1;
            g.field_h = g.field_h - 1;
            var2 = hk.field_K[fieldTemp$1];
            hk.field_K[g.field_h] = null;
            return var2;
          }
          if (5000 == param1 &&
            wm.field_q > 0) {
            fieldTemp$2 = wm.field_q - 1;
            wm.field_q = wm.field_q - 1;
            var2 = di.field_Ib[fieldTemp$2];
            di.field_Ib[wm.field_q] = null;
            return var2;
          }
          if (param1 == 30000 &&
            hn.field_t > 0) {
            fieldTemp$3 = hn.field_t - 1;
            hn.field_t = hn.field_t - 1;
            var2 = cg.field_b[fieldTemp$3];
            cg.field_b[hn.field_t] = null;
            return var2;
          }
          if (null != se.field_Y) {
            for (var2_int = 0; he.field_Fb.length > var2_int; var2_int++) {
              if (he.field_Fb[var2_int] == param1 &&
                sg.field_g[var2_int] > 0) {
                dupTemp$4 = sg.field_g[var2_int] - 1;
                arrayValue$5 = se.field_Y[var2_int];
                sg.field_g[var2_int] = dupTemp$4;
                var3 = arrayValue$5[dupTemp$4];
                se.field_Y[var2_int][sg.field_g[var2_int]] = null;
                return var3;
              }
            }
          }
        } else {
          if (5000 != param1) {
            if (param1 == 30000 &&
              hn.field_t > 0) {
              fieldTemp$12 = hn.field_t - 1;
              hn.field_t = hn.field_t - 1;
              var2 = cg.field_b[fieldTemp$12];
              cg.field_b[hn.field_t] = null;
              return var2;
            }
            if (null != se.field_Y) {
              for (var2_int = 0; he.field_Fb.length > var2_int; var2_int++) {
                if (he.field_Fb[var2_int] == param1 &&
                  sg.field_g[var2_int] > 0) {
                  dupTemp$13 = sg.field_g[var2_int] - 1;
                  arrayValue$14 = se.field_Y[var2_int];
                  sg.field_g[var2_int] = dupTemp$13;
                  var3 = arrayValue$14[dupTemp$13];
                  se.field_Y[var2_int][sg.field_g[var2_int]] = null;
                  return var3;
                }
              }
            }
          } else {
            if (wm.field_q > 0) {
              fieldTemp$11 = wm.field_q - 1;
              wm.field_q = wm.field_q - 1;
              var2 = di.field_Ib[fieldTemp$11];
              di.field_Ib[wm.field_q] = null;
              return var2;
            }
            if (param1 != 30000) {
              if (null != se.field_Y) {
                for (var2_int = 0; he.field_Fb.length > var2_int; var2_int++) {
                  if (he.field_Fb[var2_int] == param1 &&
                    sg.field_g[var2_int] > 0) {
                    dupTemp$9 = sg.field_g[var2_int] - 1;
                    arrayValue$10 = se.field_Y[var2_int];
                    sg.field_g[var2_int] = dupTemp$9;
                    var3 = arrayValue$10[dupTemp$9];
                    se.field_Y[var2_int][sg.field_g[var2_int]] = null;
                    return var3;
                  }
                }
              }
            } else {
              if (hn.field_t > 0) {
                fieldTemp$6 = hn.field_t - 1;
                hn.field_t = hn.field_t - 1;
                var2 = cg.field_b[fieldTemp$6];
                cg.field_b[hn.field_t] = null;
                return var2;
              }
              if (null != se.field_Y) {
                for (var2_int = 0; he.field_Fb.length > var2_int; var2_int++) {
                  if (he.field_Fb[var2_int] == param1 &&
                    sg.field_g[var2_int] > 0) {
                    dupTemp$7 = sg.field_g[var2_int] - 1;
                    arrayValue$8 = se.field_Y[var2_int];
                    sg.field_g[var2_int] = dupTemp$7;
                    var3 = arrayValue$8[dupTemp$7];
                    se.field_Y[var2_int][sg.field_g[var2_int]] = null;
                    return var3;
                  }
                }
              }
            }
          }
        }
        if (param0 == -2) {
          return new byte[param1];
        }
        field_f = '\033';
        return new byte[param1];
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        th.field_a = param3;
        ug.field_a = param2;
        qd.field_r = param1;
        jb.field_f = param0;
        if (param4 != 66) {
          ql.a((byte) 119);
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        var2 = 0;
        if (0 > param1) {
          var2 += 16;
          param1 = param1 >>> 16;
        } else {
          if (65536 <= param1) {
            var2 += 16;
            param1 = param1 >>> 16;
          }
        }
        if (param1 >= 256) {
          param1 = param1 >>> 8;
          var2 += 8;
        }
        if (16 <= param1) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (param1 >= 4) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (param0 >= -109) {
          ql.a(99, -61);
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return param1 + var2;
    }

    static {
        field_g = new hg(7, 0, 1, 1);
        field_f = '/';
        field_c = true;
        field_e = "Player";
        field_b = "Status";
    }
}
