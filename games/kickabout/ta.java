/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends qt {
    static int field_A;
    static String field_D;
    static String field_E;
    static String[] field_C;
    static dg field_B;

    ta() {
    }

    final static void a(iw param0, java.math.BigInteger param1, int param2, int param3, byte[] param4, int param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Kickabout.field_G;
          var7 = ql.a(param2, (byte) 122);
          if (jb.field_g != null) {
            break L0;
          } else {
            jb.field_g = new java.security.SecureRandom();
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (var9 >= 4) {
            L2: {
              L3: {
                if (df.field_I == null) {
                  break L3;
                } else {
                  if (df.field_I.field_f.length >= var7) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              df.field_I = new iw(var7);
              break L2;
            }
            L4: {
              L5: {
                df.field_I.field_n = 0;
                df.field_I.a(param3, param2, 1991220144, param4);
                df.field_I.a((byte) 114, var7);
                df.field_I.a(var15, (byte) 53);
                if (uf.field_c == null) {
                  break L5;
                } else {
                  if (-101 < (uf.field_c.field_f.length ^ -1)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              uf.field_c = new iw(100);
              break L4;
            }
            uf.field_c.field_n = 0;
            uf.field_c.a(111, param5);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if (var11 >= 4) {
                uf.field_c.g(param5 + -1207444482, param2);
                uf.field_c.a(param1, param6, param5 ^ 44);
                param0.a(0, uf.field_c.field_n, 1991220144, uf.field_c.field_f);
                param0.a(0, df.field_I.field_n, 1991220144, df.field_I.field_f);
                return;
              } else {
                uf.field_c.b(param5 ^ -103, var15[var11]);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = jb.field_g.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    void a(int param0, int param1, boolean param2) {
        super.a(param0 + param0, param1, param2);
        ic.field_h.a(tu.field_E, (byte) 120);
        da.field_h.b(22997);
        kc.a(ic.field_h.field_x, 415422632);
    }

    final static void e(int param0) {
        qg var1 = (qg) (Object) ik.field_C.h(-126);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        if (param0 < 116) {
            Object var2 = null;
            ta.a((iw) null, (java.math.BigInteger) null, -77, 44, (byte[]) null, -52, (java.math.BigInteger) null);
        }
        on.a(var1.field_h, var1.field_g, var1.field_j);
        on.e(var1.field_e, var1.field_l, var1.field_i, var1.field_f);
        var1.field_h = null;
        tk.field_Ab.a((gn) (Object) var1, 3);
    }

    void a(byte param0, boolean param1) {
        super.a((byte) -36, param1);
        int var3 = 31 / ((38 - param0) / 60);
        tc.a(ic.field_h.field_x, 5464);
    }

    public static void g(byte param0) {
        field_D = null;
        field_C = null;
        field_B = null;
        field_E = null;
        int var1 = 38 / ((param0 - -18) / 47);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new String[16];
        field_E = "Return to game";
        field_D = "Drawn";
    }
}
