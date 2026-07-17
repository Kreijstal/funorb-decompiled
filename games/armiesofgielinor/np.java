/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends je {
    static df field_Qb;
    private nf[] field_Sb;
    private int field_Kb;
    static int field_Wb;
    private int field_Xb;
    static int[][] field_Vb;
    static String field_Jb;
    private wk[] field_Ub;
    private je field_Tb;
    private je field_Nb;
    static String field_Ob;
    private int field_Pb;
    private int field_Lb;
    private int field_Yb;
    private int field_Rb;
    private int[] field_Mb;
    private int field_Ib;

    final void a(boolean param0, String param1, int param2, wk param3) {
        try {
            if (param0) {
                boolean discarded$0 = ((np) this).d((byte) 111);
            }
            ((np) this).field_Sb[((np) this).field_Lb] = new nf(0L, (je) null, (je) null, ((np) this).field_Tb, param3, param1);
            ((np) this).field_Sb[((np) this).field_Lb].field_mb = ((np) this).field_Ub;
            ((np) this).field_Sb[((np) this).field_Lb].field_ub = true;
            ((np) this).field_Sb[((np) this).field_Lb].field_Fb = 1;
            ((np) this).a((je) (Object) ((np) this).field_Sb[((np) this).field_Lb], 86);
            ((np) this).field_Mb[((np) this).field_Lb] = param2;
            ((np) this).field_Lb = ((np) this).field_Lb + 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "np.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    np(np param0) {
        this((je) (Object) param0, param0.field_Ub, param0.field_Nb, param0.field_Tb, param0.field_Rb, param0.field_Pb, param0.field_Yb, param0.field_Xb, param0.field_Ib);
    }

    final static void a(boolean param0, byte param1) {
        if (!cd.c(9501)) {
            return;
        }
        if (param0) {
            qn.b(0, 0, qn.field_l, qn.field_g, 0, 192);
        }
        ee.field_v.a(0, -118, 0);
    }

    final boolean d(byte param0) {
        if (param0 < 59) {
            return false;
        }
        if (!(((np) this).field_Kb == -2)) {
            return false;
        }
        if (rs.field_q == 13) {
            ((np) this).field_Kb = -1;
            return true;
        }
        return true;
    }

    final static void k(int param0) {
        rs.field_t = 0;
        if (param0 <= 63) {
            field_Jb = null;
        }
        hh.a((byte) 126);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((np) this).field_Lb == 0) {
            ((np) this).field_Sb[((np) this).field_Lb] = new nf(0L, (je) null, (je) null, ((np) this).field_Nb, (wk) null, va.field_F);
            ((np) this).field_Sb[((np) this).field_Lb].field_Fb = 1;
            ((np) this).a((je) (Object) ((np) this).field_Sb[((np) this).field_Lb], 43);
            ((np) this).field_Mb[((np) this).field_Lb] = -1;
            ((np) this).field_Lb = ((np) this).field_Lb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 == -118) {
          var6 = 0;
          var7 = 0;
          L1: while (true) {
            if (var7 >= ((np) this).field_Lb) {
              var6 = var6 + 2 * ((np) this).field_Rb;
              var7 = ((np) this).field_Xb + ((np) this).field_Lb * ((np) this).field_Ib + ((np) this).field_Xb;
              var8 = jp.a(param4, param2, var6, -1);
              var9 = pd.a(var7, 0, param1, param0);
              ((np) this).a(var7, -20500, var6, var9, var8);
              var10 = 0;
              L2: while (true) {
                if (((np) this).field_Lb <= var10) {
                  return;
                } else {
                  ((np) this).field_Sb[var10].a(((np) this).field_Ib, ((np) this).field_Pb, -30061, -(2 * ((np) this).field_Rb) + var6, ((np) this).field_Ib * var10 + ((np) this).field_Xb, ((np) this).field_Rb, ((np) this).field_Yb);
                  var10++;
                  continue L2;
                }
              }
            } else {
              var8 = ((np) this).field_Sb[var7].a(param3 ^ 35, ((np) this).field_Yb, ((np) this).field_Pb);
              if (var6 < var8) {
                var6 = var8;
                var7++;
                continue L1;
              } else {
                var7++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    np(je param0, wk[] param1, je param2, je param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((np) this).field_Sb = new nf[256];
        ((np) this).field_Kb = -2;
        ((np) this).field_Mb = new int[256];
        try {
            ((np) this).field_Rb = param4;
            ((np) this).field_Nb = param2;
            ((np) this).field_Pb = param5;
            ((np) this).field_Ub = param1;
            ((np) this).field_Yb = param6;
            ((np) this).field_Ib = param8;
            ((np) this).field_Xb = param7;
            ((np) this).field_Tb = param3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "np.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    public static void e(byte param0) {
        field_Qb = null;
        if (param0 != 5) {
            np.k(-69);
        }
        field_Jb = null;
        field_Vb = null;
        field_Ob = null;
    }

    final void a(int param0, String param1, byte param2) {
        try {
            if (param2 >= -98) {
                np.k(-112);
            }
            ((np) this).field_Sb[((np) this).field_Lb] = new nf(0L, (je) null, (je) null, ((np) this).field_Tb, (wk) null, param1);
            ((np) this).field_Sb[((np) this).field_Lb].field_mb = ((np) this).field_Ub;
            ((np) this).field_Sb[((np) this).field_Lb].field_ub = true;
            ((np) this).field_Sb[((np) this).field_Lb].field_Fb = 1;
            ((np) this).a((je) (Object) ((np) this).field_Sb[((np) this).field_Lb], 55);
            ((np) this).field_Mb[((np) this).field_Lb] = param0;
            ((np) this).field_Lb = ((np) this).field_Lb + 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "np.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0, gd param1) {
        int var2_int = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            if (param0) {
                np.e((byte) 102);
            }
            for (var2_int = 0; var2_int < param1.field_I; var2_int++) {
                param1.field_o[var2_int] = 0;
            }
            param1.field_R = ih.field_E;
            param1.field_Z = ih.field_E;
            param1.field_t = ih.field_E;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "np.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(byte param0, boolean param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((np) this).a(true, param1);
        if (!(param1)) {
            return -2;
        }
        int var3 = 0;
        if (param0 <= 93) {
            ((np) this).field_Kb = -92;
        }
        while (var3 < ((np) this).field_Lb) {
            if (!(((np) this).field_Sb[var3].field_yb == 0)) {
                return ((np) this).field_Mb[var3];
            }
            var3++;
        }
        if (!(tr.field_A == 0)) {
            return -1;
        }
        return ((np) this).field_Kb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Vb = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_Jb = "Cancel draw";
        field_Ob = "Mind control";
    }
}
