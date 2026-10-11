/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends w {
    int field_Ub;
    String field_Vb;
    w field_Tb;
    w field_Ec;
    static ck[][] field_uc;
    static String field_Gc;
    boolean field_Cc;
    static int[] field_ic;
    static int field_hc;
    boolean field_Zb;
    int field_mc;
    w field_Pb;
    long field_tc;
    w field_ec;
    int field_Nb;
    w field_yc;
    w field_bc;
    boolean field_wc;
    int field_Wb;
    w field_Sb;
    w field_Fc;
    static boolean field_Qb;
    static boolean field_Hc;
    int field_rc;
    boolean field_lc;
    w field_jc;
    w field_pc;
    boolean field_gc;
    boolean field_Ob;
    static w field_vc;
    String[] field_xc;
    w field_Yb;
    int field_oc;
    w field_Bc;
    w field_zc;
    w field_Ac;
    static String field_cc;
    static boolean field_ac;
    boolean field_Ic;
    w[] field_fc;
    w field_Dc;
    int field_qc;
    long field_Xb;
    static ck field_dc;
    int field_Rb;
    byte[] field_kc;
    w field_sc;
    static int field_nc;

    public static void h(byte param0) {
        field_uc = (ck[][]) null;
        if (param0 == 116) {
          field_cc = null;
          field_Gc = null;
          field_vc = null;
          field_dc = null;
          field_ic = null;
          return;
        }
        ve.g((byte) 54);
        field_cc = null;
        field_Gc = null;
        field_vc = null;
        field_dc = null;
        field_ic = null;
    }

    final static boolean g(byte param0) {
        int var1 = -89 % ((76 - param0) / 36);
        if (vh.field_h == null) {
          return false;
        }
        if (vh.field_h.f(261)) {
          return true;
        }
        return false;
    }

    final boolean i(byte param0) {
        if (param0 > 98) {
          return !this.d((byte) -68) ? true : false;
        }
        ve.g((byte) 106);
        return !this.d((byte) -68) ? true : false;
    }

    final int e(int param0) {
        int var2 = 113 / ((param0 - 24) / 54);
        return (int)this.c((byte) 57);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = client.field_A ? 1 : 0;
        try {
          if (param6 != 9) {
            ve.h((byte) 90);
          }
          param5--;
          while (param5 >= 0) {
            var17 = param7;
            var10 = var17;
            var11 = param1;
            var12 = param4;
            var13 = param0;
            var14 = param8;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = var15 + lb.a(65280, var13 >> 9) + (lb.a(var12 >> 1, 16711680) + lb.a(var14 >> 17, 255));
            param4 = param4 + param3;
            param1++;
            param8 = param8 + param9;
            param0 = param0 + param2;
            param5--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_10_0 = var10_ref;
          stackIn_10_1 = new StringBuilder().append("ve.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    ve(int param0) {
        super(0L, (w) null);
        this.field_kc = new byte[param0];
    }

    final static String c(int param0, int param1) {
        if (param1 == 26135) {
          return param0 + 1 + "/" + 4;
        }
        return (String) null;
    }

    final boolean a(ve param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        boolean stackIn_26_0 = false;
        boolean stackIn_33_0 = false;
        boolean stackIn_36_0 = false;
        int stackIn_37_1 = 0;
        boolean stackIn_42_0 = false;
        boolean stackIn_47_0 = false;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_70_0 = false;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param1) {
            return true;
          }
          if (!this.field_Zb) {
            stackIn_9_0 = (this.field_oc == 6) ? 1 : 0;
          } else {
            stackIn_9_0 = 1;
          }
          var3_int = stackIn_9_0;
          if (!param0.field_Zb) {
            stackIn_15_0 = (param0.field_oc == 6) ? 1 : 0;
          } else {
            stackIn_15_0 = 1;
          }
          var4 = stackIn_15_0;
          if (var4 != var3_int) {
            stackIn_18_0 = var3_int;
            return stackIn_18_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_24_0 = (param0.field_gc) ? 0 : 1;
            if (stackIn_24_0 == (this.field_gc ? 1 : 0)) {
              stackIn_26_0 = this.field_gc;
              return stackIn_26_0;
            }
            if (this.field_gc &&
              param0.field_Wb != this.field_Wb) {
              stackIn_33_0 = !(this.field_Wb >= param0.field_Wb);
              return stackIn_33_0;
            }
          }
          stackIn_36_0 = this.field_lc;
          if (param0.field_lc) {
            stackIn_37_1 = 0;
          } else {
            stackIn_37_1 = 1;
          }
          if ((stackIn_36_0 ? 1 : 0) == stackIn_37_1) {
            stackIn_42_0 = !(this.field_lc);
            return stackIn_42_0;
          }
          if (!this.field_lc) {
            stackIn_47_0 = !(param0.field_tc <= this.field_tc);
            return stackIn_47_0;
          }
          if (this.field_wc) {
            stackIn_54_0 = 1;
          } else {
            stackIn_54_0 = (this.field_qc == 2) ? 1 : 0;
          }
          var5 = stackIn_54_0;
          if (!param0.field_wc) {
            stackIn_60_0 = (param0.field_qc == 2) ? 1 : 0;
          } else {
            stackIn_60_0 = 1;
          }
          var6 = stackIn_60_0;
          stackIn_63_0 = (var5 != 0) ? 0 : 1;
          if (stackIn_63_0 == var6) {
            stackIn_66_0 = var5;
            return stackIn_66_0 != 0;
          }
          stackIn_70_0 = !(param0.field_tc >= this.field_tc);
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_73_0 = var3;
          stackIn_73_1 = new StringBuilder().append("ve.D(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_hc = 10;
        field_uc = new ck[8][];
        field_cc = "You are on <%0>";
        field_ic = new int[]{0, 0, 5, 9, 12, 14, 15, 15, 14, 12, 8, 4, 2, 1};
        field_nc = 1;
    }
}
