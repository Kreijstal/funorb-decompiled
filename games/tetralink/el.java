/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends hl {
    boolean field_uc;
    static hl[] field_oc;
    static String field_dc;
    hl field_Rb;
    hl field_yc;
    boolean field_Wb;
    long field_cc;
    hl field_Xb;
    int field_rc;
    String[] field_fc;
    byte[] field_sc;
    long field_Ac;
    int field_Zb;
    boolean field_xc;
    boolean field_kc;
    int field_Qb;
    static float[] field_Nb;
    hl field_Bc;
    hl field_ac;
    hl field_pc;
    hl field_zc;
    int field_bc;
    String field_ec;
    boolean field_mc;
    hl field_Mb;
    hl field_nc;
    static String field_qc;
    static String field_Ob;
    hl field_wc;
    hl field_Tb;
    hl field_Yb;
    static String field_Sb;
    int field_gc;
    hl field_Pb;
    boolean field_Kb;
    int field_ic;
    hl field_vc;
    hl[] field_Lb;
    int field_jc;
    hl field_lc;
    int field_Ub;
    static long field_tc;
    boolean field_Vb;
    hl field_hc;

    final boolean a(int param0, el param1) {
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_22_0 = false;
        boolean stackIn_29_0 = false;
        int stackIn_33_0 = 0;
        boolean stackIn_37_0 = false;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_60_0 = 0;
        boolean stackIn_64_0 = false;
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
          if (param0 != -24) {
            return true;
          }
          if (!this.field_Vb) {
            stackIn_9_0 = (this.field_gc == 6) ? 1 : 0;
          } else {
            stackIn_9_0 = 1;
          }
          var3_int = stackIn_9_0;
          if (!param1.field_Vb) {
            stackIn_15_0 = (param1.field_gc == 6) ? 1 : 0;
          } else {
            stackIn_15_0 = 1;
          }
          var4 = stackIn_15_0;
          if (var3_int != var4) {
            stackIn_17_0 = var3_int;
            return stackIn_17_0 != 0;
          }
          if (var3_int == 0) {
            if (param1.field_xc != this.field_xc) {
              stackIn_22_0 = this.field_xc;
              return stackIn_22_0;
            }
            if (this.field_xc &&
              param1.field_ic != this.field_ic) {
              stackIn_29_0 = !(param1.field_ic <= this.field_ic);
              return stackIn_29_0;
            }
          }
          stackIn_33_0 = (param1.field_Kb) ? 0 : 1;
          if (stackIn_33_0 == (this.field_Kb ? 1 : 0)) {
            stackIn_37_0 = !(this.field_Kb);
            return stackIn_37_0;
          }
          if (!this.field_Kb) {
            stackIn_68_0 = !(this.field_Ac >= param1.field_Ac);
            return stackIn_68_0;
          }
          if (this.field_kc) {
            stackIn_45_0 = 1;
          } else {
            stackIn_45_0 = (this.field_Zb == 2) ? 1 : 0;
          }
          var5 = stackIn_45_0;
          if (!param1.field_kc) {
            stackIn_51_0 = (param1.field_Zb == 2) ? 1 : 0;
          } else {
            stackIn_51_0 = 1;
          }
          var6 = stackIn_51_0;
          stackIn_54_0 = (var6 != 0) ? 0 : 1;
          if (var5 != 0) {
            stackIn_57_1 = 0;
          } else {
            stackIn_57_1 = 1;
          }
          if (stackIn_54_0 != stackIn_57_1) {
            stackIn_60_0 = var5;
            return stackIn_60_0 != 0;
          }
          stackIn_64_0 = !(this.field_Ac <= param1.field_Ac);
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_71_0 = var3;
          stackIn_71_1 = new StringBuilder().append("el.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    el(int param0) {
        super(0L, (hl) null);
        this.field_sc = new byte[param0];
    }

    public static void i(int param0) {
        field_Ob = null;
        field_Sb = null;
        field_Nb = null;
        field_dc = null;
        if (param0 == 0) {
          field_qc = null;
          field_oc = null;
          return;
        }
        field_tc = -37L;
        field_qc = null;
        field_oc = null;
    }

    final static oh[] a(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        oh var14 = null;
        oh var15 = null;
        int[] var17 = ra.field_b;
        int[] var16 = var17;
        int[] var13 = var16;
        int[] var6 = var13;
        int var7 = ra.field_f;
        int var8 = ra.field_e;
        oh var9 = new oh(16, param4);
        var9.c();
        ra.b(0, 0, 16, param4, param2, param5);
        Object var10 = null;
        Object var11 = null;
        if (param0) {
          var14 = var9.d();
          var10 = var14;
          var14.c();
          ra.g(0, 0, 5, 0);
          ra.g(0, 1, 3, 0);
          ra.g(0, 2, 2, 0);
          ra.g(0, 3, 1, 0);
          ra.g(0, 4, 1, 0);
        }
        if (param3) {
          var15 = var9.d();
          var11 = var15;
          var15.c();
          ra.g(11, 0, 5, 0);
          ra.g(13, 1, 3, 0);
          ra.g(14, 2, 2, 0);
          ra.g(15, 3, 1, 0);
          ra.g(15, 4, 1, 0);
        }
        if (!param1) {
          ra.a(var17, var7, var8);
          return new oh[]{null, null, null, (oh) (var10), var9, (oh) (var11), null, null, null};
        }
        java.applet.Applet var12 = (java.applet.Applet) null;
        el.a(113, (java.applet.Applet) null);
        ra.a(var17, var7, var8);
        return new oh[]{null, null, null, (oh) (var10), var9, (oh) (var11), null, null, null};
    }

    final static void d(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        ja.field_f = param1;
        if (ma.field_f != th.field_g) {
          var2 = ma.field_f * ma.field_f;
          var3 = var2 - th.field_g * th.field_g;
          param1 = param1 + var3 * (-param1 + te.field_P) / var2;
        }
        oj.field_a.a((byte) -86, 640, param1, 120, vi.field_d);
        qh.a(param0, eh.field_w, 640, te.field_P - 24, 1000000, fn.field_Q, 0);
    }

    final int j(int param0) {
        if (param0 <= 0) {
          return (int)this.c(97);
        }
        el.a(true, true, -55, true, 112, 121);
        return (int)this.c(97);
    }

    final static kh[] a(ah param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kh[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(-1, param2);
          if (param3 != -1409) {
            field_Ob = (String) null;
          }
          var5 = param0.a(var4_int, false, param1);
          stackIn_3_0 = fd.a(false, var5, var4_int, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("el.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException var2_ref = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(ai.a(var2, (byte) -113, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param0 == 16) {
              return;
            }
            el.d(64, -26);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("el.H(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean h(int param0) {
        if (param0 == -597) {
          return !this.a(2) ? true : false;
        }
        this.field_kc = false;
        return !this.a(2) ? true : false;
    }

    static {
        field_Sb = "Join";
        field_Ob = "Find opponent";
        field_qc = "Unable to add friend - system busy";
        field_dc = "Friends";
    }
}
