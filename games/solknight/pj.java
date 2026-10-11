/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pj extends rc {
    static int field_H;
    boolean field_F;
    static String field_G;
    boolean field_B;
    static int field_A;
    private boolean field_E;
    private boolean field_C;
    static hb field_D;

    final boolean b(boolean param0) {
        if (!param0) {
          return false;
        }
        return this.field_E;
    }

    pj(String param0, dg param1) {
        this(param0, ph.field_f.field_i, param1);
    }

    boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        da var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B &&
            this.a(param4, param3, param1, param5, -94)) {
            this.a(-1463, param6);
            this.field_u = param0;
            if (this.field_n != null) {
              if (!(this.field_n instanceof oj)) {
                return true;
              }
              ((oj) (this.field_n)).a(param0, param4, -29264, param1, param5, param3, this);
            }
            return true;
          }
          if (param2) {
            var9 = (da) null;
            pj.a(-9, (da) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("pj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 98 % ((param1 - 31) / 56);
          if (this.b(true) && (param2 == 84 ||
            param2 == 83)) {
            this.a(true, -1, 1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(da param0, int param1, da param2, da param3) {
        RuntimeException var4 = null;
        da var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -16925) {
            var5 = (da) null;
            pj.a(-17, (da) null);
          }
          if (!param2.c((byte) -121)) {
            return false;
          }
          if (!param2.a(param1 + 16927, "commonui")) {
            return false;
          }
          if (param0.c((byte) -121) &&
            param0.a(2, "commonui")) {
            if (param3.c((byte) -121) &&
              param3.a(2, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("pj.IA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        try {
          if (null != this.field_n &&
            this.field_n instanceof oj) {
            ((oj) (this.field_n)).a(param4, (byte) -88, this, param3, param0, param5);
          }
          this.field_u = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "pj.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void h(int param0) {
        field_G = null;
        int var1 = -33 / ((param0 - 0) / 41);
        field_D = null;
    }

    void a(boolean param0, int param1, int param2, int param3) {
        if (this.field_n != null &&
          this.field_n instanceof ka) {
          ((ka) (this.field_n)).a(param2, param1, param3, this, true);
        }
        if (!param0) {
          field_G = (String) null;
        }
    }

    final void g(int param0) {
        if (this.field_E) {
          this.field_E = false;
          if (null != this.field_n &&
            this.field_n instanceof p) {
            ((p) (this.field_n)).a(true, (rc) (this), this.field_E);
          }
        }
        if (param0 != 0) {
          this.field_B = false;
        }
    }

    pj(String param0, j param1, dg param2) {
        super(param0, param1, param2);
        this.field_B = true;
        this.field_E = false;
        this.field_C = true;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param2, -1, param1, param3)) {
            this.b(param2, 29, param1, param3);
            if (this.field_F) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_B) {
              discarded$3 = param2.append(" disabled");
            }
          }
          if (param0 >= -41) {
            this.field_C = false;
          }
          stackIn_11_0 = (StringBuilder) (param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pj.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_B) {
            return false;
          }
          if (!this.field_C) {
            return false;
          }
          param1.g(param0 ^ param0);
          this.field_E = true;
          if (this.field_n != null &&
            this.field_n instanceof p) {
            ((p) (this.field_n)).a(true, (rc) (this), this.field_E);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pj.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static short[] a(int param0, jd param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          var4_int = param1.d((byte) 48, param2);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param3 == null ||
            var4_int != param3.length) {
            param3 = new short[var4_int];
          }
          var5 = param1.d((byte) 48, 4);
          var6 = (short)param1.d((byte) 48, 16);
          if (~var5 < param0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (short)(param1.d((byte) 48, var5) + var6);
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)var6;
            }
          }
          stackIn_16_0 = (short[]) (param3);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("pj.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static da a(int param0, byte param1, int param2, boolean param3, boolean param4) {
        int var5 = 10 / ((-74 - param1) / 37);
        return ab.a(2097152, param0, param2, false, param4, param3);
    }

    final static void a(int param0, da param1) {
        o var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new o(param1.a(4, "final_frame.jpg", ""), (java.awt.Component) ((Object) dc.field_q));
          var3 = var2.field_p;
          var4 = var2.field_t;
          fl.b((byte) 91);
          gg.field_e = new o(var3, var4 * param0 / 4);
          gg.field_e.a();
          var2.c(0, 0);
          ql.field_p = new o(var3, -gg.field_e.field_t + var4);
          ql.field_p.a();
          var2.c(0, -gg.field_e.field_t);
          ql.field_p.field_n = gg.field_e.field_t;
          mf.e(4096);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "pj.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, rc param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_u != 0 &&
            wb.field_c != this.field_u) {
            if (this.a(ad.field_m, gb.field_j, param0, param2, -107) &&
              wb.field_c == 0) {
              this.a(true, gb.field_j - param0, this.field_u, -param2 + ad.field_m);
            }
            this.a(ad.field_m, 0, param3, param2, gb.field_j, param0);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "pj.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    protected pj() {
        this.field_B = true;
        this.field_E = false;
        this.field_C = true;
        this.field_w = ph.field_f.field_g;
    }

    static {
        field_A = 10;
        field_H = 9;
        field_G = "Type your email address again to make sure it's correct";
    }
}
