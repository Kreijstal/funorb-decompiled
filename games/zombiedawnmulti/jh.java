/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends cj {
    static ja[] field_Hb;
    cj field_Rb;
    byte[] field_Zb;
    boolean field_Wb;
    int field_Ub;
    boolean field_Fb;
    long field_qc;
    cj field_Ib;
    cj field_gc;
    boolean field_dc;
    cj field_jc;
    int field_Pb;
    int field_Vb;
    cj field_Xb;
    cj field_Lb;
    boolean field_Mb;
    boolean field_lc;
    String field_Nb;
    cj field_ec;
    boolean field_rc;
    cj field_hc;
    int field_cc;
    cj field_Kb;
    cj field_kc;
    int field_Sb;
    cj field_Tb;
    cj field_Yb;
    cj field_oc;
    cj field_ac;
    String[] field_bc;
    static int field_ic;
    cj field_pc;
    int field_Jb;
    boolean field_Ob;
    int field_mc;
    long field_nc;
    cj field_Gb;
    cj[] field_Qb;
    int field_fc;

    final boolean a(jh param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_24_0 = false;
        boolean stackIn_31_0 = false;
        boolean stackIn_37_0 = false;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        boolean stackIn_61_0 = false;
        boolean stackIn_65_0 = false;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          if (!this.field_lc) {
            stackIn_6_0 = (this.field_Vb == 6) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          var4 = -64 % ((30 - param1) / 56);
          if (!param0.field_lc) {
            stackIn_12_0 = (param0.field_Vb == 6) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          var5 = stackIn_12_0;
          if (var5 != var3_int) {
            stackIn_14_0 = var3_int;
            return stackIn_14_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_19_0 = (param0.field_Ob) ? 0 : 1;
            if (this.field_Ob) {
              stackIn_22_1 = 0;
            } else {
              stackIn_22_1 = 1;
            }
            if (stackIn_19_0 != stackIn_22_1) {
              stackIn_24_0 = this.field_Ob;
              return stackIn_24_0;
            }
            if (this.field_Ob &&
              this.field_Pb != param0.field_Pb) {
              stackIn_31_0 = !(param0.field_Pb <= this.field_Pb);
              return stackIn_31_0;
            }
          }
          if (this.field_Fb != param0.field_Fb) {
            stackIn_37_0 = !(this.field_Fb);
            return stackIn_37_0;
          }
          if (!this.field_Fb) {
            stackIn_65_0 = !(this.field_qc >= param0.field_qc);
            return stackIn_65_0;
          }
          if (this.field_Wb) {
            stackIn_45_0 = 1;
          } else {
            stackIn_45_0 = (this.field_fc == 2) ? 1 : 0;
          }
          var6 = stackIn_45_0;
          if (!param0.field_Wb) {
            stackIn_51_0 = (param0.field_fc == 2) ? 1 : 0;
          } else {
            stackIn_51_0 = 1;
          }
          var7 = stackIn_51_0;
          stackIn_54_0 = (var6 != 0) ? 0 : 1;
          if (stackIn_54_0 == var7) {
            stackIn_57_0 = var6;
            return stackIn_57_0 != 0;
          }
          stackIn_61_0 = !(this.field_qc <= param0.field_qc);
          return stackIn_61_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_68_0 = var3;
          stackIn_68_1 = new StringBuilder().append("jh.AA(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(')').toString());
        }
    }

    final int i(int param0) {
        if (param0 != 6) {
          this.field_Pb = 20;
          return (int)this.d(-108);
        }
        return (int)this.d(-108);
    }

    final boolean j(int param0) {
        if (param0 == 2) {
          return !this.c(0) ? true : false;
        }
        this.field_pc = (cj) null;
        return !this.c(0) ? true : false;
    }

    jh(int param0) {
        super(0L, (cj) null);
        this.field_Zb = new byte[param0];
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            oe.field_c = param2;
            try {
              var6 = param0.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (~param2.length() == param1) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + ke.a(-29971, bl.a((byte) 113) + 94608000000L) + "; Max-Age=" + 94608000L;
              }
              fo.a(param0, 14575, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (Throwable throwable) {
            }
            ak.a(param1 + 14159, param0);
          } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "jh.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        field_Hb = null;
        int var1 = 18 / ((82 - param0) / 43);
    }

    static {
    }
}
