/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends ak {
    ak field_Jb;
    boolean field_Ob;
    static String field_Hb;
    static String field_Xb;
    ak field_Wb;
    boolean field_Mb;
    long field_Lb;
    boolean field_dc;
    ak field_ic;
    int field_nc;
    ak[] field_ac;
    ak field_jc;
    boolean field_cc;
    ak field_Kb;
    ak field_Nb;
    String field_pc;
    int field_ec;
    int field_Qb;
    int field_Rb;
    static String field_fc;
    ak field_Gb;
    ak field_Fb;
    boolean field_Pb;
    ak field_Yb;
    ak field_Zb;
    ak field_gc;
    long field_kc;
    String[] field_Ub;
    ak field_Vb;
    int field_bc;
    ak field_rc;
    boolean field_oc;
    int field_mc;
    int field_Ib;
    byte[] field_Eb;
    ak field_Sb;
    ak field_qc;
    int field_Tb;
    boolean field_hc;
    ak field_lc;

    final int c(byte param0) {
        if (param0 != 8) {
          this.field_Eb = (byte[]) null;
          return (int)this.a(true);
        }
        return (int)this.a(true);
    }

    eq(int param0) {
        super(0L, (ak) null);
        this.field_Eb = new byte[param0];
    }

    final boolean j(int param0) {
        if (param0 == 433) {
          return !this.f(0) ? true : false;
        }
        this.field_Wb = (ak) null;
        return !this.f(0) ? true : false;
    }

    public static void b(byte param0) {
        field_Xb = null;
        field_Hb = null;
        field_fc = null;
        int var1 = -86 / ((28 - param0) / 46);
    }

    final boolean a(byte param0, eq param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_31_0 = false;
        boolean stackIn_38_0 = false;
        int stackIn_42_0 = 0;
        boolean stackIn_47_0 = false;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_71_0 = false;
        boolean stackIn_75_0 = false;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (!this.field_cc) {
            stackIn_6_0 = (6 == this.field_Qb) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          if (!param1.field_cc) {
            stackIn_12_0 = (param1.field_Qb == 6) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          var4 = stackIn_12_0;
          stackIn_15_0 = (var4 != 0) ? 0 : 1;
          if (stackIn_15_0 == var3_int) {
            stackIn_18_0 = var3_int;
            return stackIn_18_0 != 0;
          }
          if (param0 <= 23) {
            this.field_Qb = 92;
          }
          if (var3_int == 0) {
            stackIn_25_0 = (this.field_hc) ? 0 : 1;
            if (param1.field_hc) {
              stackIn_28_1 = 0;
            } else {
              stackIn_28_1 = 1;
            }
            if (stackIn_25_0 != stackIn_28_1) {
              stackIn_31_0 = this.field_hc;
              return stackIn_31_0;
            }
            if (this.field_hc &&
              this.field_Ib != param1.field_Ib) {
              stackIn_38_0 = !(param1.field_Ib <= this.field_Ib);
              return stackIn_38_0;
            }
          }
          stackIn_42_0 = (param1.field_dc) ? 0 : 1;
          if (stackIn_42_0 == (this.field_dc ? 1 : 0)) {
            stackIn_47_0 = !(this.field_dc);
            return stackIn_47_0;
          }
          if (!this.field_dc) {
            stackIn_75_0 = !(param1.field_Lb <= this.field_Lb);
            return stackIn_75_0;
          }
          if (this.field_Mb) {
            stackIn_55_0 = 1;
          } else {
            stackIn_55_0 = (2 == this.field_Tb) ? 1 : 0;
          }
          var5 = stackIn_55_0;
          if (!param1.field_Mb) {
            stackIn_61_0 = (param1.field_Tb == 2) ? 1 : 0;
          } else {
            stackIn_61_0 = 1;
          }
          var6 = stackIn_61_0;
          stackIn_63_0 = var5;
          if (var6 != 0) {
            stackIn_64_1 = 0;
          } else {
            stackIn_64_1 = 1;
          }
          if (stackIn_63_0 == stackIn_64_1) {
            stackIn_67_0 = var5;
            return stackIn_67_0 != 0;
          }
          stackIn_71_0 = !(param1.field_Lb >= this.field_Lb);
          return stackIn_71_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_78_0 = var3;
          stackIn_78_1 = new StringBuilder().append("eq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    static {
        field_Xb = "Allow spectators?";
    }
}
