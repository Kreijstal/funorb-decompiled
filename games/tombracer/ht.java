/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ht extends jea {
    jea field_vb;
    jea field_hc;
    boolean field_Sb;
    boolean field_Tb;
    int field_Kb;
    long field_Gb;
    jea field_Zb;
    int field_Jb;
    jea field_Vb;
    int field_yb;
    jea field_Rb;
    static int[] field_Fb;
    jea field_Hb;
    jea[] field_Ub;
    long field_Ab;
    static jpa field_Db;
    jea field_wb;
    boolean field_Bb;
    jea field_ub;
    String field_tb;
    jea field_fc;
    int field_zb;
    static int[] field_Pb;
    jea field_Nb;
    jea field_dc;
    jea field_Qb;
    boolean field_Ob;
    String[] field_Cb;
    boolean field_gc;
    jea field_bc;
    boolean field_ec;
    int field_cc;
    boolean field_Yb;
    static int field_Xb;
    int field_Mb;
    int field_Ib;
    jea field_Lb;
    int field_Wb;
    jea field_Eb;
    jea field_xb;
    byte[] field_ac;

    final boolean a(ht param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_24_1 = 0;
        boolean stackIn_27_0 = false;
        boolean stackIn_33_0 = false;
        int stackIn_37_0 = 0;
        int stackIn_40_1 = 0;
        boolean stackIn_45_0 = false;
        boolean stackIn_50_0 = false;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
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
        int var7 = 0;
        try {
          if (!this.field_gc) {
            stackIn_6_0 = (this.field_Ib == 6) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          if (!param0.field_gc) {
            stackIn_12_0 = (6 == param0.field_Ib) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          var4 = stackIn_12_0;
          var5 = -13 % ((6 - param1) / 62);
          stackIn_14_0 = var3_int;
          if (var4 != 0) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if (stackIn_14_0 == stackIn_15_1) {
            stackIn_18_0 = var3_int;
            return stackIn_18_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_23_0 = this.field_Bb;
            if (param0.field_Bb) {
              stackIn_24_1 = 0;
            } else {
              stackIn_24_1 = 1;
            }
            if ((stackIn_23_0 ? 1 : 0) == stackIn_24_1) {
              stackIn_27_0 = this.field_Bb;
              return stackIn_27_0;
            }
            if (this.field_Bb &&
              param0.field_cc != this.field_cc) {
              stackIn_33_0 = !(this.field_cc >= param0.field_cc);
              return stackIn_33_0;
            }
          }
          stackIn_37_0 = (this.field_ec) ? 0 : 1;
          if (param0.field_ec) {
            stackIn_40_1 = 0;
          } else {
            stackIn_40_1 = 1;
          }
          if (stackIn_37_0 != stackIn_40_1) {
            stackIn_45_0 = !(this.field_ec);
            return stackIn_45_0;
          }
          if (!this.field_ec) {
            stackIn_50_0 = !(param0.field_Gb <= this.field_Gb);
            return stackIn_50_0;
          }
          if (this.field_Yb) {
            stackIn_57_0 = 1;
          } else {
            stackIn_57_0 = (this.field_yb == 2) ? 1 : 0;
          }
          var6 = stackIn_57_0;
          if (!param0.field_Yb) {
            stackIn_63_0 = (2 == param0.field_yb) ? 1 : 0;
          } else {
            stackIn_63_0 = 1;
          }
          var7 = stackIn_63_0;
          stackIn_66_0 = (var7 != 0) ? 0 : 1;
          if (var6 != 0) {
            stackIn_69_1 = 0;
          } else {
            stackIn_69_1 = 1;
          }
          if (stackIn_66_0 == stackIn_69_1) {
            stackIn_75_0 = !(param0.field_Gb >= this.field_Gb);
            return stackIn_75_0;
          }
          stackIn_71_0 = var6;
          return stackIn_71_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_78_0 = var3;
          stackIn_78_1 = new StringBuilder().append("ht.A(");
          if (param0 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_Fb = null;
        field_Db = null;
        field_Pb = null;
        if (param0 > -101) {
          field_Db = (jpa) null;
        }
    }

    ht(int param0) {
        super(0L, (jea) null);
        this.field_ac = new byte[param0];
    }

    final int f(int param0) {
        if (param0 != 0) {
          this.field_Cb = (String[]) null;
        }
        return (int)this.e(0);
    }

    final boolean g(int param0) {
        if (param0 != 0) {
          return false;
        }
        return !this.d(param0 ^ 0) ? true : false;
    }

    final static int[] d(int param0, boolean param1) {
        int var5 = 0;
        g var6 = null;
        int incrementValue$0 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int[] var8 = new int[rga.b(26499, param0)];
        int[] var2 = var8;
        if (!param1) {
          field_Db = (jpa) null;
        }
        int var3 = 0;
        g[] var4 = cm.field_a[param0].field_c;
        for (var5 = 0; var5 < var4.length; var5++) {
          var6 = var4[var5];
          incrementValue$0 = var3;
          var3++;
          var8[incrementValue$0] = var6.field_f;
        }
        return var2;
    }

    static {
        field_Pb = new int[]{0, 23, 24, 25};
        field_Xb = 0;
    }
}
