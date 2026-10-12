/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class au extends je {
    int field_Ub;
    boolean field_vc;
    je field_ec;
    je field_Wb;
    int field_qc;
    static ih field_Kb;
    je field_sc;
    static String field_Jb;
    je field_hc;
    int field_mc;
    je field_Rb;
    je field_fc;
    int field_ac;
    byte[] field_pc;
    je field_Xb;
    int field_Lb;
    String[] field_jc;
    long field_dc;
    je field_ic;
    boolean field_Sb;
    je field_oc;
    boolean field_uc;
    int field_bc;
    je field_Pb;
    int field_nc;
    je field_cc;
    je[] field_Qb;
    je field_Zb;
    int field_Tb;
    boolean field_kc;
    String field_rc;
    long field_Mb;
    je field_Yb;
    je field_lc;
    static int field_Ob;
    boolean field_gc;
    boolean field_Nb;
    boolean field_tc;
    je field_Vb;
    je field_Ib;

    public static void e(byte param0) {
        if (param0 > -52) {
          return;
        }
        field_Jb = null;
        field_Kb = null;
    }

    final boolean k(int param0) {
        if (param0 == -7) {
          return !this.isSecondaryLinked((byte) 90) ? true : false;
        }
        this.d((byte) -65);
        return !this.isSecondaryLinked((byte) 90) ? true : false;
    }

    final int d(byte param0) {
        int var2 = -52 / ((35 - param0) / 38);
        return (int)this.getSecondaryKey(116);
    }

    au(int param0) {
        super(0L, (je) null);
        this.field_pc = new byte[param0];
    }

    final boolean a(byte param0, au param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_31_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_41_0 = false;
        int stackIn_42_1 = 0;
        boolean stackIn_47_0 = false;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        boolean stackIn_67_0 = false;
        boolean stackIn_71_0 = false;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param0 > -13) {
            this.field_pc = (byte[]) null;
          }
          if (!this.field_Nb) {
            stackIn_8_0 = (this.field_mc == 6) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var3_int = stackIn_8_0;
          if (!param1.field_Nb) {
            stackIn_14_0 = (param1.field_mc == 6) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var4 = stackIn_14_0;
          stackIn_17_0 = (var3_int != 0) ? 0 : 1;
          if (stackIn_17_0 == var4) {
            stackIn_20_0 = var3_int;
            return stackIn_20_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_25_0 = (this.field_Sb) ? 0 : 1;
            if (param1.field_Sb) {
              stackIn_28_1 = 0;
            } else {
              stackIn_28_1 = 1;
            }
            if (stackIn_25_0 != stackIn_28_1) {
              stackIn_31_0 = this.field_Sb;
              return stackIn_31_0;
            }
            if (this.field_Sb &&
              param1.field_Tb != this.field_Tb) {
              stackIn_38_0 = !(this.field_Tb >= param1.field_Tb);
              return stackIn_38_0;
            }
          }
          stackIn_41_0 = param1.field_kc;
          if (this.field_kc) {
            stackIn_42_1 = 0;
          } else {
            stackIn_42_1 = 1;
          }
          if ((stackIn_41_0 ? 1 : 0) == stackIn_42_1) {
            stackIn_47_0 = !(this.field_kc);
            return stackIn_47_0;
          }
          if (!this.field_kc) {
            stackIn_71_0 = !(this.field_Mb >= param1.field_Mb);
            return stackIn_71_0;
          }
          if (this.field_tc) {
            stackIn_55_0 = 1;
          } else {
            stackIn_55_0 = (this.field_ac == 2) ? 1 : 0;
          }
          var5 = stackIn_55_0;
          if (!param1.field_tc) {
            stackIn_61_0 = (param1.field_ac == 2) ? 1 : 0;
          } else {
            stackIn_61_0 = 1;
          }
          var6 = stackIn_61_0;
          if (var5 == var6) {
            stackIn_67_0 = !(param1.field_Mb >= this.field_Mb);
            return stackIn_67_0;
          }
          stackIn_63_0 = var5;
          return stackIn_63_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_74_0 = var3;
          stackIn_74_1 = new StringBuilder().append("au.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    static {
        field_Jb = "Invite more players, or alternatively try changing the following settings:  ";
        field_Ob = 0;
    }
}
