/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ci {
    ci field_gc;
    long field_Fb;
    ci field_Ib;
    int field_Mb;
    ci field_fc;
    ci field_Nb;
    int field_ic;
    int field_Xb;
    boolean field_dc;
    byte[] field_sc;
    boolean field_Vb;
    long field_Jb;
    boolean field_Yb;
    ci field_Qb;
    ci field_uc;
    ci field_Lb;
    int field_Hb;
    ci field_nc;
    int field_jc;
    ci field_Sb;
    int field_hc;
    static int field_rc;
    boolean field_Tb;
    ci field_tc;
    static ci field_cc;
    ci[] field_Ob;
    boolean field_lc;
    static ci field_vc;
    ci field_Rb;
    static String field_bc;
    static String[][] field_qc;
    ci field_mc;
    String field_Gb;
    int field_Ub;
    static int field_oc;
    boolean field_Pb;
    ci field_Zb;
    String[] field_ec;
    boolean field_ac;
    ci field_Wb;
    ci field_kc;
    int field_pc;
    static boolean field_Kb;
    ci field_Eb;

    final static hg[] l(int param0) {
        if (param0 == 2) {
          return new hg[]{ej.field_c, ig.field_d, ah.field_g, ka.field_j, an.field_b, ql.field_g, wg.field_r, me.field_b, ob.field_v, mf.field_m, ag.field_g, nj.field_v, ua.field_a, dm.field_c};
        }
        return (hg[]) null;
    }

    final int g(byte param0) {
        if (param0 >= -74) {
          return 25;
        }
        return (int)this.a(0);
    }

    public static void k(int param0) {
        field_cc = null;
        field_vc = null;
        if (param0 == 0) {
          field_qc = (String[][]) null;
          field_bc = null;
          return;
        }
        field_cc = (ci) null;
        field_qc = (String[][]) null;
        field_bc = null;
    }

    ln(int param0) {
        super(0L, (ci) null);
        this.field_sc = new byte[param0];
    }

    final boolean a(int param0, ln param1) {
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        boolean stackIn_29_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_39_0 = false;
        int stackIn_40_1 = 0;
        boolean stackIn_44_0 = false;
        boolean stackIn_49_0 = false;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        boolean stackIn_68_0 = false;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param0 != -7) {
            return true;
          }
          if (!this.field_dc) {
            stackIn_9_0 = (6 == this.field_jc) ? 1 : 0;
          } else {
            stackIn_9_0 = 1;
          }
          var3_int = stackIn_9_0;
          if (!param1.field_dc) {
            stackIn_15_0 = (param1.field_jc == 6) ? 1 : 0;
          } else {
            stackIn_15_0 = 1;
          }
          var4 = stackIn_15_0;
          stackIn_18_0 = (var4 != 0) ? 0 : 1;
          if (stackIn_18_0 == var3_int) {
            stackIn_21_0 = var3_int;
            return stackIn_21_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_26_0 = (param1.field_Pb) ? 0 : 1;
            if (stackIn_26_0 == (this.field_Pb ? 1 : 0)) {
              stackIn_29_0 = this.field_Pb;
              return stackIn_29_0;
            }
            if (this.field_Pb &&
              param1.field_ic != this.field_ic) {
              stackIn_36_0 = !(param1.field_ic <= this.field_ic);
              return stackIn_36_0;
            }
          }
          stackIn_39_0 = this.field_Vb;
          if (param1.field_Vb) {
            stackIn_40_1 = 0;
          } else {
            stackIn_40_1 = 1;
          }
          if ((stackIn_39_0 ? 1 : 0) == stackIn_40_1) {
            stackIn_44_0 = !(this.field_Vb);
            return stackIn_44_0;
          }
          if (!this.field_Vb) {
            stackIn_49_0 = !(this.field_Jb >= param1.field_Jb);
            return stackIn_49_0;
          }
          if (this.field_ac) {
            stackIn_56_0 = 1;
          } else {
            stackIn_56_0 = (2 == this.field_Mb) ? 1 : 0;
          }
          var5 = stackIn_56_0;
          if (!param1.field_ac) {
            stackIn_62_0 = (param1.field_Mb == 2) ? 1 : 0;
          } else {
            stackIn_62_0 = 1;
          }
          var6 = stackIn_62_0;
          if (var6 == var5) {
            stackIn_68_0 = !(this.field_Jb <= param1.field_Jb);
            return stackIn_68_0;
          }
          stackIn_64_0 = var5;
          return stackIn_64_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_71_0 = var3;
          stackIn_71_1 = new StringBuilder().append("ln.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final static void f(byte param0) {
        if (param0 != -74) {
          ln.k(-24);
          bo.a(bh.i(81), (byte) -12);
          return;
        }
        bo.a(bh.i(81), (byte) -12);
    }

    final boolean m(int param0) {
        if (param0 == -23901) {
          return !this.e(-4) ? true : false;
        }
        this.field_gc = (ci) null;
        return !this.e(-4) ? true : false;
    }

    static {
        field_rc = 0;
        field_bc = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
