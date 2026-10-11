/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static lj field_f;
    static String field_a;
    static String[] field_e;
    static boolean field_h;
    static String field_d;
    static cf field_c;
    static ka[] field_i;
    static java.applet.Applet field_g;
    static int field_b;

    final static int a(byte param0, qe param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 >= -76) {
            stackIn_3_0 = 24;
            return stackIn_3_0;
          }
          var4 = 0;
          if (!vg.a(param1.field_F, -1)) {
            return -1;
          }
          if (null != n.field_kb &&
            param1 != null &&
            n.field_kb[param1.field_o][param1.field_H] != null) {
            for (var3_int = 0; 8 > var3_int; var3_int++) {
              if (param2 == n.field_kb[param1.field_o][param1.field_H][var3_int]) {
                n.field_kb[param1.field_o][param1.field_H][var3_int] = -1;
              }
            }
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("aj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final static vi a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        vi var5 = null;
        vi stackIn_4_0 = null;
        vi stackIn_8_0 = null;
        vi stackIn_13_0 = null;
        vi stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            0 != param0.length()) {
            var2_int = param0.indexOf('@');
            if (-1 == var2_int) {
              stackIn_8_0 = dj.field_W;
              return stackIn_8_0;
            }
            if (!param1) {
              field_i = (ka[]) null;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = re.a(var3, (byte) 104);
            if (var5 == null) {
              stackIn_15_0 = pl.a(var4, 96);
              return stackIn_15_0;
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_4_0 = vh.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("aj.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ue var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pa var13 = null;
        int var14 = 0;
        pa var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          var13 = id.field_b;
          var15 = var13;
          var2 = var15.j(-87);
          var3 = (ue) (wl.field_b.c((byte) -63));
          while (var3 != null) {
            if (var2 != var3.field_k) {
              var3 = (ue) (wl.field_b.c(param0 - 5697));
              continue;
            }
            break;
          }
          if (var3 == null) {
            ob.b(param0 ^ -5466);
            return;
          }
          var4 = var15.j(-90);
          if (var4 != 0) {
            var5 = var3.field_m;
            mf.field_b[0] = mf.field_a;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              mf.field_b[var6_int] = var13.b(false);
            }
            hh.a(param0 ^ 5425, var5, var4);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              ob.a(-33, var15);
              if (var6_intLifetime1 == 0) {
                dd.a(ia.field_j, var6_intLifetime1, 27715, jf.field_sb, uc.field_U, ti.field_e);
              } else {
                dd.a(ia.field_j, var6_intLifetime1, param0 ^ 31088, jf.field_sb, uc.field_U, ti.field_e);
              }
            }
            hl.a((byte) -44, var5);
            var6 = new String[2][var5];
            var19 = new int[2][4 * var5];
            var8 = bb.field_c;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = hi.field_G[var9];
              var6[0][var10] = mf.field_b[var11];
              var19[0][4 * var10] = bg.field_Q[var11];
              var19[0][var10 * 4 + 1] = rk.field_p[var11];
              var19[0][var10 * 4 + 2] = ea.field_a[var11];
              var19[0][3 + var10 * 4] = cb.field_e[var11];
              if (jc.a(mf.field_b[var11], 26691) &&
                ea.field_a[var11] + (rk.field_p[var11] + cb.field_e[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = hi.field_G[var9Lifetime1 + var5];
              var6[1][var14] = mf.field_b[var11Lifetime1];
              var19[1][var14 * 4] = bg.field_Q[var11Lifetime1];
              var19[1][1 + 4 * var14] = rk.field_p[var11Lifetime1];
              var19[1][2 + var14 * 4] = ea.field_a[var11Lifetime1];
              var19[1][3 + 4 * var14] = cb.field_e[var11Lifetime1];
              if (jc.a(mf.field_b[var11Lifetime1], 26691) &&
                rk.field_p[var11Lifetime1] + (ea.field_a[var11Lifetime1] + cb.field_e[var11Lifetime1]) == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
          }
          if (param0 != 5427) {
            return;
          }
          var3.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "aj.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_i = null;
        field_f = null;
        field_g = null;
        field_e = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int var1_intLifetime1;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != 3) {
            field_g = (java.applet.Applet) null;
          }
          if (!d.p(-82)) {
            if (!li.field_N) {
              if (null == qa.field_g) {
                qa.field_g = be.a(4, 31315);
              }
              if (qa.field_g.field_i) {
                eh.field_l = eh.field_l & ~qa.field_g.field_m;
                jj.field_c = jj.field_c | qa.field_g.field_m;
                qa.field_g = null;
                li.field_N = true;
              }
            }
            if (eb.field_l != null &&
              eb.field_l.field_j) {
              if (gl.field_a &&
                null != eb.field_l.field_q &&
                null != hf.field_d) {
                vl.a(eb.field_l.field_q, 10);
                if (null != hf.field_d) {
                  jl.a((byte) 121);
                }
                if (!bh.field_p &&
                  !d.p(param0 ^ -99)) {
                  wj.field_b.a(new eh(hf.field_d), -55);
                }
                if (vh.field_d == null) {
                  gl.field_a = false;
                }
              } else if (gl.field_a &&
                null == eb.field_l.field_q &&
                hf.field_d != null) {
                jl.a((byte) 123);
                if (!bh.field_p &&
                  !d.p(-86)) {
                  wj.field_b.a(new eh(hf.field_d), -82);
                }
                if (vh.field_d == null) {
                  gl.field_a = false;
                }
              } else {
                hf.field_d = eb.field_l.field_q;
                if (gl.field_a) {
                  gl.field_a = false;
                }
                if (null != hf.field_d) {
                  jl.a((byte) 114);
                  if (vh.field_d == null) {
                    vf.b((byte) 109);
                  }
                }
              }
              eb.field_l = null;
            }
          }
          if (vh.field_d != null) {
            for (var1_int = 0; var1_int < 3; var1_int++) {
              if (vh.field_d[var1_int].field_i) {
                ii.field_f[var1_int] = vh.field_d[var1_int].field_n;
                vh.field_d[var1_int] = null;
              }
            }
            var1_intLifetime1 = 1;
            for (var2 = 0; var2 < 3; var2++) {
              if (vh.field_d[var2] != null) {
                var1_intLifetime1 = 0;
              }
            }
            if (var1_intLifetime1 != 0) {
              vh.field_d = null;
              if (eb.field_l == null &&
                !gl.field_a) {
                vf.b((byte) 115);
                return;
              }
              if (eb.field_l != null) {
                return;
              }
              gl.field_a = false;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "aj.E(" + param0 + ')');
        }
    }

    static {
        field_a = "To server list";
        field_h = false;
        field_e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_d = "Connection timed out. Please try using a different server.";
    }
}
