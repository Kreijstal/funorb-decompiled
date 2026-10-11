/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ta extends pj implements c {
    static int field_z;
    im field_x;
    static String field_y;

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, pj param6) {
        km var8 = null;
        RuntimeException var8_ref = null;
        pj var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          var8 = new km(this.field_x);
          var9 = (pj) (var8.d(27935));
          while (var9 != null) {
            if (var9.b(true)) {
              if (var9.d(-81) &&
                var9.a(false, param1, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (pj) (var8.b(true));
              continue;
            }
            break;
          }
          if (!param0) {
            return false;
          }
          this.field_x = (im) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ta.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(0);
    }

    final static void a(int param0, kc param1, kc param2, int param3) {
        vi.field_I = param3;
        jd.field_a = param1;
        ck.field_g = param2;
        jk.b(ul.field_l / 2, ul.field_f / 2, param0 ^ 249);
        if (param0 != 0) {
          return;
        }
        try {
          nc.a(param0 + 125, param2.field_E, param1.field_E + param1.field_B, param1.field_E, param2.field_E + param2.field_B);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ta.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        pj var6 = null;
        int var8 = 0;
        pj var9 = null;
        km var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          var10 = new km(this.field_x);
          if (param1 != 954) {
            var9 = (pj) null;
            this.b((pj) null, true);
          }
          var6 = (pj) (var10.d(param1 ^ 28325));
          while (var6 != null) {
            discarded$3 = param0.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$4 = param0.append(' ');
            }
            var6.a((byte) -34, param2, 1 + param3, param0);
            var6 = (pj) (var10.b(true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ta.HA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_y = null;
        int var1 = -50 / ((param0 - 17) / 61);
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        pj var9 = null;
        int var10 = 0;
        km var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          var11 = new km(this.field_x);
          if (param0 >= -115) {
            this.g(5);
          }
          var9 = (pj) (var11.d(27935));
          while (var9 != null) {
            if (var9.b(true)) {
              if (var9.a((byte) -124, param1, param2, param3 + this.field_s, param4, param5, this.field_n + param6)) {
                return true;
              }
              var9 = (pj) (var11.b(true));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ta.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var2 = 0;
        km var3 = new km(this.field_x);
        pj var4 = (pj) (var3.d(27935));
        while (var4 != null) {
          var5 = var4.f(-20598);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (pj) (var3.b(true));
        }
        if (param0 != -20598) {
          this.field_x = (im) null;
        }
        return var2;
    }

    final String g(int param0) {
        String var4 = null;
        int var5 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(this.field_x);
        pj var3 = (pj) (var2.d(27935));
        while (var3 != null) {
          var4 = var3.g(-8235);
          if (var4 != null) {
            return var4;
          }
          var3 = (pj) (var2.b(true));
        }
        if (param0 == -8235) {
          return null;
        }
        field_z = 53;
        return null;
    }

    final boolean d(int param0) {
        if (param0 != -81) {
          field_z = 68;
        }
        return this.b((byte) -109) != null ? true : false;
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(9882, param3, param2, param1)) {
            this.a(param2, (byte) -119, param1, param3);
            this.a(param3, 954, param1, param2);
          }
          if (param0 < -23) {
            stackIn_6_0 = (StringBuilder) (param3);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ta.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void j(int param0) {
        hj var1 = null;
        hj var2 = null;
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        try {
          var1 = new hj(540, 140);
          de.a(-128, var1);
          wi.c();
          ul.d();
          ji.field_b = 0;
          bj.j(92);
          var2 = var1.f();
          for (var3 = param0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            ul.e(4, 4, 0, 0, 540, 140);
          }
          jc.field_k.d();
          var1.d(0, 0);
          oc.g((byte) -105);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ta.EA(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = OrbDefence.field_D ? 1 : 0;
        if (param2 != 1048575) {
          pj var8 = (pj) null;
          this.a(68, (pj) null);
        }
        if (0 == param1 &&
          this.field_j != null) {
          this.field_j.a(param0, param3, (pj) (this), -4394, true);
        }
        km var5 = new km(this.field_x);
        pj var6 = (pj) (var5.c(-7651));
        while (var6 != null) {
          var6.a(param0 + this.field_n, param1, param2 ^ 0, param3 + this.field_s);
          var6 = (pj) (var5.a((byte) -116));
        }
    }

    pj b(byte param0) {
        km var2;
        pj var3;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        var2 = new km(this.field_x);
        if (param0 != -109) {
          field_z = -74;
        }
        var3 = (pj) (var2.d(param0 + 28044));
        while (var3 != null) {
          if (var3.d(-81)) {
            return var3;
          }
          var3 = (pj) (var2.b(true));
        }
        return null;
    }

    final boolean a(pj param0, boolean param1) {
        km var3 = null;
        RuntimeException var3_ref = null;
        pj var4 = null;
        km var5 = null;
        pj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_x.c(-3088)) {
            return false;
          }
          var3 = new km(this.field_x);
          if (param1) {
            field_y = (String) null;
          }
          var4 = (pj) (var3.c(-7651));
          while (var4 != null) {
            if (var4.d(-81)) {
              var5 = new km(this.field_x);
              var5.b(var4, (byte) -120);
              var6 = (pj) (var5.a((byte) -81));
              while (var6 != null) {
                if (var6.a(-81, param0)) {
                  return true;
                }
                var6 = (pj) (var5.a((byte) -114));
              }
            }
            var4 = (pj) (var3.a((byte) -113));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("ta.BA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        km var7 = null;
        pj var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          var7 = new km(this.field_x);
          if (param2 >= -91) {
            return;
          }
          var8 = (pj) (var7.d(27935));
          while (var8 != null) {
            if (var8.b(true)) {
              var8.a(this.field_n + param0, param1, (byte) -98, param3, param4 + this.field_s, param5);
              var8 = (pj) (var7.b(true));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ta.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, wd param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        fa stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        fa var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        wd var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = OrbDefence.field_D ? 1 : 0;
        try {
          var44 = param1;
          if (var44.field_t != null &&
            var44.field_m > 1) {
            var60 = var44.field_t;
            li.a(0, 0, ji.field_a, -86, var60);
          } else {
            fg.b((byte) 88);
          }
          var54 = new int[param1.field_w];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param1.field_w];
          var62 = ee.field_g;
          if (param7 != 23) {
            return;
          }
          var61 = cf.field_e;
          var63 = ue.field_H;
          for (var13 = 0; var13 < param1.field_w; var13++) {
            var14 = param0 * var61[var13] + param6 * var62[var13] + var63[var13] * param3 >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_18_0 = 128;
            } else {
              if (var14 >= 128) {
                stackIn_18_0 = 256;
              } else {
                stackIn_18_0 = var14 + 128;
              }
            }
            var14Lifetime2 = stackIn_18_0;
            var15 = param4 * var63[var13] + (var62[var13] * param2 + param5 * var61[var13]) >> 8;
            stackIn_20_0 = dk.field_c;
            if (var15 >= 0) {
              stackIn_21_1 = var15;
            } else {
              stackIn_21_1 = -var15;
            }
            var15Lifetime2 = stackIn_20_0[stackIn_21_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < fg.field_u; var13Lifetime1++) {
            var14Lifetime1 = dm.field_g[var13Lifetime1];
            var15Lifetime1 = param1.field_M[var14Lifetime1];
            var16 = param1.field_e[var14Lifetime1];
            var17 = param1.field_l[var14Lifetime1];
            if (ee.field_g.length <= param1.field_q[var14Lifetime1]) {
              stackIn_27_0 = -1;
            } else {
              stackIn_27_0 = param1.field_q[var14Lifetime1];
            }
            var18 = stackIn_27_0;
            if (param1.field_y[var14Lifetime1] >= ee.field_g.length) {
              stackIn_30_0 = -1;
            } else {
              stackIn_30_0 = param1.field_y[var14Lifetime1];
            }
            var19 = stackIn_30_0;
            if (param1.field_i[var14Lifetime1] < ee.field_g.length) {
              stackIn_33_0 = param1.field_i[var14Lifetime1];
            } else {
              stackIn_33_0 = -1;
            }
            var20 = stackIn_33_0;
            if (null != cg.field_c &&
              param1.field_N != null &&
              var14Lifetime1 < param1.field_N.length &&
              param1.field_N[var14Lifetime1] != -1 &&
              param1.field_N[var14Lifetime1] < cg.field_c.length) {
              stackIn_40_0 = cg.field_c[param1.field_N[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = a.field_t[var15Lifetime1];
            var23 = ph.field_x[var15Lifetime1];
            var24 = a.field_t[var16];
            var25 = ph.field_x[var16];
            var26 = a.field_t[var17];
            var27 = ph.field_x[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_50_0 = var21.field_d;
              } else {
                stackIn_50_0 = 8355711;
              }
              var30 = stackIn_50_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = (var28 * var32 & 16711902) >>> 8 | var31 * var28 >>> 8 & 1878982911;
              var33 = var33 + 65793 * var29;
              gi.a((var33 & 16711422) >> 1, var27, var26, var23, param7 ^ -35, var24, var25, var22);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_46_0 = var21.field_d;
              } else {
                stackIn_46_0 = 8355711;
              }
              var34 = stackIn_46_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = (-16711738 & var35 * var28) >>> 8 | (var36 * var28 & 16711772) >>> 8;
              var38 = (-16711687 & var35 * var29) >>> 8 | (var29 * var36 & 16711710) >>> 8;
              var39 = (var30 * var36 & 16711926) >>> 8 | (var30 * var35 & -16711931) >>> 8;
              var38 = var38 + var32 * 65793;
              var37 = var37 + 65793 * var31;
              var39 = var39 + var33 * 65793;
              dd.a(var37 >> 8 & 255, var37 >> 16, var38 >> 16, 255 & var37, (65431 & var38) >> 8, var27, var23, var26, var38 & 255, var24, false, 255 & var39, var39 >> 16, (var39 & 65535) >> 8, var25, var22);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_55_0 = var8_ref;
          stackIn_55_1 = new StringBuilder().append("ta.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(pj param0, byte param1) {
        try {
          if (param1 != 74) {
            pj var4 = (pj) null;
            this.a((pj) null, true);
          }
          this.field_x.a(-100, param0);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ta.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void i(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 0) {
          return;
        }
        km var2 = new km(this.field_x);
        pj var3 = (pj) (var2.d(param0 + 27935));
        while (var3 != null) {
          var3.c(param0 ^ -26385);
          var3 = (pj) (var2.b(true));
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        km var5 = null;
        pj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new km(this.field_x);
          var6 = (pj) (var5.d(27935));
          while (var6 != null) {
            if (var6.b(true)) {
              var6.a((byte) -77, param1, param2 + this.field_s, this.field_n + param3);
              var6 = (pj) (var5.b(true));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ta.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        kc var8 = null;
        pj var9 = null;
        km var10 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var10 = new km(this.field_x);
          var9 = (pj) (var10.d(27935));
          while (var9 != null) {
            if (var9.b(true)) {
              if (var9.d(-81) &&
                var9.a(param0, param1, param2, 0)) {
                return true;
              }
              var9 = (pj) (var10.b(true));
              continue;
            }
            break;
          }
          var6 = param1;
          if (var6 == 80) {
            if (!ek.field_a[81]) {
              stackIn_15_0 = this.b(param2, false);
            } else {
              stackIn_15_0 = this.a(param2, false);
            }
            return stackIn_15_0;
          }
          if (param3 != 0) {
            var8 = (kc) null;
            ta.a(5, (kc) null, (kc) null, -95);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ta.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, pj param1) {
        km var3 = null;
        RuntimeException var3_ref = null;
        pj var4 = null;
        int var5 = 0;
        pj var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          var3 = new km(this.field_x);
          if (param0 != -81) {
            var6 = (pj) null;
            this.a(-83, 78, (byte) -38, (pj) null, 11, -89);
          }
          var4 = (pj) (var3.d(27935));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0 + 0, param1)) {
              var4 = (pj) (var3.b(true));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ta.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ta(int param0, int param1, int param2, int param3, td param4) {
        super(param0, param1, param2, param3, param4, (ag) null);
        this.field_x = new im();
    }

    final void h(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 0) {
          return;
        }
        km var2 = new km(this.field_x);
        pj var3 = (pj) (var2.d(27935));
        while (var3 != null) {
          var3.h(param0 ^ 0);
          var3 = (pj) (var2.b(true));
        }
    }

    final boolean b(pj param0, boolean param1) {
        km var3 = null;
        RuntimeException var3_ref = null;
        pj var4 = null;
        km var5 = null;
        pj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1) {
            this.i(24);
          }
          if (this.field_x.c(-3088)) {
            return false;
          }
          var3 = new km(this.field_x);
          var4 = (pj) (var3.d(27935));
          while (var4 != null) {
            if (var4.d(-81)) {
              var5 = new km(this.field_x);
              var5.a(var4, (byte) -1);
              var6 = (pj) (var5.b(true));
              while (var6 != null) {
                if (var6.a(-81, param0)) {
                  return true;
                }
                var6 = (pj) (var5.b(true));
              }
            }
            var4 = (pj) (var3.b(true));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("ta.CA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_y = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
