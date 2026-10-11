/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static nh field_a;
    static rf field_e;
    static he[] field_c;
    private int[] field_g;
    static java.applet.Applet field_d;
    static int[] field_f;
    static long[] field_b;
    static String field_h;

    final static int b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          ng.field_c.a(nl.field_m, ri.field_d, true, 0);
          ng.field_c.b(false);
          while (th.a(param0 - 94)) {
            ng.field_c.a(di.field_c, sj.field_g, 127);
          }
          if (param0 != pe.field_b) {
            var1_int = pe.field_b;
            sf.a(-1, param0 + 11650);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          if (oi.field_c) {
            stackIn_9_0 = 3;
            return stackIn_9_0;
          }
          if (hg.field_ub == lc.field_h) {
            stackIn_12_0 = 1;
            return stackIn_12_0;
          }
          if (!ib.field_f.a(false)) {
            stackIn_15_0 = 1;
            return stackIn_15_0;
          }
          if (hg.field_ub != fk.field_q) {
            stackIn_20_0 = -1;
            return stackIn_20_0;
          }
          stackIn_18_0 = 2;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "wi.C(" + param0 + ')');
        }
    }

    final static u a(String param0, int param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        u stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          if (param1 != 7957) {
            field_h = (String) null;
          }
          var6 = null;
          if (param0.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param0);
            var4_long = ub.a(109, var7);
          } else {
            var6 = param0;
          }
          stackIn_6_0 = tc.a(var4_long, param3, (String) (var6), 0, param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wi.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static vk a(int param0, int param1, int param2) {
        byte[] var4 = null;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        vk var3 = new vk(22050, param0);
        byte[] var4Lifetime1;
        double var5Lifetime1;
        int var7Lifetime1;
        if (param2 == 100) {
          var4 = var3.field_i;
          var5 = (double)param1 * 6.283185307179586 / 22050.0;
          for (var7 = -1 + param0; var7 >= 0; var7--) {
            var4[var7] = (byte)(int)(100.0 * ji.a(65535, var5 * (double)var7) + ji.a(65535, 2.0 * ((double)var7 * var5)) * 27.0);
          }
          return var3;
        }
        wi.b(-9);
        var4Lifetime1 = var3.field_i;
        var5Lifetime1 = (double)param1 * 6.283185307179586 / 22050.0;
        for (var7Lifetime1 = -1 + param0; var7Lifetime1 >= 0; var7Lifetime1--) {
          var4Lifetime1[var7Lifetime1] = (byte)(int)(100.0 * ji.a(65535, var5Lifetime1 * (double)var7Lifetime1) + ji.a(65535, 2.0 * ((double)var7Lifetime1 * var5Lifetime1)) * 27.0);
        }
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_h = null;
        field_d = null;
        if (param0 == 2) {
          field_f = null;
          field_e = null;
          return;
        }
        field_b = (long[]) null;
        field_f = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, bl param6, int param7, int param8) {
        try {
          oi.field_e = param6;
          j.field_ib = param0;
          tb.field_a = param1;
          gi.field_c = param7;
          mi.field_j = param3;
          g.field_r = param4;
          vc.field_e = param5;
          pk.field_q = param2;
          if (param8 < 48) {
            wi.a(88, 114, -72);
          }
          p.field_a = (gb) ((Object) new cl());
          pd.field_d = new n(param6);
          fl.field_a = new df(p.field_a, pd.field_d);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "wi.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0 == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var7_int = param2;
          param0 = param0 + param4;
          var8 = param3;
          L2: while (true) {
            var9 = param1[var8];
            if (0 <= var9) {
              var7_int++;
            } else {
              var7_int = this.field_g[var7_int];
            }
            dupTemp$0 = this.field_g[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param4;
              param4++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param0 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 64) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_g[var7_int];
            }
            dupTemp$2 = this.field_g[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param4;
              param4++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param0 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((32 & var9) != 0) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_g[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param4;
              param4++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param4 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((16 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_g[var7_int];
            }
            dupTemp$6 = this.field_g[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param4;
              param4++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param0 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 8) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_g[var7_int];
            }
            dupTemp$8 = this.field_g[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param4;
              param4++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param0 <= param4) {
                return 1 + (var8 - param3);
              }
              var7_int = 0;
            }
            if (0 != (4 & var9)) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_g[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param4;
              param4++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param0 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 2)) {
              var7_int++;
            } else {
              var7_int = this.field_g[var7_int];
            }
            dupTemp$12 = this.field_g[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param4;
              param4++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param0 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 1) != 0) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_g[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param4;
              param4++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param0 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_67_0 = 1 + (var8 - param3);
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("wi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new int[75];
        field_b = new long[32];
        field_h = "Waiting for sound effects";
    }
}
