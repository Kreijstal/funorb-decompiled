/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class la extends wd {
    private uh field_B;
    static gk field_D;
    private int field_F;
    static Random field_C;
    static tg[] field_E;

    public static void d(byte param0) {
        field_D = null;
        if (param0 != -59) {
          return;
        }
        field_E = null;
        field_C = null;
    }

    final void a(int param0, int param1, int param2, lk param3) {
        try {
          this.field_F = this.field_F + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "la.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (this.field_g) {
          return this.field_B.c((byte) 66);
        }
        if (param0 == 0) {
          return null;
        }
        return (String) null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        vf var8;
        int var9;
        int var10;
        int var11;
        tg var15;
        tg var14;
        tg var16;
        tg var17;
        tg var18;
        tg var20;
        tg var21;
        tg var22;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        var11 = Bounce.field_N;
        super.a(param0, param1, 119, param3);
        if (param0 != 0) {
          return;
        }
        var5 = (this.field_k >> 1) + (this.field_r + param3);
        var6 = (this.field_m >> 1) + param1 + this.field_i;
        var8 = this.field_B.a((byte) 125);
        if (param2 >= 33) {
          if (ui.field_o != var8 &&
            var8 != mi.field_c) {
            if (a.field_e == var8) {
              var20 = field_E[2];
              var20.a(var5 - (var20.field_s >> 1), -(var20.field_q >> 1) + var6, 256);
              return;
            }
            if (mc.field_a != var8) {
              return;
            }
            var21 = field_E[1];
            var21.a(-(var21.field_s >> 1) + var5, -(var21.field_q >> 1) + var6, 256);
            return;
          }
          var22 = field_E[0];
          var9 = var22.field_t << 1;
          var10 = var22.field_o << 1;
          if (sj.field_c == null) {
            sj.field_c = new tg(var9, var10);
            kh.a(sj.field_c, 1);
          } else {
            if (var9 > sj.field_c.field_s) {
              sj.field_c = new tg(var9, var10);
              kh.a(sj.field_c, 1);
            } else {
              if (var10 > sj.field_c.field_q) {
                sj.field_c = new tg(var9, var10);
                kh.a(sj.field_c, 1);
              } else {
                kh.a(sj.field_c, 1);
                na.a();
              }
            }
          }
          var22.b(112, 144, var22.field_t << 4, var22.field_o << 4, -this.field_F << 10, 4096);
          ve.a(-121);
          sj.field_c.a(var5 - var22.field_t, var6 - var22.field_o, 256);
          return;
        }
        this.a(54, -73, 123, 16);
        if (ui.field_o == var8) {
          var15 = field_E[0];
          var9Lifetime1 = var15.field_t << 1;
          var10Lifetime1 = var15.field_o << 1;
          if (sj.field_c != null &&
            var9Lifetime1 <= sj.field_c.field_s &&
            var10Lifetime1 <= sj.field_c.field_q) {
            kh.a(sj.field_c, 1);
            na.a();
          } else {
            sj.field_c = new tg(var9Lifetime1, var10Lifetime1);
            kh.a(sj.field_c, 1);
          }
          var15.b(112, 144, var15.field_t << 4, var15.field_o << 4, -this.field_F << 10, 4096);
          ve.a(-121);
          sj.field_c.a(var5 - var15.field_t, var6 - var15.field_o, 256);
          return;
        }
        if (var8 != mi.field_c) {
          if (a.field_e == var8) {
            var17 = field_E[2];
            var17.a(var5 - (var17.field_s >> 1), -(var17.field_q >> 1) + var6, 256);
            return;
          }
          if (mc.field_a != var8) {
            return;
          }
          var18 = field_E[1];
          var18.a(-(var18.field_s >> 1) + var5, -(var18.field_q >> 1) + var6, 256);
          return;
        }
        var16 = field_E[0];
        var14 = var16;
        var9Lifetime2 = var16.field_t << 1;
        var10Lifetime2 = var16.field_o << 1;
        if (sj.field_c != null &&
          var9Lifetime2 <= sj.field_c.field_s &&
          var10Lifetime2 <= sj.field_c.field_q) {
          kh.a(sj.field_c, 1);
          na.a();
        } else {
          sj.field_c = new tg(var9Lifetime2, var10Lifetime2);
          kh.a(sj.field_c, 1);
        }
        var16.b(112, 144, var16.field_t << 4, var16.field_o << 4, -this.field_F << 10, 4096);
        ve.a(-121);
        sj.field_c.a(var5 - var16.field_t, var6 - var16.field_o, 256);
    }

    final static String a(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        gk var6;
        String var7;
        String var16;
        String var17;
        String var18;
        String var19;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        var5 = Bounce.field_N;
        var7 = "(" + ak.field_z + " " + i.field_f + " " + ck.field_b + ") " + wa.field_d;
        var1 = var7;
        if (param0 <= -104) {
          if (pe.field_d <= 0) {
            return var1;
          }
          var1 = var7 + ":";
          for (var2 = 0; pe.field_d > var2; var2++) {
            var18 = var1 + ' ';
            var3 = jc.field_g.field_i[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (10 > var4) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var19 = var18 + (char)var4;
            if (10 <= var3) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var19 + (char)var3;
          }
          return var1;
        }
        var6 = (gk) null;
        la.a(-118, -34, (gk) null, (byte) -39);
        if (pe.field_d <= 0) {
          return var1;
        }
        var1Lifetime1 = var7 + ":";
        for (var2Lifetime1 = 0; pe.field_d > var2Lifetime1; var2Lifetime1++) {
          var16 = var1Lifetime1 + ' ';
          var3Lifetime1 = jc.field_g.field_i[var2Lifetime1] & 255;
          var4Lifetime1 = var3Lifetime1 >> 4;
          var3Lifetime1 = var3Lifetime1 & 15;
          if (10 > var4Lifetime1) {
            var4Lifetime1 += 48;
          } else {
            var4Lifetime1 += 55;
          }
          var17 = var16 + (char)var4Lifetime1;
          if (10 <= var3Lifetime1) {
            var3Lifetime1 += 55;
          } else {
            var3Lifetime1 += 48;
          }
          var1Lifetime1 = var17 + (char)var3Lifetime1;
        }
        return var1Lifetime1;
    }

    final boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          this.field_F = 61;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("la.PA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = Bounce.field_N;
        try {
          if (param1 != 2) {
            field_E = (tg[]) null;
          }
          param2--;
          while (param2 >= 0) {
            var9 = param4;
            var5 = var9;
            var6 = param3;
            var7 = param0;
            var9[var6] = var7 + (da.b(var9[var6], 16711422) >> 1);
            param3++;
            param2--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("la.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = Bounce.field_N;
        if (param0 != 640) {
          return;
        }
        if (ui.field_m <= 0) {
          if (jh.b(param0 ^ 767564705)) {
            var2 = 0;
            if (vd.field_b != null) {
              return;
            }
            if (!kg.field_i) {
              return;
            }
            nj.a(param1, -25698, var2);
            return;
          }
          var2 = 1;
        } else {
          if (null == vd.field_b) {
            sj.field_f = qd.a(0, 640, ck.field_e, 127, 0, 480);
          } else {
            sj.field_f = vd.field_b.c((byte) 105);
            bi.a(0, 2);
          }
          if (null == sj.field_f) {
            var2 = 3;
          } else {
            l.a(param0 - 640, sj.field_f);
            var2 = 2;
          }
        }
        if (vd.field_b != null) {
          return;
        }
        if (!kg.field_i) {
          return;
        }
        nj.a(param1, -25698, var2);
    }

    final static we[] a(int param0, int param1, gk param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        we[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!c.a(param2, false, param1, param0)) {
            return null;
          }
          var4_int = 112 % ((param3 - 31) / 34);
          stackIn_4_0 = pe.b(0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("la.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    la(uh param0) {
        try {
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = new Random();
    }
}
