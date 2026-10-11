/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_c;
    static sm field_b;
    static boolean field_a;

    final static boolean a(int[] param0, byte param1) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        bg var5_ref_bg = null;
        int var5 = 0;
        bg var6 = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          if (ic.field_T != df.field_j) {
            return false;
          }
          var2_int = 26 % ((-18 - param1) / 33);
          var3 = pd.a(-22826);
          if (jh.field_h != 0 &&
            l.field_e < 0) {
            var5_ref_bg = (bg) (ui.field_f.b((byte) 26));
            if (var5_ref_bg != null &&
              var5_ref_bg.field_h < var3) {
              var5_ref_bg.b(-27598);
              jd.field_b = var5_ref_bg.field_m.length;
              fj.field_g.field_j = 0;
              for (var6_int = 0; var6_int < jd.field_b; var6_int++) {
                fj.field_g.field_h[var6_int] = var5_ref_bg.field_m[var6_int];
              }
              em.field_U = wb.field_t;
              wb.field_t = e.field_P;
              e.field_P = l.field_d;
              l.field_d = var5_ref_bg.field_j;
              return true;
            }
          }
          while (true) {
            if (0 > l.field_e) {
              fj.field_g.field_j = 0;
              if (!ck.a((byte) -117, 1)) {
                return false;
              }
              l.field_e = fj.field_g.i((byte) 126);
              fj.field_g.field_j = 0;
              jd.field_b = param0[l.field_e];
            }
            if (!nn.a(-2887)) {
              return false;
            }
            if (0 == jh.field_h) {
              em.field_U = wb.field_t;
              wb.field_t = e.field_P;
              e.field_P = l.field_d;
              l.field_d = l.field_e;
              l.field_e = -1;
              return true;
            }
            var5 = jh.field_h;
            if (ca.field_a != 0.0) {
              var5 = (int)((double)var5 + p.field_b.nextGaussian() * ca.field_a);
              if (var5 < 0) {
                var5 = 0;
              }
            }
            var6 = new bg((long)var5 + var3, l.field_e, new byte[jd.field_b]);
            for (var7 = 0; jd.field_b > var7; var7++) {
              var6.field_m[var7] = fj.field_g.field_h[var7];
            }
            ui.field_f.a(0, var6);
            l.field_e = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("gf.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          String var2 = (String) null;
          gf.a((dj) null, (String) null, -54, (String) null);
        }
        field_b = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var3 = (String) null;
            gf.a((dj) null, (String) null, 11, (String) null);
          }
          stackIn_3_0 = ni.a(param1.length, 0, param0 + 127, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static vn a(dj param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        vn stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 8) {
            stackIn_2_0 = (vn) null;
            return stackIn_2_0;
          }
          var4_int = param0.a(param3, (byte) 8);
          var5 = param0.a(var4_int, param1, true);
          stackIn_4_0 = hg.a(var5, var4_int, param0, -2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gf.F(");
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        ig.m((byte) -102);
        if (param0 != 41) {
          field_a = true;
        }
        mp.field_e = true;
        nm.field_c = true;
        e.field_S.j(-636330975);
        ti.a(tg.field_a, false, false);
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (255 < param0) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (15 < param0) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (1 < param0) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        var3 = 23 % ((param1 + 72) / 44);
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (-256 > param0) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 < -4) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    static {
        field_c = 2;
        field_b = new sm();
        field_a = false;
    }
}
