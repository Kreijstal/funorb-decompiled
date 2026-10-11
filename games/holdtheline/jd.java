/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jd extends ub {
    static lo field_G;
    static String[] field_M;
    static String field_L;
    static int field_J;
    private int field_O;
    private boolean field_P;
    private int field_K;
    static String field_I;
    private boolean field_Q;
    private int field_N;
    private int field_H;

    final static hj[] h(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        if (param0 >= -127) {
          field_L = (String) null;
        }
        hj[] var1 = new hj[vn.field_d];
        for (var2 = 0; vn.field_d > var2; var2++) {
          var3 = nk.field_K[var2] * ad.field_d[var2];
          var4 = lk.field_e[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = dd.field_E[pk.a(255, (int) var4[var6])];
          }
          var1[var2] = new hj(bo.field_b, ih.field_o, la.field_j[var2], wb.field_g[var2], nk.field_K[var2], ad.field_d[var2], var5);
        }
        tk.a(false);
        return var1;
    }

    final void a(int param0) {
        super.a(-122);
        this.field_B.a(0, (byte) 122, 0, this.field_u, this.field_x);
        this.field_K = this.field_o;
        this.field_O = this.field_k;
        int var2 = -26 % ((-68 - param0) / 32);
    }

    private jd(int param0, int param1, int param2, int param3, dh param4, tb param5, n param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_O = 2147483647;
        this.field_K = 2147483647;
        try {
          this.field_B = param6;
          this.field_Q = param8 ? true : false;
          this.field_P = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "jd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          var3 = -99 % ((param1 - 45) / 47);
          if (var2 != null) {
            var4 = (CharSequence) ((Object) var2);
            if (ko.a(var4, -13820) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("jd.VA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(20720, param2, param3, param0)) {
            this.a(param2, param0, true, param3);
            this.a((byte) 126, param0, param3, param2);
            discarded$64 = param3.append(" revert=").append(this.field_P);
            if (2147483647 != this.field_O &&
              this.field_K != 2147483647) {
              discarded$65 = param3.append(" to ").append(this.field_O).append(',').append(this.field_K);
            }
          }
          var5_int = 35 % ((0 - param1) / 49);
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("jd.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, n param1, int param2, byte param3) {
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_B instanceof rm) ||
            ((rm) (this.field_B)).field_D) &&
            this.field_v == 1) {
            var5_int = nc.field_g - (this.field_N + param0);
            var6 = -param2 - this.field_H + rf.field_X;
            if (var5_int == this.field_k &&
              this.field_o == var6) {
              super.a(param0, param1, param2, param3);
              return;
            }
            this.field_o = var6;
            this.field_k = var5_int;
            if (this.field_t instanceof rn) {
              ((rn) (this.field_t)).a(param2, param0, this, (byte) 51);
            }
          } else {
            if (this.field_P) {
              if (this.field_O != this.field_k) {
                var5_int = -this.field_k + this.field_O;
                stackIn_9_1 = this.field_k;
                if (Math.abs(var5_int) <= 2) {
                  if (0 >= var5_int) {
                    stackIn_12_2 = -1;
                  } else {
                    stackIn_12_2 = 1;
                  }
                } else {
                  stackIn_12_2 = var5_int >> 1;
                }
                this.field_k = stackIn_9_1 + stackIn_12_2;
              }
              if (this.field_o != this.field_K) {
                var5_int = this.field_K - this.field_o;
                stackIn_19_1 = this.field_o;
                if (Math.abs(var5_int) > 2) {
                  stackIn_20_2 = var5_int >> 1;
                } else {
                  if (0 >= var5_int) {
                    stackIn_20_2 = -1;
                  } else {
                    stackIn_20_2 = 1;
                  }
                }
                this.field_o = stackIn_19_1 + stackIn_20_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("jd.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static uf a(String param0, int param1) {
        RuntimeException var2 = null;
        uf stackIn_2_0 = null;
        uf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 1) {
            stackIn_4_0 = new uf(param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (uf) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("jd.TA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "jd.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void i(int param0) {
        field_L = null;
        int var1 = 26 / ((param0 - 0) / 36);
        field_I = null;
        field_M = null;
        field_G = null;
    }

    final static void j(int param0) {
        hj var1 = null;
        hj var2 = null;
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        try {
          var1 = new hj(540, 140);
          hf.a(var1, -1);
          li.c();
          tc.c();
          cf.field_q = 0;
          td.a((byte) 121);
          var2 = var1.e();
          for (var3 = 0; var3 < 15; var3++) {
            var2.e(-2, -2, 16777215);
            tc.d(4, 4, 0, 0, 540, 140);
          }
          wj.field_o.f();
          var1.c(0, param0);
          dm.b((byte) -10);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "jd.NA(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_Q) {
            return true;
          }
          if (!this.b(param0, (byte) -105, param5, param2, param1)) {
            stackIn_10_0 = var8_int;
            return stackIn_10_0 != 0;
          }
          if (param6 == 1) {
            ig.field_q = this;
            this.field_H = param1 - (this.field_o + param2);
            this.field_N = -param0 - this.field_k + param5;
          }
          this.field_v = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("jd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = kd.field_b.getGraphics();
            if (null == kc.field_e) {
              kc.field_e = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param4) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, lj.field_f, g.field_i);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == i.field_i) {
                i.field_i = kd.field_b.createImage(304, 34);
              }
              var10 = i.field_i.getGraphics();
              var10.setColor(param1);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, param2 * 3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(2 + 3 * param2, 2, -(3 * param2) + param3, 30);
              var10.setFont(kc.field_e);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (304 - 6 * param0.length()) / 2, 22);
              var9.drawImage(i.field_i, lj.field_f / 2 - 152, -18 + g.field_i / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = lj.field_f / 2 - 152;
              var8 = g.field_i / 2 - 18;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, 2 + var8, 3 * param2, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(var7 - (-2 - 3 * param2), var8 + 2, -(3 * param2) + 300, 30);
              var9.setFont(kc.field_e);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, (-(param0.length() * 6) + 304) / 2 + var7, 22 + var8);
            }
            if (null != qh.field_d) {
              var9.setFont(kc.field_e);
              var9.setColor(java.awt.Color.white);
              var9.drawString(qh.field_d, lj.field_f / 2 - 6 * qh.field_d.length() / 2, g.field_i / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            kd.field_b.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("jd.RA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_L = "This entry doesn't match";
        field_M = new String[]{"All scores", "My scores", "Best each"};
        field_I = "OVER <%0>";
        field_J = 0;
    }
}
