/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class aj extends qg implements pb {
    qj field_u;
    static String field_v;
    static java.awt.Frame field_t;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 9 / ((-29 - param0) / 53);
        super.a(-93, param1, param2, param3, param4);
        this.j(-110);
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        tl var7 = null;
        qg var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          var7 = new tl(this.field_u);
          if (param3 != -1) {
            return;
          }
          var8 = (qg) (var7.c(param3 - 90));
          while (var8 != null) {
            if (var8.b(8)) {
              var8.a(this.field_n + param0, param1, param2, -1, param4, this.field_p + param5);
              var8 = (qg) (var7.a(405142401));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("aj.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new tl(this.field_u);
          var6 = (qg) (var5.c(-95));
          while (var6 != null) {
            if (var6.b(8)) {
              var6.a(param0 + this.field_n, (byte) -12, param2, param3 + this.field_p);
              var6 = (qg) (var5.a(param1 ^ -405142411));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("aj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        tl var8 = null;
        RuntimeException var8_ref = null;
        qg var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          var8 = new tl(this.field_u);
          if (param4 != -30386) {
            this.f(-5);
          }
          var9 = (qg) (var8.c(-108));
          while (var9 != null) {
            if (var9.b(8)) {
              if (!var9.b(param0, param1, param2, param3 + this.field_p, -30386, param5, this.field_n + param6)) {
                var9 = (qg) (var8.a(405142401));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("aj.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(qg param0, int param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        qg var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          var3 = new tl(this.field_u);
          if (param1 > -11) {
            return true;
          }
          var4 = (qg) (var3.c(-117));
          while (var4 != null) {
            if (var4.a(param0, -87)) {
              return true;
            }
            var4 = (qg) (var3.a(405142401));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("aj.M(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        int var2 = -52 % ((param0 + 57) / 46);
        return null != this.i(-124) ? true : false;
    }

    qg i(int param0) {
        tl var2;
        qg var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = new tl(this.field_u);
        var3 = (qg) (var2.c(-123));
        if (param0 >= -112) {
          return (qg) null;
        }
        while (var3 != null) {
          if (var3.b((byte) 78)) {
            return var3;
          }
          var3 = (qg) (var2.a(405142401));
        }
        return null;
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        qg var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -70, param3, param2, param0)) {
            this.a(param2, 68, param0, param3);
            this.a(-12060, param3, param2, param0);
          }
          if (param1 > -20) {
            var6 = (qg) null;
            this.a((qg) null, (byte) -109);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("aj.Q(").append(param0).append(',').append(param1).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final int g(int param0) {
        int var5 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 >= -41) {
          return -79;
        }
        int var2 = 0;
        tl var3 = new tl(this.field_u);
        qg var4 = (qg) (var3.c(-127));
        while (var4 != null) {
          var5 = var4.g(-68);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (qg) (var3.a(405142401));
        }
        return var2;
    }

    final void a(qg param0, byte param1) {
        try {
          this.field_u.a(param0, -111);
          if (param1 >= -77) {
            field_t = (java.awt.Frame) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "aj.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void k(int param0) {
        oh.field_h.field_p = param0;
        oh.field_h.field_k = 0;
    }

    final static void a(java.awt.Component param0, int param1, int param2, lc param3, boolean param4, int param5, fe param6, int param7) {
        try {
          qh.a(param5, param4, 10);
          re.field_h = qh.a(param6, param0, 0, param1);
          u.field_a = qh.a(param6, param0, 1, param7);
          of.field_a = new jc();
          pc.field_b = param7 * 1000 / param5;
          u.field_a.b(of.field_a);
          jk.field_D = param3;
          jk.field_D.a((byte) 107, lb.field_a);
          re.field_h.b(jk.field_D);
          if (param2 != 22290) {
            ci var9 = (ci) null;
            aj.a((ci) null, (ci) null, (ci) null, -25);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "aj.JB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final String f(int param0) {
        tl var2;
        qg var3;
        String var4;
        int var5;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param0 != 4) {
          aj.a(false, true, true, true);
        }
        var2 = new tl(this.field_u);
        var3 = (qg) (var2.c(-95));
        while (var3 != null) {
          var4 = var3.f(4);
          if (var4 != null) {
            return var4;
          }
          var3 = (qg) (var2.a(param0 + 405142397));
        }
        return null;
    }

    public static void h(int param0) {
        field_v = null;
        field_t = null;
        if (param0 != 32) {
          aj.k(-45);
        }
    }

    final static void a(ci param0, ci param1, ci param2, int param3) {
        ti var17 = null;
        ii[] var5 = null;
        ii[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        ii[] var14 = null;
        int var11_int = 0;
        ti var15 = null;
        ti var18 = null;
        ti var11 = null;
        ti var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Transmogrify.field_A ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          ua.field_f = kl.a(param2, (byte) 127, "commonui", "frame_top");
          rh.field_l = kl.a(param2, (byte) 125, "commonui", "frame_bottom");
          vf.field_a = pc.a("commonui", "jagex_logo_grey", param2, 113);
          mc.field_b = kl.a(param2, (byte) 125, "commonui", "button");
          ai.field_b = ik.a("commonui", param2, (byte) -46, "validation");
          al.field_i = (kg) ((Object) ua.a(param2, "commonui", 32, param1, "arezzo12"));
          vd.field_h = (kg) ((Object) ua.a(param2, "commonui", 32, param1, "arezzo14"));
          rh.field_q = (kg) ((Object) ua.a(param2, "commonui", param3 - 2394310, param1, "arezzo14bold"));
          var17 = new ti(param0.a("", (byte) 100, "button.gif"), (java.awt.Component) ((Object) gd.field_k));
          gk.a("commonui", param3 ^ -2392393, param2, "dropdown");
          var5 = ej.a((byte) -43, param2, "screen_options", "commonui");
          kf.field_h = new ii[4];
          fj.field_a = new ii[4];
          eh.field_b = new ii[4];
          var6 = new ii[][]{fj.field_a, kf.field_h, eh.field_b};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_j;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_i[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = param3;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            ii[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = qf.a(var5[var9], var19[var11_int], -2);
            }
          }
          var9Lifetime1 = var17.field_m;
          og.a((byte) 108);
          var17.e();
          sb.b(0, 0, sb.field_c, sb.field_g);
          var15 = new ti(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.e();
          var17.f(0, 0);
          var11 = new ti(var9Lifetime1, var9Lifetime1);
          var11.e();
          var17.f(-var17.field_n + var9Lifetime1, 0);
          var12 = new ti(-(2 * var9Lifetime1) + var17.field_n, var9Lifetime1);
          var12.e();
          var17.f(-var9Lifetime1, 0);
          fi.c(true);
          mc.field_b = new ti[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "aj.QB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        if (!param0) {
          return (String) null;
        }
        return rf.field_cb[var4];
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qg var9 = null;
        tl var10 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var6 = 26 % ((65 - param2) / 55);
          var10 = new tl(this.field_u);
          var9 = (qg) (var10.c(-117));
          while (var9 != null) {
            if (var9.b(8)) {
              if (var9.b((byte) -103) &&
                var9.a(param0, param1, (byte) 125, param3)) {
                return true;
              }
              var9 = (qg) (var10.a(405142401));
              continue;
            }
            break;
          }
          var7 = param0;
          if (80 != var7) {
            return false;
          }
          if (ve.field_B[81]) {
            stackIn_13_0 = this.a(2, param1);
          } else {
            stackIn_13_0 = this.b(param1, 56);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("aj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void j(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(this.field_u);
        if (param0 > -72) {
          return;
        }
        qg var3 = (qg) (var2.c(-125));
        while (var3 != null) {
          var3.c((byte) 38);
          var3 = (qg) (var2.a(405142401));
        }
    }

    final boolean b(qg param0, int param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        qg var4 = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          if (this.field_u.d(-1)) {
            return false;
          }
          var3 = new tl(this.field_u);
          if (param1 <= 44) {
            return true;
          }
          var4 = (qg) (var3.c(-117));
          while (var4 != null) {
            if (var4.b((byte) -118)) {
              var5 = new tl(this.field_u);
              var5.a(var4, 95);
              var6 = (qg) (var5.a(405142401));
              while (var6 != null) {
                if (var6.a(param0, -30)) {
                  return true;
                }
                var6 = (qg) (var5.a(405142401));
              }
            }
            var4 = (qg) (var3.a(405142401));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("aj.MB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        tl var5 = null;
        qg var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var5 = new tl(this.field_u);
          if (param0 != -12060) {
            this.field_u = (qj) null;
          }
          var6 = (qg) (var5.c(param0 + 11962));
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; var7 <= param3; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(1 + param3, -43, param2, param1);
            var6 = (qg) (var5.a(405142401));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("aj.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = Transmogrify.field_A ? 1 : 0;
        int var6 = -80 % ((77 - param3) / 34);
        if (param2 == 0 &&
          this.field_q != null) {
          this.field_q.a(param0, param1, true, (byte) 103, (qg) (this));
        }
        tl var5 = new tl(this.field_u);
        qg var7 = (qg) (var5.a((byte) 62));
        while (var7 != null) {
          var7.a(param0 + this.field_p, param1 + this.field_n, param2, (byte) 9);
          var7 = (qg) (var5.b(-29339));
        }
    }

    final boolean a(int param0, qg param1) {
        RuntimeException var3 = null;
        qg var4 = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        tl var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          if (this.field_u.d(-1)) {
            return false;
          }
          var8 = new tl(this.field_u);
          if (param0 != 2) {
            this.a(-95, (qg) null, (byte) -47, '￈');
          }
          var4 = (qg) (var8.a((byte) 62));
          while (var4 != null) {
            if (var4.b((byte) -112)) {
              var5 = new tl(this.field_u);
              var5.a(var4, true);
              var6 = (qg) (var5.b(-29339));
              while (var6 != null) {
                if (!var6.a(param1, -69)) {
                  var6 = (qg) (var5.b(-29339));
                  continue;
                }
                return true;
              }
            }
            var4 = (qg) (var8.b(-29339));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("aj.NB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    aj(int param0, int param1, int param2, int param3, ui param4) {
        super(param0, param1, param2, param3, param4, (ma) null);
        this.field_u = new qj();
    }

    final boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        tl var8 = null;
        RuntimeException var8_ref = null;
        qg var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          var8 = new tl(this.field_u);
          var9 = (qg) (var8.c(param5 ^ 114));
          while (var9 != null) {
            if (var9.b(8)) {
              if (var9.b((byte) -119) &&
                var9.a(param0, param1, param2, param3, param4, -17, param6)) {
                return true;
              }
              var9 = (qg) (var8.a(405142401));
              continue;
            }
            break;
          }
          if (param5 == -17) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("aj.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void e(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(this.field_u);
        qg var3 = (qg) (var2.c(-114));
        if (param0 != -29113) {
          this.field_u = (qj) null;
        }
        while (var3 != null) {
          var3.e(-29113);
          var3 = (qg) (var2.a(param0 ^ -405113402));
        }
    }

    static {
        field_v = "Mouse over an icon for details";
    }
}
