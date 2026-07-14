/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static int field_a;
    static int field_c;
    static int field_d;
    private int[] field_b;

    final static java.awt.Container b(int param0) {
        if (param0 != 24255) {
            field_c = -116;
        }
        if (!(null == nd.field_f)) {
            return (java.awt.Container) (Object) nd.field_f;
        }
        return (java.awt.Container) (Object) bm.c(-74);
    }

    final static hg a(int param0) {
        if (param0 != 858) {
            field_d = -63;
        }
        return hj.field_f;
    }

    final static void a(boolean param0, String param1, int param2) {
        int var3 = 0;
        wc.field_b = false;
        wi.field_C = false;
        if (null != sj.field_h) {
            if (!sj.field_h.field_K) {
            } else {
                if (param2 == 8) {
                    if (!gd.field_B) {
                        param1 = j.field_a;
                    } else {
                        param1 = pj.field_d;
                    }
                    param2 = 2;
                    di.field_D.a(pl.field_a, 69);
                }
                var3 = 1;
                if (10 == param2) {
                    bj.a(0);
                    var3 = 0;
                }
                if (!(var3 == 0)) {
                    if (!(!wi.field_C)) {
                        param1 = oa.a((byte) -93, fe.field_r, new String[1]);
                    }
                    if (oh.field_F) {
                        param1 = jg.field_j;
                    }
                    sj.field_h.a(param1, param2, (byte) -115);
                }
                if (256 != param2) {
                    if (param2 != 10) {
                        if (!(gd.field_B)) {
                            di.field_D.n(-6);
                        }
                    }
                }
            }
        }
        if (!param0) {
            Object var4 = null;
            da.a(false, (String) null, 106);
        }
    }

    da(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length - -(param0.length >> -1975875647)) {
            var2 = var2 << 1;
        }
        ((da) this).field_b = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((da) this).field_b[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3] & var2 + -1;
            while ((((da) this).field_b[1 + (var4 + var4)] ^ -1) != 0) {
                var4 = var2 + -1 & 1 + var4;
            }
            ((da) this).field_b[var4 + var4] = param0[var3];
            ((da) this).field_b[1 + (var4 - -var4)] = var3;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = -1 + (((da) this).field_b.length >> 1856600705);
          var4 = param1 & var3;
          if (param0 == -71) {
            break L0;
          } else {
            field_a = 116;
            break L0;
          }
        }
        L1: while (true) {
          var5 = ((da) this).field_b[var4 - -var4 + 1];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (param1 == ((da) this).field_b[var4 + var4]) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
