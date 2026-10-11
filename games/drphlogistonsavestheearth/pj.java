/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pj extends vg implements ba {
    static String[] field_A;
    static boolean field_H;
    vd field_I;
    static he[] field_z;
    static aj field_G;
    static int field_E;
    static boolean field_C;
    static he[][] field_B;
    static qb field_D;
    static boolean field_F;

    public static void f(int param0) {
        field_A = null;
        field_B = (he[][]) null;
        field_G = null;
        field_D = null;
        int var1 = -31 % ((48 - param0) / 51);
        field_z = null;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        vg var6 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -10612) {
            var6 = (vg) null;
            this.a(0, 46, (byte) 23, 114, (vg) null, 80, 117);
          }
          if (this.a(param1, param2, param0, 43)) {
            this.a(param2, (byte) 89, param0, param1);
            this.a(param1, false, param2, param0);
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pj.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    vg g(int param0) {
        rh var2;
        vg var3;
        int var4;
        vg var5;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = new rh(this.field_I);
        var3 = (vg) (var2.c(-1));
        if (param0 != -22426) {
          var5 = (vg) null;
          this.a((vg) null, 42, -25, (byte) 121);
        }
        while (var3 != null) {
          if (var3.a(true)) {
            return var3;
          }
          var3 = (vg) (var2.a((byte) -85));
        }
        return null;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        rh var5 = null;
        vg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          super.a(param0, param1, param2, (byte) -128);
          if (param3 >= -127) {
            return;
          }
          var5 = new rh(this.field_I);
          var6 = (vg) (var5.c(-1));
          while (var6 != null) {
            if (var6.c(-1387)) {
              var6.a(param0, this.field_o + param1, param2 + this.field_m, (byte) -128);
              var6 = (vg) (var5.a((byte) -119));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("pj.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    pj(int param0, int param1, int param2, int param3, cg param4) {
        super(param0, param1, param2, param3, param4, (fd) null);
        this.field_I = new vd();
    }

    final static double a(double param0, int param1) {
        if (param1 != 32768) {
          return 0.02654725030847743;
        }
        return oj.field_b[(int)(32768.0 * param0 / 3.141592653589793) & 65535];
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param2 != -21) {
          this.e(6);
        }
        if (param1 == 0 &&
          this.field_l != null) {
          this.field_l.a(true, 116, (vg) (this), param3, param0);
        }
        rh var5 = new rh(this.field_I);
        vg var6 = (vg) (var5.a(-80));
        while (var6 != null) {
          var6.a(this.field_o + param0, param1, (byte) -21, param3 + this.field_m);
          var6 = (vg) (var5.b((byte) 87));
        }
    }

    final String e(int param0) {
        rh var2;
        vg var3;
        String var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= -39) {
          return (String) null;
        }
        var2 = new rh(this.field_I);
        var3 = (vg) (var2.c(-1));
        while (var3 != null) {
          var4 = var3.e(-80);
          if (var4 != null) {
            return var4;
          }
          var3 = (vg) (var2.a((byte) -121));
        }
        return null;
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        RuntimeException runtimeException = null;
        rh var7 = null;
        vg var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var7 = new rh(this.field_I);
          if (param5) {
            return;
          }
          var8 = (vg) (var7.c(-1));
          while (var8 != null) {
            if (var8.c(-1387)) {
              var8.a(param0 + this.field_o, this.field_m + param1, param2, param3, param4, param5);
              var8 = (vg) (var7.a((byte) -98));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("pj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        rh var8 = null;
        RuntimeException var8_ref = null;
        vg var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param3 <= 113) {
            field_D = (qb) null;
          }
          var8 = new rh(this.field_I);
          var9 = (vg) (var8.c(-1));
          while (var9 != null) {
            if (var9.c(-1387)) {
              if (var9.a(param0, param1, param2, (byte) 117, param4, this.field_o + param5, this.field_m + param6)) {
                return true;
              }
              var9 = (vg) (var8.a((byte) -100));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("pj.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int a(String param0, int param1, a param2, a param3, int param4, int param5, boolean param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        od stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_13_2 = null;
        od stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var14 = param3.c(-97);
          if (param4 != 0) {
            pj.a(-0.7811526601818387, -66);
          }
          var8 = param2.c(120);
          var11_ref_String = var8;
          if (uj.field_j == null &&
            !ek.a(true, false)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (hh.field_b == tl.field_O) {
            oe.field_a = null;
            nj.field_p.field_j = 0;
            if (param0 != null) {
              var9 = 0;
              am.field_n.field_j = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              am.field_n.a(cm.field_M.nextInt(), (byte) -30);
              am.field_n.a(cm.field_M.nextInt(), (byte) 119);
              am.field_n.a(-23805, var14);
              am.field_n.a(param4 ^ -23805, var8);
              var15 = (CharSequence) ((Object) param0);
              am.field_n.a(param4 ^ -23805, fg.a(var15, 90));
              am.field_n.c(param5, param4 - 17402);
              am.field_n.c(param1, (byte) -88);
              am.field_n.c(var9, (byte) -98);
              nj.field_p.c(18, (byte) -101);
              nj.field_p.field_j = nj.field_p.field_j + 2;
              var10 = nj.field_p.field_j;
              var11_ref_StringLifetime1 = ob.a((byte) 97, nb.a(param4 + 67));
              if (var11_ref_StringLifetime1 == null) {
                var11_ref_StringLifetime1 = "";
              }
              nj.field_p.a(var11_ref_StringLifetime1, -1);
              i.a(nj.field_p, am.field_n, a.field_b, d.field_a, 0);
              nj.field_p.a(-2, -var10 + nj.field_p.field_j);
            } else {
              am.field_n.field_j = 0;
              am.field_n.a(cm.field_M.nextInt(), (byte) -77);
              am.field_n.a(cm.field_M.nextInt(), (byte) 126);
              stackIn_12_0 = am.field_n;
              stackIn_12_1 = -23805;
              if (!param3.a((byte) -128)) {
                stackIn_13_2 = "";
              } else {
                stackIn_13_2 = var14;
              }
              ((od) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2);
              stackIn_15_0 = am.field_n;
              stackIn_15_1 = param4 - 23805;
              if (!param2.a((byte) -108)) {
                stackIn_16_2 = "";
              } else {
                stackIn_16_2 = var8;
              }
              ((od) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2);
              nj.field_p.c(16, (byte) -102);
              nj.field_p.field_j = nj.field_p.field_j + 1;
              var9 = nj.field_p.field_j;
              i.a(nj.field_p, am.field_n, a.field_b, d.field_a, 0);
              nj.field_p.b(nj.field_p.field_j - var9, (byte) 87);
            }
            qj.a(-1, param4 + 14656);
            tl.field_O = eg.field_h;
          }
          if (tl.field_O == eg.field_h &&
            jd.a(1, param4 ^ 5929)) {
            var9Lifetime1 = dh.field_N.l(31760);
            dh.field_N.field_j = 0;
            if (100 <= var9Lifetime1 &&
              var9Lifetime1 <= 105) {
              td.field_m = new String[-100 + var9Lifetime1];
              tl.field_O = kc.field_n;
            } else {
              if (248 == var9Lifetime1) {
                dd.a((byte) 64, nb.a(param4 - 77));
                cc.field_p = dd.field_n;
                eg.a((byte) 126);
                dk.field_b = false;
                stackIn_31_0 = var9Lifetime1;
                return stackIn_31_0;
              }
              if (var9Lifetime1 == 99) {
                jd.a(ab.a(39), 5929);
                oe.field_a = new Boolean(eb.a(dh.field_N, param4 + 126));
                dh.field_N.field_j = 0;
              } else {
                tl.field_O = dl.field_L;
                t.field_b = var9Lifetime1;
                gf.field_C = -1;
              }
            }
          }
          if (tl.field_O == kc.field_n) {
            var9Lifetime2 = 2;
            if (jd.a(var9Lifetime2, 5929)) {
              var10Lifetime1 = dh.field_N.j(-788751192);
              dh.field_N.field_j = 0;
              if (jd.a(var10Lifetime1, 5929)) {
                var11 = td.field_m.length;
                for (var12 = 0; var11 > var12; var12++) {
                  td.field_m[var12] = dh.field_N.e(-75);
                }
                eg.a((byte) 126);
                dk.field_b = false;
                stackIn_42_0 = 100 + var11;
                return stackIn_42_0;
              }
            }
          }
          if (dl.field_L == tl.field_O &&
            li.d(-29427)) {
            if (t.field_b != 255) {
              cc.field_p = dh.field_N.b((byte) -63);
            } else {
              var9_ref_String = dh.field_N.i(715718304);
              if (var9_ref_String != null) {
                aj.a(nb.a(-113), param4 + 77, var9_ref_String);
              }
            }
            eg.a((byte) 126);
            dk.field_b = false;
            stackIn_53_0 = t.field_b;
            return stackIn_53_0;
          }
          if (uj.field_j == null) {
            if (dk.field_b) {
              if (30000L >= of.a((byte) 122)) {
                cc.field_p = lf.field_f;
              } else {
                cc.field_p = dg.field_a;
              }
              dk.field_b = false;
              stackIn_62_0 = 249;
              return stackIn_62_0;
            }
            var9Lifetime3 = ei.field_o;
            ei.field_o = ia.field_c;
            dk.field_b = true;
            ia.field_c = var9Lifetime3;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("pj.LA(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
        rh var8 = null;
        RuntimeException var8_ref = null;
        vg var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 <= 43) {
            this.a(-95, -52, 83, 47, -104);
          }
          var8 = new rh(this.field_I);
          var9 = (vg) (var8.c(-1));
          while (var9 != null) {
            if (var9.c(-1387)) {
              if (var9.a(true) &&
                var9.a(param0, param1, (byte) 95, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (vg) (var8.a((byte) -77));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("pj.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 3) {
          field_B = (he[][]) null;
        }
        int var2 = 0;
        rh var3 = new rh(this.field_I);
        vg var4 = (vg) (var3.c(param0 - 4));
        while (var4 != null) {
          var5 = var4.d(param0 ^ 0);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (vg) (var3.a((byte) -91));
        }
        return var2;
    }

    final void b(vg param0, byte param1) {
        try {
          this.field_I.a(param0, 255);
          if (param1 < 30) {
            field_E = -118;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "pj.SA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        rh var8 = null;
        vg var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var8 = new rh(this.field_I);
          var9 = (vg) (var8.c(-1));
          if (param3 <= 63) {
            field_z = (he[]) null;
          }
          while (var9 != null) {
            if (var9.c(-1387)) {
              if (var9.a(true) &&
                var9.a(param0, param1, param2, 72)) {
                return true;
              }
              var9 = (vg) (var8.a((byte) -113));
              continue;
            }
            break;
          }
          var6 = param0;
          if (var6 != 80) {
            return false;
          }
          if (!ck.field_f[81]) {
            stackIn_15_0 = this.a(param2, (byte) 79);
          } else {
            stackIn_15_0 = this.a(param2, 65535);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("pj.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void h(int param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        rh var2 = new rh(this.field_I);
        vg var3 = (vg) (var2.c(-1));
        while (var3 != null) {
          var3.e((byte) 106);
          var3 = (vg) (var2.a((byte) -104));
        }
    }

    final boolean a(vg param0, byte param1) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        vg var4 = null;
        rh var5 = null;
        vg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_I.a(30430)) {
            return false;
          }
          if (param1 <= 29) {
            return true;
          }
          var3 = new rh(this.field_I);
          var4 = (vg) (var3.c(-1));
          while (var4 != null) {
            if (var4.a(true)) {
              var5 = new rh(this.field_I);
              var5.a((gi) (var4), (byte) -98);
              var6 = (vg) (var5.a((byte) -107));
              while (var6 != null) {
                if (!var6.a(false, param0)) {
                  var6 = (vg) (var5.a((byte) -119));
                  continue;
                }
                return true;
              }
            }
            var4 = (vg) (var3.a((byte) -105));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("pj.VA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var2 = new rh(this.field_I);
        int var3 = -40 % ((param0 + 10) / 51);
        vg var4 = (vg) (var2.c(-1));
        while (var4 != null) {
          var4.c((byte) 49);
          var4 = (vg) (var2.a((byte) -87));
        }
    }

    final boolean a(boolean param0, vg param1) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        vg var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0) {
            field_z = (he[]) null;
          }
          var3 = new rh(this.field_I);
          var4 = (vg) (var3.c(-1));
          while (var4 != null) {
            if (var4.a(false, param1)) {
              return true;
            }
            var4 = (vg) (var3.a((byte) -74));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("pj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          vg var3 = (vg) null;
          this.a(-123, 'ﾼ', (vg) null, 80);
        }
        return this.g(-22426) != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(param3 - 16534);
    }

    private final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        rh var5 = null;
        vg var6 = null;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5 = new rh(this.field_I);
          var6 = (vg) (var5.c(-1));
          if (param1) {
            field_D = (qb) null;
          }
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; var7 <= param3; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.a(param3 + 1, param0, param2, -10612);
            var6 = (vg) (var5.a((byte) -72));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("pj.NA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(vg param0, int param1) {
        RuntimeException var3 = null;
        vg var4 = null;
        rh var5 = null;
        vg var6 = null;
        int var7 = 0;
        rh var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_I.a(param1 - 35105)) {
            return false;
          }
          var8 = new rh(this.field_I);
          var4 = (vg) (var8.a(-105));
          while (var4 != null) {
            if (var4.a(true)) {
              var5 = new rh(this.field_I);
              var5.a(var4, -2);
              var6 = (vg) (var5.b((byte) 87));
              while (var6 != null) {
                if (var6.a(false, param0)) {
                  return true;
                }
                var6 = (vg) (var5.b((byte) 87));
              }
            }
            var4 = (vg) (var8.b((byte) 87));
          }
          if (param1 != 65535) {
            this.a(6, -36, -109, -26, 125);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("pj.BB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_A = new String[16];
        field_H = true;
        field_B = new he[3][];
        field_G = new aj();
        field_D = new qb();
    }
}
