/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends km {
    int field_ic;
    boolean field_Ib;
    static km field_Jb;
    static int field_nc;
    int field_fc;
    boolean field_Sb;
    km field_oc;
    int field_lc;
    int field_Mb;
    boolean field_Rb;
    km field_Yb;
    km field_Gb;
    km field_rc;
    km field_Kb;
    long field_gc;
    km field_bc;
    int field_ac;
    static String field_cc;
    km field_Vb;
    boolean field_dc;
    km field_Lb;
    boolean field_kc;
    static fe field_Xb;
    km field_Fb;
    km field_uc;
    km field_Ob;
    byte[] field_Pb;
    static int field_ec;
    km[] field_jc;
    static String field_Wb;
    km field_qc;
    km field_Tb;
    String[] field_Zb;
    String field_Qb;
    int field_Eb;
    km field_Nb;
    boolean field_sc;
    long field_Hb;
    static jm field_pc;
    int field_mc;
    boolean field_Ub;
    km field_hc;
    km field_tc;
    int field_vc;

    final static mg[] a(mg[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mg var3 = null;
        int var4 = 0;
        mg[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          for (var2_int = param1; param0.length > var2_int; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].field_x = 0;
            var3.field_r = 0;
            param0[var2_int].field_u = param0[var2_int].field_w;
            param0[var2_int].field_z = param0[var2_int].field_p;
          }
          stackIn_5_0 = (mg[]) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_35_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        mg[] var4 = null;
        try {
          if (param1 == 1) {
            stackIn_2_0 = oi.a(new String[]{param0}, mj.field_y, 2);
            return stackIn_2_0;
          }
          if (param1 == 2) {
            stackIn_5_0 = oi.a(new String[]{param0}, tm.field_j, 2);
            return stackIn_5_0;
          }
          if (param1 == 3) {
            stackIn_9_0 = oi.a(new String[]{param0}, eg.field_p, 2);
            return stackIn_9_0;
          }
          if (param1 == 4) {
            stackIn_12_0 = oi.a(new String[]{param0}, ao.field_Jb, 2);
            return stackIn_12_0;
          }
          if (param1 == 5) {
            stackIn_16_0 = oi.a(new String[]{param0}, mc.field_e, 2);
            return stackIn_16_0;
          }
          if (6 == param1) {
            stackIn_20_0 = oi.a(new String[]{param0}, ch.field_h, 2);
            return stackIn_20_0;
          }
          if (param1 == 7) {
            stackIn_24_0 = oi.a(new String[]{param0}, ob.field_c, 2);
            return stackIn_24_0;
          }
          if (param1 == 8) {
            stackIn_27_0 = oi.a(new String[]{param0}, va.field_c, 2);
            return stackIn_27_0;
          }
          if (param1 == 11) {
            stackIn_31_0 = oi.a(new String[]{param0}, ok.field_E, 2);
            return stackIn_31_0;
          }
          if (param1 == 12) {
            stackIn_35_0 = oi.a(new String[]{param0}, bl.field_G, 2);
            return stackIn_35_0;
          }
          if (!param2) {
            var4 = (mg[]) null;
            he.a((mg[]) null, -22);
          }
          if (param1 != 13) {
            return null;
          }
          stackIn_41_0 = oi.a(new String[]{param0}, lj.field_i, 2);
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("he.C(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void i(int param0) {
        if (param0 == -532) {
          wg.field_f = false;
          dh.field_n = 0 == sh.field_qb.g(11132) ? true : false;
          return;
        }
        field_Jb = (km) null;
        wg.field_f = false;
        dh.field_n = 0 == sh.field_qb.g(11132) ? true : false;
    }

    he(int param0) {
        super(0L, (km) null);
        this.field_Pb = new byte[param0];
    }

    final int e(byte param0) {
        if (param0 != -124) {
          return -100;
        }
        return (int)this.a((byte) 102);
    }

    public static void g(int param0) {
        if (param0 != 7) {
          return;
        }
        field_Wb = null;
        field_Xb = null;
        field_pc = null;
        field_Jb = null;
        field_cc = null;
    }

    final boolean f(byte param0) {
        int var2 = -76 % ((-42 - param0) / 40);
        return !this.a(1) ? true : false;
    }

    final static boolean h(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        long var3Lifetime1;
        int var5Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        var1 = hc.a(-9986);
        if (param0 < -117) {
          var3 = var1 - pc.field_b;
          if (var3 > 30000L) {
            pc.field_b = var1;
            jg.field_e = 0;
            return true;
          }
          var5 = 3000;
          if (7 <= jg.field_e) {
            var5 = 12000;
          } else {
            if (jg.field_e >= 5) {
              var5 = 9000;
            } else {
              if (3 <= jg.field_e) {
                var5 = 6000;
              }
            }
          }
          if ((long)var5 >= var3) {
            return false;
          }
          pc.field_b = var1;
          jg.field_e = jg.field_e + 1;
          return true;
        }
        field_Wb = (String) null;
        var3Lifetime1 = var1 - pc.field_b;
        if (var3Lifetime1 > 30000L) {
          pc.field_b = var1;
          jg.field_e = 0;
          return true;
        }
        var5Lifetime1 = 3000;
        if (7 <= jg.field_e) {
          var5Lifetime1 = 12000;
        } else {
          if (jg.field_e >= 5) {
            var5Lifetime1 = 9000;
          } else {
            if (3 <= jg.field_e) {
              var5Lifetime1 = 6000;
            }
          }
        }
        if ((long)var5Lifetime1 >= var3Lifetime1) {
          return false;
        }
        pc.field_b = var1;
        jg.field_e = jg.field_e + 1;
        return true;
    }

    final static mg[] b(int param0, int param1, int param2, byte param3, int param4) {
        mg[] var6 = new mg[9];
        mg[] var5 = var6;
        mg dupTemp$0 = eg.a(param1, (byte) 127, param4);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        mg dupTemp$1 = eg.a(param1, (byte) 45, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 == 89) {
          if (0 != param2) {
            var6[4] = eg.a(64, (byte) 24, param2);
          }
          return var5;
        }
        return (mg[]) null;
    }

    final boolean a(he param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_24_0 = false;
        boolean stackIn_31_0 = false;
        boolean stackIn_37_0 = false;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
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
        try {
          if (!this.field_dc) {
            stackIn_6_0 = (this.field_Eb == 6) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          if (!param0.field_dc) {
            stackIn_12_0 = (6 == param0.field_Eb) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          var4 = stackIn_12_0;
          if (param1 != -12712) {
            return true;
          }
          stackIn_18_0 = (var3_int != 0) ? 0 : 1;
          if (stackIn_18_0 == var4) {
            stackIn_20_0 = var3_int;
            return stackIn_20_0 != 0;
          }
          if (var3_int == 0) {
            if (this.field_Ib != param0.field_Ib) {
              stackIn_24_0 = this.field_Ib;
              return stackIn_24_0;
            }
            if (this.field_Ib &&
              this.field_fc != param0.field_fc) {
              stackIn_31_0 = !(this.field_fc >= param0.field_fc);
              return stackIn_31_0;
            }
          }
          if (param0.field_kc != this.field_kc) {
            stackIn_37_0 = !(this.field_kc);
            return stackIn_37_0;
          }
          if (!this.field_kc) {
            stackIn_65_0 = !(this.field_Hb >= param0.field_Hb);
            return stackIn_65_0;
          }
          if (this.field_Rb) {
            stackIn_45_0 = 1;
          } else {
            stackIn_45_0 = (this.field_lc == 2) ? 1 : 0;
          }
          var5 = stackIn_45_0;
          if (!param0.field_Rb) {
            stackIn_51_0 = (param0.field_lc == 2) ? 1 : 0;
          } else {
            stackIn_51_0 = 1;
          }
          var6 = stackIn_51_0;
          stackIn_53_0 = var6;
          if (var5 != 0) {
            stackIn_54_1 = 0;
          } else {
            stackIn_54_1 = 1;
          }
          if (stackIn_53_0 == stackIn_54_1) {
            stackIn_57_0 = var5;
            return stackIn_57_0 != 0;
          }
          stackIn_61_0 = !(param0.field_Hb >= this.field_Hb);
          return stackIn_61_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_68_0 = var3;
          stackIn_68_1 = new StringBuilder().append("he.I(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_cc = "To play a multiplayer game, please either log in or create a free account.";
    }
}
