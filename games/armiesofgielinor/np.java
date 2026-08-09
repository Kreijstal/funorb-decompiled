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
                this.d((byte) 111);
            }
            this.field_Sb[this.field_Lb] = new nf(0L, (je) null, (je) null, this.field_Tb, param3, param1);
            this.field_Sb[this.field_Lb].field_mb = this.field_Ub;
            this.field_Sb[this.field_Lb].field_ub = true;
            this.field_Sb[this.field_Lb].field_Fb = 1;
            this.a(this.field_Sb[this.field_Lb], 86);
            this.field_Mb[this.field_Lb] = param2;
            this.field_Lb = this.field_Lb + 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "np.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    np(np param0) {
        this(param0, param0.field_Ub, param0.field_Nb, param0.field_Tb, param0.field_Rb, param0.field_Pb, param0.field_Yb, param0.field_Xb, param0.field_Ib);
    }

    final static void a(boolean param0, byte param1) {
        if (!cd.c(9501)) {
            return;
        }
        if (param0) {
            qn.b(0, 0, qn.field_l, qn.field_g, 0, 192);
        }
        ee.field_v.a(0, -118, 0);
        if (param1 >= -111) {
            gd var3 = (gd) null;
            np.a(false, (gd) null);
        }
    }

    final boolean d(byte param0) {
        if (param0 < 59) {
            return false;
        }
        if (!(1 == (this.field_Kb ^ -1))) {
            return false;
        }
        if (rs.field_q == 13) {
            this.field_Kb = -1;
            return true;
        }
        return true;
    }

    final static void k(int param0) {
        rs.field_t = 0;
        if (param0 <= 63) {
            field_Jb = (String) null;
        }
        hh.a((byte) 126);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 == (this.field_Lb ^ -1)) {
            this.field_Sb[this.field_Lb] = new nf(0L, (je) null, (je) null, this.field_Nb, (wk) null, va.field_F);
            this.field_Sb[this.field_Lb].field_Fb = 1;
            this.a(this.field_Sb[this.field_Lb], 43);
            this.field_Mb[this.field_Lb] = -1;
            this.field_Lb = this.field_Lb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 == -118) {
          var6 = 0;
          var7 = 0;
          L1: while (true) {
            if (var7 >= this.field_Lb) {
              var6 = var6 + 2 * this.field_Rb;
              var7 = this.field_Xb + this.field_Lb * this.field_Ib + this.field_Xb;
              var8 = jp.a(param4, param2, var6, -1);
              var9 = pd.a(var7, 0, param1, param0);
              this.a(var7, -20500, var6, var9, var8);
              var10 = 0;
              L2: while (true) {
                if (this.field_Lb <= var10) {
                  return;
                } else {
                  this.field_Sb[var10].a(this.field_Ib, this.field_Pb, -30061, -(2 * this.field_Rb) + var6, this.field_Ib * var10 + this.field_Xb, this.field_Rb, this.field_Yb);
                  var10++;
                  continue L2;
                }
              }
            } else {
              var8 = this.field_Sb[var7].a(param3 ^ 35, this.field_Yb, this.field_Pb);
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
        this.field_Sb = new nf[256];
        this.field_Kb = -2;
        this.field_Mb = new int[256];
        try {
            this.field_Rb = param4;
            this.field_Nb = param2;
            this.field_Pb = param5;
            this.field_Ub = param1;
            this.field_Yb = param6;
            this.field_Ib = param8;
            this.field_Xb = param7;
            this.field_Tb = param3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "np.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void e(byte param0) {
        field_Qb = null;
        if (param0 != 5) {
            np.k(-69);
        }
        field_Jb = null;
        field_Vb = (int[][]) null;
        field_Ob = null;
    }

    final void a(int param0, String param1, byte param2) {
        try {
            if (param2 >= -98) {
                np.k(-112);
            }
            this.field_Sb[this.field_Lb] = new nf(0L, (je) null, (je) null, this.field_Tb, (wk) null, param1);
            this.field_Sb[this.field_Lb].field_mb = this.field_Ub;
            this.field_Sb[this.field_Lb].field_ub = true;
            this.field_Sb[this.field_Lb].field_Fb = 1;
            this.a(this.field_Sb[this.field_Lb], 55);
            this.field_Mb[this.field_Lb] = param0;
            this.field_Lb = this.field_Lb + 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "np.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
            throw ig.a((Throwable) ((Object) runtimeException), "np.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(true, param1);
        if (!param1) {
          return -2;
        } else {
          L0: {
            var3 = 0;
            if (param0 > 93) {
              break L0;
            } else {
              this.field_Kb = -92;
              break L0;
            }
          }
          L1: while (true) {
            if (var3 >= this.field_Lb) {
              if (tr.field_A != 0) {
                return -1;
              } else {
                return this.field_Kb;
              }
            } else {
              if ((this.field_Sb[var3].field_yb ^ -1) != -1) {
                return this.field_Mb[var3];
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        field_Vb = new int[][]{new int[]{0, 0, 0}, new int[]{2, 0, 0}, new int[]{5, 0, 0}, new int[]{10, 0, 0}, new int[]{0, 2, 0}, new int[]{0, 3, 0}, new int[]{0, 0, 1}};
        field_Jb = "Cancel draw";
        field_Ob = "Mind control";
    }
}
