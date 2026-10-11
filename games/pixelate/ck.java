/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ck {
    private float field_i;
    private float field_d;
    private float field_c;
    private float field_h;
    private int field_f;
    static String field_g;
    private int field_k;
    private float field_a;
    static am field_j;
    private float field_e;
    static rl[] field_b;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_j = null;
        if (param0 >= -98) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ck.a(true, (java.applet.Applet) null);
        }
    }

    final static rg a(String param0, String param1, boolean param2, long param3, int param4) {
        RuntimeException var6 = null;
        gq stackIn_5_0 = null;
        wk stackIn_7_0 = null;
        rg stackIn_10_0 = null;
        go stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 0L &&
            param1 != null) {
            stackIn_7_0 = new wk(param1, param0);
            return (rg) ((Object) stackIn_7_0);
          }
          if (param2) {
            stackIn_5_0 = new gq(param3, param0);
            return (rg) ((Object) stackIn_5_0);
          }
          if (param4 >= 60) {
            stackIn_12_0 = new go(param3, param0);
            return (rg) ((Object) stackIn_12_0);
          }
          stackIn_10_0 = (rg) null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ck.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void b(int param0) {
        if (this.field_f > 0) {
          this.field_f = this.field_f - 1;
          return;
        }
        this.field_c = this.field_c - this.field_d;
        this.field_a = this.field_a + this.field_e;
        if (param0 != -26338) {
          return;
        }
        this.field_h = this.field_h + this.field_i;
        if (0.0f > this.field_c) {
          this.a(-22970);
        }
        this.field_k = (int)this.field_c * 100 / 400;
        if (this.field_k > 100) {
          this.field_k = 100;
        }
    }

    private final void a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        float stackIn_10_1 = 0.0f;
        float stackIn_14_1 = 0.0f;
        int var2;
        int var3;
        int var4;
        int var5;
        float var6;
        this.field_f = ok.a(ea.field_b, -101, 50) + 20;
        this.field_d = 1.5f + (float)ok.a(ea.field_b, -125, 100) / 100.0f;
        stackIn_3_0 = (ok.a(ea.field_b, param0 ^ 22979, 2) != 1) ? 0 : 1;
        var2 = stackIn_3_0;
        stackIn_6_0 = (ok.a(ea.field_b, -115, 2) != 1) ? 0 : 1;
        var3 = stackIn_6_0;
        if (var2 == 0) {
          this.field_h = (float)(-100 + ok.a(ea.field_b, param0 ^ 22992, 740));
          if (var3 != 0) {
            stackIn_14_1 = 480.0f;
          } else {
            stackIn_14_1 = -100.0f;
          }
          this.field_a = stackIn_14_1;
        } else {
          if (var3 == 0) {
            stackIn_10_1 = -100.0f;
          } else {
            stackIn_10_1 = 640.0f;
          }
          this.field_h = stackIn_10_1;
          this.field_a = (float)(ok.a(ea.field_b, -109, 580) - 100);
        }
        var4 = 320 - (int)this.field_h;
        var5 = 240 - (int)this.field_a;
        this.field_c = (float)hd.a(var4 * var4 + var5 * var5, param0 + 23096);
        var6 = this.field_d / this.field_c;
        this.field_i = var6 * (float)var4;
        if (param0 != -22970) {
          return;
        }
        this.field_e = var6 * (float)var5;
    }

    final void a(int param0, boolean param1) {
        int var3;
        int var6;
        int stackIn_7_0 = 0;
        int var4;
        int var5;
        var6 = Pixelate.field_H ? 1 : 0;
        if (this.field_k <= 8) {
          return;
        }
        if (param0 != 100) {
          return;
        }
        stackIn_7_0 = (param1) ? 16777215 : 0;
        var3 = stackIn_7_0;
        if (this.field_k < 24) {
          var4 = -8 + this.field_k << 1;
          var5 = -1 + this.field_k / 2;
          if (var5 < 0) {
            var5 = 0;
          }
          if (var5 > 5) {
            var5 = 5;
          }
          if (jc.field_d) {
            t.a((int)this.field_h, (int)this.field_a, this.field_k, this.field_k, var5, var3, var4);
          } else {
            t.a((int)this.field_h, (int)this.field_a, this.field_k, this.field_k, var3, var4);
          }
        } else {
          if (!jc.field_d) {
            t.a((int)this.field_h, (int)this.field_a, this.field_k, this.field_k, var3, 100);
          } else {
            t.a((int)this.field_h, (int)this.field_a, this.field_k, this.field_k, 5, var3, 32);
          }
        }
    }

    final static void a(int param0, jl param1, fm param2) {
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        qe var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        jl var12 = null;
        int[] var16 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = wo.field_d;
          bn.field_I = new ak(0L, (ak) null);
          if (param2 == null) {
            var10 = (Throwable) null;
            jo.a(1, "QC1", (Throwable) null);
            return;
          }
          param2.field_i = false;
          param2.field_e = 0;
          w.field_y = new il(var3_int, param2, param2);
          jd.field_k = new u(var3_int, param2, param2, new dn());
          var4 = fl.c(-3060);
          if (var4 == null) {
            var11 = (Throwable) null;
            jo.a(1, "QC2", (Throwable) null);
            return;
          }
          oo.a(-1, var4);
          var12 = (jl) null;
          vl.field_L = ka.a(65793, 4020342, 65793, (jl) null, 1513239, 0, 8947848, param0, 21, 1513239, 2245737, 5138823, 1127256);
          ue.field_t = ka.a(0, 0, 0, param1, 0, 16764006, 0, 0, 21, 0, 0, 0, 0);
          ve.field_Ib = ka.a(0, 0, 0, param1, 0, 16777215, 0, 0, 21, 0, 0, 0, 0);
          var5 = t.field_j;
          var6 = t.field_d;
          var16 = t.field_k;
          fe.field_b = new tf(10, 14);
          fe.field_b.c();
          for (var8 = 2; var8 < 7; var8++) {
            t.g(var8, 1 + var8, -(var8 << 1) + 14, 16777215);
          }
          t.a(var16, var5, var6);
          pi.field_Rb = lj.a(ue.field_t, ve.field_Ib, -55, vl.field_L, var4);
          bn.field_I.field_L = new bb();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ck.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Pixelate.field_H ? 1 : 0;
          try {
            if (c.field_T) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              if (!param0) {
                return true;
              }
              var3 = (String) (cq.a("getcookies", (byte) -113, param1));
              var4 = dd.a(var3, (byte) -52, ';');
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("ck.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ck() {
        int var1;
        this.a(-22970);
        var1 = ok.a(ea.field_b, -128, 250);
        if (var1 >= 180) {
          this.field_f = this.field_f + ok.a(ea.field_b, -116, 50);
        } else {
          this.field_f = 0;
          this.field_a = this.field_a + this.field_e * (float)var1;
          this.field_h = this.field_h + (float)var1 * this.field_i;
          this.field_c = this.field_c - (float)var1 * this.field_d;
          if (this.field_c < 0.0f) {
            this.a(-22970);
          }
          this.field_k = (int)this.field_c * 100 / 400;
          if (this.field_k > 100) {
            this.field_k = 100;
          }
        }
    }

    static {
    }
}
