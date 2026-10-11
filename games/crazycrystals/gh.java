/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gh extends ea implements Cloneable {
    static boolean field_y;
    static String field_t;
    static int field_C;
    private int field_u;
    static String field_A;
    private boolean field_v;
    private transient boolean field_D;
    static vc field_F;
    int field_x;
    static int field_w;
    int field_G;
    static int[] field_E;
    static int field_B;
    static int[] field_z;

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        sl stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl var7 = null;
        RuntimeException var7_ref = null;
        f var8 = null;
        int var9 = 0;
        sl var10 = null;
        var9 = CrazyCrystals.field_B;
        try {
          var10 = super.a(param0, param1, param2, param3, param4, param5);
          var7 = var10;
          var8 = param0[param1 + param3][param4 + param5];
          while (true) {
            if (!(var8 instanceof ro)) {
              if (var8 instanceof pn) {
                var8 = ((pn) (var8)).field_l;
                continue;
              }
              break;
            }
            jj.field_c.a(128, (param5 + param4) * 12, (param3 + param1) * 12, 60, (byte) -111);
            ((ro) (var8)).field_p = this;
            var10.field_p = false;
            fn.field_j = fn.field_j - 5;
            mb.field_g = mb.field_g - 5;
            break;
          }
          var8 = param0[param1][param4];
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 instanceof ro))) {
            if (var8 instanceof pn) {
              var8 = ((pn) (var8)).field_l;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            m.field_n.a(256, 12 * param4, 12 * param1, 60, (byte) -111);
            this.field_D = false;
            ((ro) (var8)).field_p = null;
            fn.field_j = fn.field_j + 1;
            mb.field_g = mb.field_g + 1;
            ((ro) (var8)).field_o = this;
            b.field_a = b.field_a + 20;
            je.field_j = je.field_j + 20;
            we.field_h = we.field_h + 40;
            fp.field_a = fp.field_a + 40;
          }
          stackIn_14_0 = var7;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_17_0 = var7_ref;
          stackIn_17_1 = new StringBuilder().append("gh.R(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static rh h(int param0) {
        if (param0 != 26500) {
          field_F = (vc) null;
        }
        return new rh(ac.c(61), km.a((byte) -102));
    }

    private final void b(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (this.field_G != 0) {
          this.a(param1, param3, 23179, param5, param2, -1, 0.0, param0);
          this.a(param1, param3, 23179, param5, param2, 1, 1.5707963267948966, param0);
        }
        if (0 != this.field_x) {
          this.a(param1, param2, param3, -1, param0, param5, (byte) -105, 0.0);
          this.a(param1, param2, param3, 1, param0, param5, (byte) -105, 1.5707963267948966);
        }
        int var7 = 100 / ((param4 + 50) / 33);
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        int var7 = 0;
        f stackIn_15_0 = null;
        f stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        f var6 = null;
        RuntimeException var6_ref = null;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          if (null == ab.field_D) {
            gl.field_e = gl.field_e - 1;
            if (param2 != null) {
              var6_int = param2.a(false);
              for (var7 = 0; var7 < 3; var7++) {
                if ((1 << var7 & var6_int) != 0) {
                  q.field_a[var7].a(false, (byte) -128);
                  b.field_a = b.field_a - 1;
                  je.field_j = je.field_j - 1;
                  fp.field_a = fp.field_a - 2;
                  we.field_h = we.field_h - 1;
                  mb.field_g = mb.field_g - 5;
                  fn.field_j = fn.field_j - 5;
                  we.field_h = we.field_h + 6;
                  fp.field_a = fp.field_a + 6;
                  b.field_a = b.field_a + 3;
                  je.field_j = je.field_j + 3;
                  mb.field_g = mb.field_g + wd.field_j;
                  ob.field_l = ob.field_l + 1;
                  if (gl.field_e == 0) {
                    va.field_d = va.field_d | 1 << var7;
                  }
                  mb.field_g = mb.field_g + 50;
                  fn.field_j = fn.field_j + 75;
                }
              }
            }
          }
          if (param3 != 11460) {
            stackIn_15_0 = (f) null;
            return stackIn_15_0;
          }
          this.b(param4, param1, -663, param0);
          var6 = param0[param1 + this.field_s][this.field_o + param4];
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6 instanceof ro))) {
            if (var6 instanceof pn) {
              var6 = ((pn) (var6)).field_l;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            ((ro) (var6)).field_p = null;
            we.field_h = we.field_h + 40;
            fp.field_a = fp.field_a + 40;
            b.field_a = b.field_a + 20;
            je.field_j = je.field_j + 20;
          }
          stackIn_23_0 = this.field_l;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_26_0 = var6_ref;
          stackIn_26_1 = new StringBuilder().append("gh.VA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        try {
          if (param0 != -35) {
            nj var6 = (nj) null;
            this.a(49, (nj) null);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gh.KC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        f var5 = null;
        RuntimeException var5_ref = null;
        ro var6_ref_ro = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nj var11 = null;
        int var7Lifetime1;
        var10 = CrazyCrystals.field_B;
        try {
          this.field_v = false;
          var5 = this.field_l;
          while (true) {
            if (var5 instanceof ro) {
              var6_ref_ro = (ro) (var5);
              var7 = 0;
              while (true) {
                if (4 <= var7) {
                  return;
                }
                if (1 == var6_ref_ro.field_m) {
                  var8 = this.field_x;
                  var6_ref_ro.field_m = 0;
                  var9 = this.field_G;
                } else {
                  var6_ref_ro.field_m = 1;
                  var9 = -this.field_G;
                  var8 = -this.field_x;
                }
                this.field_G = var8;
                this.field_x = var9;
                if (!param2[this.field_x + param1][this.field_G + param3].a(16736352, param2, true, this.field_x, param1, param3, (ea) (this), this.field_G)) {
                  this.a((byte) 73, param2[param1 + this.field_x][param3 + this.field_G]);
                  this.field_x = -this.field_x;
                  this.field_G = -this.field_G;
                  var7++;
                  continue;
                }
                break;
              }
              var6_ref_ro.a((byte) 127, (f) (this));
              this.field_v = true;
              this.a(param2, param1, false, this.field_x, param3, this.field_G);
              mb.field_g = mb.field_g + ob.field_l;
              wd.field_j = wd.field_j + 1;
              return;
            }
            if (var5 instanceof pn) {
              var5 = ((pn) (var5)).field_l;
              continue;
            }
            break;
          }
          var6 = 0;
          if (param0 != 1) {
            var11 = (nj) null;
            this.a(-1, (nj) null);
          }
          var7Lifetime1 = 0;
          while (true) {
            if (var7Lifetime1 >= 2) {
              return;
            }
            if (!param2[param1 + this.field_x][param3 + this.field_G].a(16736352, param2, true, this.field_x, param1, param3, (ea) (this), this.field_G)) {
              this.a((byte) 62, param2[this.field_x + param1][this.field_G + param3]);
              this.field_x = -this.field_x;
              var6 = 1;
              this.field_G = -this.field_G;
              var7Lifetime1++;
              continue;
            }
            break;
          }
          if (var6 != 0) {
            ga.field_B.a(64, param3 * 12, 12 * param1, 60, (byte) -111);
          }
          mb.field_g = mb.field_g + ob.field_l;
          wd.field_j = wd.field_j + 1;
          this.field_v = true;
          this.a(param2, param1, false, this.field_x, param3, this.field_G);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_31_0 = var5_ref;
          stackIn_31_1 = new StringBuilder().append("gh.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void j(int param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        dl var4 = null;
        String var5 = null;
        String var6 = null;
        nj var7 = null;
        int var8 = 0;
        nj var9 = null;
        var8 = CrazyCrystals.field_B;
        try {
          if (ge.field_c == 0) {
            return;
          }
          var1_int = mm.a(ge.field_c, (byte) -120);
          if (param0 != -10935) {
            return;
          }
          if (li.field_a != null &&
            li.field_a.field_l != null) {
            var9 = li.field_a;
            var2 = var9;
            var1_int++;
            if (300 > var9.field_f) {
              var9.field_f = 300;
            }
            while (null != ((nj) (var2)).field_n) {
              var2 = ((nj) (var2)).field_n;
              var1_int++;
            }
            if (var1_int > 3) {
              var2 = null;
            }
          } else {
            var2 = null;
          }
          for (var3 = 0; var3 < 17; var3++) {
            if ((ge.field_c & 1 << var3) != 0) {
              var4 = vf.field_b[var3];
              var5 = jm.field_e[var3];
              var6 = ci.a(new String[]{an.field_o[var3]}, wn.field_a, 3);
              var7 = new nj(var4, var5, var6);
              if (var2 != null) {
                if (((nj) (var2)).field_i) {
                  var7.field_i = true;
                }
                ((nj) (var2)).field_n = var7;
              } else {
                li.field_a = var7;
              }
              var2 = var7;
            }
          }
          ge.field_c = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "gh.FC(" + param0 + ')');
        }
    }

    gh(f param0, int param1, int param2) {
        super(param0);
        this.field_D = true;
        try {
          this.field_G = param1;
          this.field_x = param2;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
          this.a(true, 46);
        }
        return 12;
    }

    private final dl e(byte param0) {
        if (this.field_G < 0) {
          return vp.field_d;
        }
        if (this.field_G > 0) {
          return na.field_eb;
        }
        if (this.field_x < 0) {
          return mk.field_a;
        }
        if (param0 != 79) {
          return (dl) null;
        }
        return tl.field_b;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            gh.j(58);
          }
          stackIn_3_0 = ng.a(rb.field_e, param1, new gh(new kp(-1), 0, 0), (byte) -83, fl.field_f);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gh.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        f stackIn_2_0 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_u = (38 + (this.field_u + 12 * (this.field_G + this.field_x))) % 38;
          this.field_D = param0.field_p;
          if (param4 == 17512) {
            stackIn_4_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
            return stackIn_4_0;
          }
          stackIn_2_0 = (f) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("gh.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (null != to.field_f &&
            !to.field_f.equals(param0.getParameter("settings"))) {
            var3 = to.field_f;
            var4 = var3;
            var4 = var3;
          }
          if (param2 != 67) {
            field_y = true;
          }
          if (hm.field_c != null &&
            !hm.field_c.equals(param0.getParameter("session"))) {
            var4 = hm.field_c;
          }
          stackIn_11_0 = rf.a(-1, (String) (var4), true, (String) (var3), param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("gh.DA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 4261) {
          this.g(3);
        }
        if (this.field_v) {
          this.b(param3, false, param2, param4, -5, param1);
        }
        if (param2 == 24 &&
          param3 == 24) {
          il.field_e.a(param1, param4 - param3);
          if (param0) {
            this.e((byte) 79).a(param1, param4 - param3);
          }
        } else {
          il.field_e.b(param1, param4 - param3, 2 * param2, param3 * 3);
          if (param0) {
            this.e((byte) 79).b(param1, param4 - param3, 2 * param2, 3 * param3);
          }
        }
        if (this.field_v) {
          this.b(param3, true, param2, param4, 2, param1);
        }
    }

    final static void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        RuntimeException var4_ref = null;
        try {
          rn.field_q = param0;
          if (param1 != 12) {
            field_B = -26;
          }
          lc.field_d = param3;
          var4 = gf.field_c;
          synchronized (var4) {
            fq.field_x.d(62);
            gf.field_c.a();
          }
          om.field_x = null;
          if (param0 != null) {
            fq.field_x.e(-20562, param3 * param2 >> 6);
            om.field_x = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("gh.KA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_z = null;
        field_E = null;
        field_F = null;
        field_t = null;
        if (param0 != 0) {
          field_F = (vc) null;
        }
        field_A = null;
    }

    final static int a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -122 % ((param1 + 54) / 35);
          stackIn_1_0 = an.field_q.a(param0, 148);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("gh.K(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, double param6, int param7) {
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        int var10;
        int var11;
        double var12;
        int var14;
        double var15;
        int var17;
        int var18;
        if (param2 != 23179) {
          return;
        }
        var10 = param4 + param3 << 4;
        var11 = (param1 << 4) + (param7 << 3);
        var12 = 0.16534698176788384 * (double)(this.field_u + this.field_G * this.field_m) + param6;
        var14 = param5;
        var15 = Math.cos(var12);
        var17 = (int)(13.856406460551018 * ((double)param4 * Math.sin(var12)));
        var18 = (int)(6.928203230275509 * (var15 * (double)param7));
        stackIn_4_0 = param0;
        stackIn_5_1 = (!(0.0 < 4.0 * (double)var14 - var15 * 13.856406460551018)) ? 0 : 1;
        if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
          kh.a(var10 - var17, var18 + (var11 + param5 * (int)((double)param7 * 8.0)), param4 << 1, 15, rn.field_j);
        }
        stackIn_11_0 = (var15 * 13.856406460551018 + 4.0 * (double)var14 > 0.0) ? 0 : 1;
        stackIn_14_1 = (param0) ? 0 : 1;
        if (stackIn_11_0 == stackIn_14_1) {
          kh.a(var10 + var17, var11 - var18 + (int)((double)param7 * 8.0) * param5, param4 << 1, 15, rn.field_j);
        }
        return;
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        int var6_int = 0;
        try {
          if (param3 >= -69) {
            field_F = (vc) null;
          }
          var6_int = param1.readUnsignedByte();
          this.field_G = mo.field_h[var6_int];
          this.field_x = kl.field_S[var6_int];
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gh.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 18 % ((74 - param0) / 41);
        if (this.field_D) {
          super.b(120, param1, param2, param3, param4, param5);
        }
    }

    final boolean g(int param0) {
        if (param0 != 0) {
          f var3 = (f) null;
          this.a((f[][]) null, -81, (f) null, 72, -60);
          return false;
        }
        return false;
    }

    final void c(boolean param0, boolean param1) {
        if (!param0) {
          gh.k(-98);
        }
        if (param1) {
          return;
        }
        gl.field_e = gl.field_e + 1;
    }

    final void b(int param0, int param1, int param2, f[][] param3) {
        f var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var6 = CrazyCrystals.field_B;
        try {
          var5 = param3[param1][param0];
          while (true) {
            if (!(var5 instanceof ro)) {
              if (var5 instanceof pn) {
                var5 = ((pn) (var5)).field_l;
                continue;
              }
              break;
            }
            ((ro) (var5)).field_o = null;
            this.field_D = true;
            break;
          }
          if (param2 != -663) {
            this.f(99, -94, (f[][]) null, -15);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("gh.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        de var6 = null;
        int var7 = 0;
        f stackIn_5_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = CrazyCrystals.field_B;
        try {
          var5 = this.field_l;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 instanceof de))) {
            if (var5 instanceof pn) {
              var5 = ((pn) (var5)).field_l;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var6 = (de) (var5);
            if (null == var6.field_j) {
              ua.field_a.a(256, param1 * 12, param0 * 12, 0, (byte) -111);
              var6.field_j = (ea) (this);
              this.field_v = false;
              stackIn_5_0 = this.a(param2, param0, (f) (this), 11460, param1);
              return stackIn_5_0;
            }
          }
          if (param3 < 120) {
            this.field_v = true;
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("gh.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, byte param6, double param7) {
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        int var10;
        int var11;
        double var12;
        double var14;
        double var16;
        int var18;
        int var19;
        var10 = param1 + param5 << 4;
        var11 = (param4 << 3) + (param2 << 4);
        if (param6 != -105) {
          gh.k(107);
        }
        var12 = param7 + 0.16534698176788384 * (double)(this.field_m * this.field_x + this.field_u);
        var14 = Math.sin(var12);
        var16 = Math.cos(var12);
        var18 = (int)(11.313708498984761 * (double)param1);
        var19 = (int)(5.656854249492381 * (var16 * (double)param4) + 11.313708498984761 * ((double)param1 * var14));
        stackIn_5_0 = (!(0.0 < -(var16 * 11.313708498984761) + 5.656854249492381 * var14)) ? 0 : 1;
        stackIn_8_1 = (param0) ? 0 : 1;
        if (stackIn_5_0 != stackIn_8_1) {
          kh.a(param3 * var18 + var10, var11 - var19, param1 << 1, 15, rn.field_j);
        }
        stackIn_13_0 = (!(5.656854249492381 * var14 - 11.313708498984761 * var16 < 0.0)) ? 0 : 1;
        stackIn_16_1 = (param0) ? 0 : 1;
        if (stackIn_13_0 != stackIn_16_1) {
          kh.a(var10 + param3 * var18, var11 + var19, param1 << 1, 15, rn.field_j);
        }
    }

    final static void i(int param0) {
        int var1_int = 0;
        int var2 = CrazyCrystals.field_B;
        sc.field_i[0].a((byte) -123);
        sc.field_i[0] = null;
        sc.field_i[1].a((byte) -65);
        sc.field_i[1] = null;
        ga.field_B.a((byte) -127);
        ga.field_B = null;
        ua.field_a.a((byte) -113);
        ua.field_a = null;
        cb.field_n.a((byte) -84);
        cb.field_n = null;
        tm.field_f.a((byte) -74);
        tm.field_f = null;
        for (var1_int = 0; var1_int < 4; var1_int++) {
          il.field_h[var1_int].a((byte) -112);
          il.field_h[var1_int] = null;
        }
        if (param0 < 126) {
          return;
        }
        try {
          si.field_e.a((byte) -93);
          si.field_e = null;
          td.field_e.a((byte) -87);
          td.field_e = null;
          bc.field_a.a((byte) -82);
          bc.field_a = null;
          dn.field_d.a((byte) -87);
          dn.field_d = null;
          wp.field_b.a((byte) -91);
          wp.field_b = null;
          bn.field_h.a((byte) -91);
          bn.field_h = null;
          pm.field_b.a((byte) -87);
          pm.field_b = null;
          so.field_g.a((byte) -118);
          so.field_g = null;
          fn.field_h.a((byte) -75);
          fn.field_h = null;
          dd.field_c.a((byte) -17);
          dd.field_c = null;
          cn.field_e.a((byte) -64);
          cn.field_e = null;
          jj.field_c.a((byte) -30);
          jj.field_c = null;
          m.field_n.a((byte) -32);
          m.field_n = null;
          a.field_d.a((byte) -14);
          a.field_d = null;
          rb.field_g.a((byte) -75);
          rb.field_g = null;
          ln.field_f.a((byte) -29);
          ln.field_f = null;
          oj.field_E.a((byte) -42);
          oj.field_E = null;
          c.field_q.a((byte) -68);
          c.field_q = null;
          ck.field_db.a((byte) -86);
          vk.field_N.a((byte) -16);
          fp.field_c.a((byte) -84);
          aa.field_a.a((byte) -94);
          mn.b(false);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gh.GC(" + param0 + ')');
        }
    }

    final static void f(byte param0) {
        if (null != sp.field_a) {
          sp.field_a.i((byte) -45);
        }
        oh.field_d = new qk();
        jm.field_d.a((qm) (oh.field_d), (byte) -50);
        if (param0 != -10) {
          field_F = (vc) null;
        }
    }

    static {
        field_t = "You have <%0> unread messages!";
        field_E = new int[16384];
    }
}
