/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na extends kc {
    int field_ac;
    kc field_hc;
    String field_ic;
    static String field_Sb;
    int field_Fb;
    kc field_Kb;
    long field_Yb;
    kc field_fc;
    kc field_Vb;
    kc field_Mb;
    kc[] field_pc;
    int field_nc;
    kc field_Ib;
    kc field_Gb;
    boolean field_Lb;
    kc field_jc;
    kc field_Jb;
    static String field_gc;
    long field_Bb;
    int field_Db;
    int field_bc;
    boolean field_Hb;
    kc field_Zb;
    byte[] field_Wb;
    int field_Rb;
    kc field_Eb;
    kc field_Ub;
    kc field_cc;
    int field_dc;
    boolean field_oc;
    boolean field_Ob;
    kc field_Cb;
    kc field_ec;
    int field_Pb;
    static String field_lc;
    static String field_Tb;
    boolean field_kc;
    boolean field_mc;
    kc field_Xb;
    String[] field_Qb;
    boolean field_Nb;

    final int h(byte param0) {
        if (param0 < 46) {
          return 4;
        }
        return (int)this.b(false);
    }

    public static void g(byte param0) {
        if (param0 > 107) {
          field_lc = null;
          field_Tb = null;
          field_Sb = null;
          field_gc = null;
          return;
        }
        na.i((byte) 112);
        field_lc = null;
        field_Tb = null;
        field_Sb = null;
        field_gc = null;
    }

    final boolean e(int param0) {
        if (param0 < -34) {
          return !this.d((byte) -17) ? true : false;
        }
        this.e(102);
        return !this.d((byte) -17) ? true : false;
    }

    final boolean a(na param0, int param1) {
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_33_0 = false;
        boolean stackIn_40_0 = false;
        int stackIn_44_0 = 0;
        int stackIn_47_1 = 0;
        boolean stackIn_52_0 = false;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        boolean stackIn_78_0 = false;
        boolean stackIn_82_0 = false;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param1 != 2) {
            return true;
          }
          if (!this.field_Hb) {
            stackIn_9_0 = (this.field_ac == 6) ? 1 : 0;
          } else {
            stackIn_9_0 = 1;
          }
          var3_int = stackIn_9_0;
          if (!param0.field_Hb) {
            stackIn_15_0 = (param0.field_ac == 6) ? 1 : 0;
          } else {
            stackIn_15_0 = 1;
          }
          var4 = stackIn_15_0;
          stackIn_18_0 = (var4 != 0) ? 0 : 1;
          if (var3_int != 0) {
            stackIn_21_1 = 0;
          } else {
            stackIn_21_1 = 1;
          }
          if (stackIn_18_0 != stackIn_21_1) {
            stackIn_24_0 = var3_int;
            return stackIn_24_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_30_0 = (param0.field_Ob) ? 0 : 1;
            if (stackIn_30_0 == (this.field_Ob ? 1 : 0)) {
              stackIn_33_0 = this.field_Ob;
              return stackIn_33_0;
            }
            if (this.field_Ob &&
              this.field_Pb != param0.field_Pb) {
              stackIn_40_0 = !(param0.field_Pb <= this.field_Pb);
              return stackIn_40_0;
            }
          }
          stackIn_44_0 = (this.field_Lb) ? 0 : 1;
          if (param0.field_Lb) {
            stackIn_47_1 = 0;
          } else {
            stackIn_47_1 = 1;
          }
          if (stackIn_44_0 != stackIn_47_1) {
            stackIn_52_0 = !(this.field_Lb);
            return stackIn_52_0;
          }
          if (!this.field_Lb) {
            stackIn_82_0 = !(param0.field_Yb <= this.field_Yb);
            return stackIn_82_0;
          }
          if (this.field_kc) {
            stackIn_60_0 = 1;
          } else {
            stackIn_60_0 = (2 == this.field_Fb) ? 1 : 0;
          }
          var5 = stackIn_60_0;
          if (!param0.field_kc) {
            stackIn_66_0 = (param0.field_Fb == 2) ? 1 : 0;
          } else {
            stackIn_66_0 = 1;
          }
          var6 = stackIn_66_0;
          stackIn_69_0 = (var6 != 0) ? 0 : 1;
          if (var5 != 0) {
            stackIn_72_1 = 0;
          } else {
            stackIn_72_1 = 1;
          }
          if (stackIn_69_0 == stackIn_72_1) {
            stackIn_78_0 = !(param0.field_Yb >= this.field_Yb);
            return stackIn_78_0;
          }
          stackIn_74_0 = var5;
          return stackIn_74_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_85_0 = var3;
          stackIn_85_1 = new StringBuilder().append("na.H(");
          if (param0 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_85_0), ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(long param0, int param1, int param2) {
        int var5 = 89 / ((param1 - 3) / 62);
        ab var4 = he.field_e;
        var4.b((byte) -99, param2);
        var4.field_g = var4.field_g + 1;
        int var6 = var4.field_g;
        var4.f(7, (byte) -5);
        var4.a(param0, (byte) 110);
        var4.b(-var6 + var4.field_g, (byte) 43);
    }

    final static void i(byte param0) {
        df.a(1, cd.e(108));
        int var1 = -86 % ((param0 + 14) / 33);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, String param5, int param6, int param7, int param8, int param9, long param10, int param11, dl param12, boolean param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            df.field_z = new ab(param9);
            he.field_e = new ab(param6);
            md.field_c = param8;
            ho.field_c = param10;
            q.field_P = param2;
            ka.field_q = param5;
            fl.field_a = param13;
            vf.field_r = param1;
            gm.field_d = param0;
            ng.field_G = param11;
            lk.field_d = param4;
            if (param3 != 0) {
              field_gc = (String) null;
            }
            dh.field_Lb = param7;
            qg.field_b = param12;
            if (qg.field_b.field_n == null) {
              return;
            }
            try {
              pg.field_f = new sd(qg.field_b.field_n, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("na.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            if (param12 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static kc f(byte param0) {
        if (param0 <= 13) {
          na.i((byte) 105);
          return nj.field_m.field_Cb;
        }
        return nj.field_m.field_Cb;
    }

    na(int param0) {
        super(0L, (kc) null);
        this.field_Wb = new byte[param0];
    }

    static {
        field_Tb = "Giants' Mountains:";
        field_lc = "Lesson 7 of 7<br><br>Use of basic spells in a dangerous and unsecure environment.<br><br>Defeat the three cyclopes.<br><br><br>* Health display *<br>* Use of the minimap *<br>* Application of timed movement *<br>* Tactical combat *<br>* Sense of achievement in victory *";
        field_Sb = "Accept invitation to <%0>'s game";
        field_gc = "Withdraw invitation to <%0> to join this game";
    }
}
