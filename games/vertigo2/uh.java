/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends cr {
    cr field_pc;
    cr[] field_Zb;
    int field_uc;
    cr field_Ob;
    boolean field_qc;
    boolean field_Sb;
    int field_Yb;
    cr field_Kb;
    cr field_bc;
    cr field_Rb;
    cr field_ec;
    cr field_ac;
    int field_Qb;
    static mi field_Wb;
    long field_Pb;
    int field_ic;
    boolean field_Tb;
    cr field_rc;
    boolean field_dc;
    cr field_Vb;
    String[] field_Hb;
    static int field_oc;
    boolean field_vc;
    long field_hc;
    int field_Lb;
    cr field_jc;
    cr field_Jb;
    boolean field_Mb;
    cr field_cc;
    cr field_nc;
    cr field_gc;
    boolean field_kc;
    int field_tc;
    int field_Ub;
    byte[] field_fc;
    static int field_mc;
    String field_Nb;
    static vi field_Xb;
    cr field_Ib;
    static String field_lc;
    cr field_wc;
    static volatile boolean field_sc;
    int field_xc;

    final static String a(byte param0, long param1) {
        wq.field_K.setTime(new Date(param1));
        int var3 = wq.field_K.get(7);
        if (param0 != -66) {
          uh.b((byte) 22);
        }
        int var4 = wq.field_K.get(5);
        int var5 = wq.field_K.get(2);
        int var6 = wq.field_K.get(1);
        int var7 = wq.field_K.get(11);
        int var8 = wq.field_K.get(12);
        int var9 = wq.field_K.get(13);
        return ao.field_Q[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + nh.field_l[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    uh(int param0) {
        super(0L, (cr) null);
        this.field_fc = new byte[param0];
    }

    final boolean k(int param0) {
        if (param0 != 4043) {
          this.k(22);
        }
        return !this.e(param0 ^ -3977) ? true : false;
    }

    final static void a(boolean param0, er param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (0 == (3 & (param1.field_z | (param1.field_C | (param1.field_y | param1.field_t))))) {
            return;
          }
          var2_int = (3 & param1.field_C) + param1.field_y;
          var3 = param1.field_t + (3 & param1.field_z);
          var2_int = var2_int - (-4 + (3 & var2_int));
          var3 = var3 - ((var3 & 3) - 4);
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = (3 & param1.field_z) * var2_int + (3 & param1.field_C);
          for (var7 = 0; var7 < param1.field_t; var7++) {
            for (var8 = 0; var8 < param1.field_y; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param1.field_F[incrementValue$1];
            }
            var6 = var6 + (-param1.field_y + var2_int);
          }
          if (param0) {
            uh.a((byte) 113, 97L);
          }
          param1.field_z = param1.field_z & -4;
          param1.field_t = var3;
          param1.field_F = var4;
          param1.field_y = var2_int;
          param1.field_C = param1.field_C & -4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("uh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, uh param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_23_1 = 0;
        boolean stackIn_26_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_35_0 = false;
        int stackIn_36_1 = 0;
        boolean stackIn_40_0 = false;
        boolean stackIn_47_0 = false;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        boolean stackIn_66_0 = false;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (!this.field_Sb) {
            stackIn_6_0 = (this.field_Lb == 6) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          if (!param1.field_Sb) {
            stackIn_12_0 = (6 == param1.field_Lb) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          var4 = stackIn_12_0;
          stackIn_15_0 = (var4 != 0) ? 0 : 1;
          if (stackIn_15_0 == var3_int) {
            stackIn_17_0 = var3_int;
            return stackIn_17_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_22_0 = param1.field_dc;
            if (this.field_dc) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = 1;
            }
            if ((stackIn_22_0 ? 1 : 0) == stackIn_23_1) {
              stackIn_26_0 = this.field_dc;
              return stackIn_26_0;
            }
            if (this.field_dc &&
              this.field_Ub != param1.field_Ub) {
              stackIn_32_0 = !(this.field_Ub >= param1.field_Ub);
              return stackIn_32_0;
            }
          }
          stackIn_35_0 = this.field_kc;
          if (param1.field_kc) {
            stackIn_36_1 = 0;
          } else {
            stackIn_36_1 = 1;
          }
          if ((stackIn_35_0 ? 1 : 0) == stackIn_36_1) {
            stackIn_40_0 = !(this.field_kc);
            return stackIn_40_0;
          }
          if (!param0) {
            uh.b((byte) -114);
          }
          if (!this.field_kc) {
            stackIn_47_0 = !(this.field_Pb >= param1.field_Pb);
            return stackIn_47_0;
          }
          if (this.field_vc) {
            stackIn_54_0 = 1;
          } else {
            stackIn_54_0 = (this.field_xc == 2) ? 1 : 0;
          }
          var5 = stackIn_54_0;
          if (!param1.field_vc) {
            stackIn_60_0 = (param1.field_xc == 2) ? 1 : 0;
          } else {
            stackIn_60_0 = 1;
          }
          var6 = stackIn_60_0;
          if (var6 == var5) {
            stackIn_66_0 = !(this.field_Pb <= param1.field_Pb);
            return stackIn_66_0;
          }
          stackIn_62_0 = var5;
          return stackIn_62_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_69_0 = var3;
          stackIn_69_1 = new StringBuilder().append("uh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 != -38) {
          this.a((byte) -33);
        }
        return (int)this.f(113);
    }

    public static void b(byte param0) {
        field_Wb = null;
        if (param0 != -69) {
          return;
        }
        field_Xb = null;
        field_lc = null;
    }

    static {
        field_mc = 20;
        field_lc = "You got to level <%0> out of 30!";
        field_Xb = null;
        field_sc = true;
    }
}
