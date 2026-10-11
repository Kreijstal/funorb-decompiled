/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v extends b {
    private int field_T;
    static p field_Y;
    static int[] field_S;
    private int field_O;
    static int field_Z;
    private int field_U;
    private int field_Q;
    private int field_V;
    static int field_W;
    private int field_ab;
    static int[][][][] field_X;

    final static tc b(int param0, int param1, int param2, int param3) {
        tc var4 = new tc();
        var4.field_n = new int[param0];
        var4.field_j = param3;
        gf.field_q.a(var4, -104);
        ue.a(var4, param1 ^ 258, param2);
        if (param1 != 256) {
          v.b(-126, -115, -75, 79, 102);
        }
        return var4;
    }

    void c(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = TorChallenge.field_F ? 1 : 0;
        qg.c(param2 + 6, 35 + param1, this.field_p - 12, -40 + this.field_l, 2105376, 0);
        if (param0 != 103) {
          field_S = (int[]) null;
        }
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var4 > var7) {
          if (qg.field_k <= var8 &&
            var8 < qg.field_l) {
            var9 = var7 * (-var5 + var6) / var4 + var5;
            var10 = 0;
            var11 = this.field_p;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (20 - var7) + (20 - var10) * (-var10 + 20);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (-var12 + 462) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  qg.field_i[var10 + var8 * qg.field_g + param2] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = var13Lifetime1 * var13Lifetime1 + (20 - var7) * (-var7 + 20);
                if (var14 <= 462) {
                  if (420 > var14) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = (-var14 + 462) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    qg.field_i[var11 + (qg.field_g * var8 + param2)] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            qg.b(param2 + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = param1 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (var6Lifetime1 - var5Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          qg.b(param2, var8Lifetime1, 6, var9Lifetime1);
          qg.b(this.field_p + param2 - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        rj.field_a.g(-90 + (this.field_p + param2), 10 + param1);
        ak.a(5 + param2, this.field_p - 10, param1 + 35, param0 ^ -30, fl.field_s);
        ak.a(param2, this.field_p, -22 + param1 + this.field_l, param0 ^ -30, qa.field_e);
        var4Lifetime2 = this.field_l - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = param1 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          qg.b(param2, var8Lifetime2, 6, var9Lifetime2);
          qg.b(-6 + (param2 + this.field_p), var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 == 0) {
          return true;
        }
        if (1 == param0) {
          return true;
        }
        if (param1 == param0) {
          return true;
        }
        if (param0 == 8) {
          return true;
        }
        if (15 == param0) {
          return true;
        }
        if (16 == param0) {
          return true;
        }
        return false;
    }

    final static void e(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        lj var9;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (jc.field_c < 0) {
          return;
        }
        var3 = param1 - 135;
        var4 = param0 - 35;
        var5 = 256;
        if (jc.field_c < 75) {
          var5 = (jc.field_c << 8) / 75;
        }
        if (jc.field_c > 200) {
          var5 = (-jc.field_c + 250 << 8) / 50;
        }
        ad.a(123, bd.field_t);
        oc.c();
        qg.b();
        ef.a(3);
        if (256 > var5) {
          qg.a(0, 0, qg.field_g, qg.field_f, 0, -var5 + 256);
        }
        ie.b((byte) -9);
        if (param2 < 40) {
          var9 = (lj) null;
          v.a((String) null, 32, (String) null, (lj) null);
        }
        if (jc.field_c >= 150) {
          hf.field_a.d(var3 + 15, var4 + 10, var5);
        } else {
          bd.field_t.f(var3, var4);
        }
        var6 = -125 + jc.field_c;
        if (var6 > 0 &&
          var6 < 50) {
          if (var6 < 20) {
            var7 = 256 * var6 / 20;
            ul.field_k.b(var3, var4, var7);
          } else {
            if (var6 >= 30) {
              var7 = (12800 - var6 * 256) / 20;
              ul.field_k.b(var3, var4, var7);
            } else {
              ul.field_k.b(var3, var4, 256);
            }
          }
        }
        var6Lifetime1 = -140 + jc.field_c;
        if (0 < var6Lifetime1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          td.field_o.d(15 + var3, var4 + 10, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    final static void a(boolean param0, byte param1, boolean param2, String param3) {
        fg.i(126);
        t.field_b.i(param1 + 8389929);
        if (param1 != -24) {
          return;
        }
        try {
          kb.field_O = new fg(lg.field_b, (String) null, eb.field_m, param2, param0);
          bg.field_K = new jf(t.field_b, kb.field_O);
          t.field_b.a((byte) 88, (ee) (bg.field_K));
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "v.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean f(byte param0) {
        if (param0 != -105) {
          field_Z = 65;
        }
        return lc.a(param0 ^ -106);
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_Q <= 0) {
        } else {
          var2 = this.field_ab;
          var3 = this.field_V;
          fieldTemp$0 = this.field_T + 1;
          this.field_T = this.field_T + 1;
          if (this.field_Q <= fieldTemp$0) {
            this.field_Q = 0;
            this.k(0);
          } else {
            var4 = this.field_T * (-this.field_T + 2 * this.field_Q);
            var5 = this.field_Q * this.field_Q;
            var2 = this.field_U + var4 * (-this.field_U + this.field_ab) / var5;
            var3 = this.field_O + (-this.field_O + this.field_V) * var4 / var5;
          }
          this.b(0, var3, var2);
        }
        if (param0 != 1) {
          uj var6 = (uj) null;
          v.a(-22, -2, 27, 60, (uj) null, 20);
        }
        return super.j(1);
    }

    final static ka[] a(int param0, int param1, int param2, int param3) {
        if (param1 < 66) {
          return (ka[]) null;
        }
        return ma.a(param0, param3, 1, param2, true);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param1 <= 0) {
          this.b(0, param0, param2);
          return;
        }
        if (param3) {
          return;
        }
        this.field_Q = param1;
        this.field_V = param0;
        this.field_O = this.field_l;
        this.field_T = 0;
        this.field_U = this.field_p;
        this.field_ab = param2;
    }

    boolean h(int param0) {
        if (param0 <= 83) {
          v.b(-11, -50, 45, -103, 85);
        }
        this.d(true);
        return super.h(88);
    }

    v(si param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_T = 0;
        this.field_Q = 0;
    }

    final static ka[] a(String param0, int param1, String param2, lj param3) {
        ka[] var4 = null;
        RuntimeException var4_ref = null;
        ka[] var5 = null;
        ka[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 25) {
            v.e(-94, -6, -17);
          }
          var5 = lk.a(-128, param0, param2, param3);
          var4 = var5;
          var5[3].field_v = var5[3].field_x;
          var5[1].field_q = var5[1].field_u;
          var5[7].field_q = var5[7].field_u;
          var5[5].field_v = var5[5].field_x;
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("v.IA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_X = (int[][][][]) null;
        field_S = null;
        field_Y = null;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          qg.b(param0, param3, param2 + 1, 10000536);
          qg.b(param0, param4 + param3, param2 + 1, param1);
          var5_int = 1;
          var6 = param4;
          if (qg.field_k > param3 + var5_int) {
            var5_int = -param3 + qg.field_k;
          }
          if (qg.field_l < param3 + var6) {
            var6 = qg.field_l - param3;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 152 + var7 * 48 / param4;
            var9 = var8 << 8 | var8 << 16 | var8;
            qg.field_i[param0 + qg.field_g * (var7 + param3)] = var9;
            qg.field_i[param2 + qg.field_g * (param3 + var7) + param0] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "v.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, jk param1, int param2, lj param3) {
        try {
          vk.field_h = param2 * ol.b(-128) / 1000;
          ug.a(0, param3);
          wl.a(-2681, param3);
          u.a(true, param3);
          dg.k(-50);
          td.b((byte) 112);
          if (param0 != 127) {
            v.a(30, -88, 66, -60);
          }
          jc.field_c = 0 - vk.field_h;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "v.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    void d(boolean param0) {
        if (this.field_Q <= 0) {
          return;
        }
        if (!param0) {
          return;
        }
        this.b(0, this.field_V, this.field_ab);
        this.field_Q = 0;
        this.k(0);
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, uj param4, int param5) {
        int var9 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ja[] var7 = null;
        int var8_int = 0;
        java.awt.Frame var8 = null;
        int var10 = 0;
        ja[] var11 = null;
        mi var12 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var6_int = -121 % ((param3 - 0) / 40);
          if (!param4.a((byte) -96)) {
            return null;
          }
          if (param2 == 0) {
            var11 = uc.a(-76, param4);
            var7 = var11;
            if (var7 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var8_int = 0;
            for (var9 = 0; var9 < var11.length; var9++) {
              if (param5 == var11[var9].field_h &&
                param0 == var11[var9].field_d && ((0 == param1 ||
                param1 == var11[var9].field_c) &&
                (var8_int == 0 ||
                !(var11[var9].field_i <= param2)))) {
                param2 = var11[var9].field_i;
                var8_int = 1;
              }
            }
            if (var8_int == 0) {
              return null;
            }
          }
          var12 = param4.a(param5, param0, param2, param1, -2);
          while (var12.field_d == 0) {
            c.a(127, 10L);
          }
          var8 = (java.awt.Frame) (var12.field_g);
          if (var8 == null) {
            return null;
          }
          if (var12.field_d != 2) {
            stackIn_37_0 = var8;
            return stackIn_37_0;
          }
          lg.a(param4, (byte) 103, var8);
          stackIn_35_0 = null;
          return (java.awt.Frame) (stackIn_35_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_40_0 = var6;
          stackIn_40_1 = new StringBuilder().append("v.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int d(int param0, int param1, int param2) {
        int var3 = param1 >> 31 & -1 + param2;
        if (param0 >= -70) {
          return -85;
        }
        return ((param1 >>> 31) + param1) % param2 + var3;
    }

    void k(int param0) {
        if (param0 != 0) {
          field_Y = (p) null;
        }
    }

    static {
        field_S = new int[]{32, 31, 31};
        field_W = 4;
        field_Y = new p();
        field_X = new int[][][][]{new int[][][]{new int[][]{new int[]{25, 50}}, new int[][]{new int[]{25, 50}, new int[]{175, 200}}, new int[][]{new int[]{25, 50}, new int[]{150, 175}}, new int[][]{new int[]{25, 50}, new int[]{150, 175}, new int[]{275, 300}}, new int[][]{new int[]{25, 50}}}, new int[][][]{new int[][]{new int[]{250, 275}}, new int[][]{new int[]{150, 175}, new int[]{250, 275}}, new int[][]{new int[]{125, 150}, new int[]{250, 275}}, new int[][]{new int[]{125, 150}, new int[]{250, 275}, new int[]{375, 400}}, new int[][]{new int[]{250, 275}}}};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$b1efba5c64a3(boolean param0, int param1, boolean param2, String param3) {
        fg.i(126);
        t.field_b.i(param1 + 8389929);
        if (param1 != -24) {
          return;
        }
        try {
          kb.field_O = new fg(lg.field_b, (String) null, eb.field_m, param2, param0);
          bg.field_K = new jf(t.field_b, kb.field_O);
          t.field_b.a((byte) 88, (ee) (bg.field_K));
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "v.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }
}
