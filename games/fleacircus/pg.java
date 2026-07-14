/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static int field_f;
    static int field_e;
    static int field_c;
    static String field_b;
    static int field_a;
    static int field_d;

    final static void a(int param0, int param1) {
        lh var2 = null;
        int var3 = 0;
        oa var4 = null;
        var3 = fleas.field_A ? 1 : 0;
        if (param0 <= -64) {
          var4 = (oa) (Object) cf.field_d.c((byte) 47);
          L0: while (true) {
            if (var4 == null) {
              var2 = hd.field_a.c((byte) 47);
              L1: while (true) {
                if (var2 != null) {
                  ef.a(0, param1);
                  var2 = hd.field_a.b((byte) -105);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              s.a(var4, param1, false);
              var4 = (oa) (Object) cf.field_d.b((byte) -105);
              continue L0;
            }
          }
        } else {
          pg.a(-11, 18);
          var4 = (oa) (Object) cf.field_d.c((byte) 47);
          L2: while (true) {
            if (var4 == null) {
              var2 = hd.field_a.c((byte) 47);
              L3: while (true) {
                if (var2 != null) {
                  ef.a(0, param1);
                  var2 = hd.field_a.b((byte) -105);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              s.a(var4, param1, false);
              var4 = (oa) (Object) cf.field_d.b((byte) -105);
              continue L2;
            }
          }
        }
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        char[] var11 = new char[param0];
        char[] var10 = var11;
        char[] var4 = var10;
        int var5 = param3;
        for (var6 = 0; (param0 ^ -1) < (var6 ^ -1); var6++) {
            var7 = param2[var6 + param1] & 255;
            if (!(-1 == (var7 ^ -1))) {
                if (128 <= var7) {
                    if (!(-161 >= (var7 ^ -1))) {
                        var8 = fh.field_e[var7 - 128];
                        if (!(var8 != 0)) {
                            var8 = 63;
                        }
                        var7 = var8;
                    }
                }
                var5++;
                var4[var5] = (char)var7;
            }
        }
        return new String(var11, 0, var5);
    }

    final static bi[] b(int param0) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        bi[] var1 = new bi[ef.field_l];
        for (var2 = param0; ef.field_l > var2; var2++) {
            var1[var2] = new bi(e.field_e, uf.field_k, vg.field_I[var2], b.field_b[var2], ij.field_H[var2], ob.field_a[var2], of.field_d[var2], rd.field_d);
        }
        c.o(-28210);
        return var1;
    }

    public static void a(int param0) {
        int var1 = 20 % ((-74 - param0) / 41);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = 0;
        field_b = "members-only content";
        field_d = 61453;
    }
}
