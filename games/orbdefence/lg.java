/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static int field_a;
    static ki field_c;
    static String field_b;

    final static void a(int param0, int param1, sh param2, boolean param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        og.field_n[0] = tl.field_f.nextInt();
        og.field_n[1] = tl.field_f.nextInt();
        og.field_n[param0] = (int)tg.field_a;
        og.field_n[2] = (int)(tg.field_a >> 856570144);
        pg.field_c.field_i = 0;
        pg.field_c.b(og.field_n[0], -1);
        pg.field_c.b(og.field_n[1], -1);
        pg.field_c.b(og.field_n[2], -1);
        pg.field_c.b(og.field_n[3], -1);
        kb.a(pg.field_c, false);
        pg.field_c.b((byte) -60, param1);
        param2.a(pg.field_c, 27557);
        uk.field_b.field_i = 0;
        if (param3) {
          L0: {
            uk.field_b.a(18, -55);
            uk.field_b.field_i = uk.field_b.field_i + 2;
            var5 = uk.field_b.field_i;
            uk.field_b.b(j.field_e, -1);
            uk.field_b.a(el.field_G, -16943);
            var6 = 0;
            if (!jc.field_b) {
              break L0;
            } else {
              var6 = var6 | 1;
              break L0;
            }
          }
          L1: {
            if (!mg.field_g) {
              break L1;
            } else {
              var6 = var6 | 4;
              break L1;
            }
          }
          L2: {
            if (param4) {
              var6 = var6 | 8;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (ug.field_r == null) {
              break L3;
            } else {
              var6 = var6 | 16;
              break L3;
            }
          }
          L4: {
            uk.field_b.a(var6, -37);
            var7 = tc.a((byte) -41, uj.b((byte) -120));
            if (var7 != null) {
              break L4;
            } else {
              var7 = "";
              break L4;
            }
          }
          uk.field_b.a(var7, -6528);
          if (null == ug.field_r) {
            cg.a((mg) (Object) uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
            uk.field_b.d(uk.field_b.field_i - var5, -2);
            bh.a(-1, param0 + -4);
            return;
          } else {
            uk.field_b.a(false, ug.field_r);
            cg.a((mg) (Object) uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
            uk.field_b.d(uk.field_b.field_i - var5, -2);
            bh.a(-1, param0 + -4);
            return;
          }
        } else {
          L5: {
            uk.field_b.a(16, -10);
            uk.field_b.field_i = uk.field_b.field_i + 2;
            var5 = uk.field_b.field_i;
            uk.field_b.b(j.field_e, -1);
            uk.field_b.a(el.field_G, -16943);
            var6 = 0;
            if (!jc.field_b) {
              break L5;
            } else {
              var6 = var6 | 1;
              break L5;
            }
          }
          L6: {
            if (!mg.field_g) {
              break L6;
            } else {
              var6 = var6 | 4;
              break L6;
            }
          }
          L7: {
            if (param4) {
              var6 = var6 | 8;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (ug.field_r == null) {
              break L8;
            } else {
              var6 = var6 | 16;
              break L8;
            }
          }
          L9: {
            uk.field_b.a(var6, -37);
            var7 = tc.a((byte) -41, uj.b((byte) -120));
            if (var7 != null) {
              break L9;
            } else {
              var7 = "";
              break L9;
            }
          }
          uk.field_b.a(var7, -6528);
          if (null == ug.field_r) {
            cg.a((mg) (Object) uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
            uk.field_b.d(uk.field_b.field_i - var5, -2);
            bh.a(-1, param0 + -4);
            return;
          } else {
            uk.field_b.a(false, ug.field_r);
            cg.a((mg) (Object) uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
            uk.field_b.d(uk.field_b.field_i - var5, -2);
            bh.a(-1, param0 + -4);
            return;
          }
        }
    }

    final static dc a(int param0, boolean param1) {
        dc var2 = new dc();
        mj.field_m.a(-125, (ca) (Object) var2);
        if (param1) {
            return null;
        }
        tg.a(-87, param0);
        return var2;
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = -14 / ((param0 - 40) / 62);
        field_b = null;
    }

    final static void a(int param0, int param1) {
        se var2 = uk.field_b;
        var2.i(param0, -114);
        var2.a(1, -55);
        var2.a(0, -32);
        int var3 = 56 % ((-11 - param1) / 56);
    }

    final static boolean a(byte param0) {
        if (param0 != -2) {
            return false;
        }
        return ed.field_b.a(param0 + 2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
