/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd implements ui {
    static String field_d;
    static oa field_c;
    static int field_a;
    static long[] field_b;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ti var8 = null;
        int var9 = 0;
        try {
          var6_int = param0 + param4.field_p;
          var7 = param1 + param4.field_n;
          jl.a(var6_int, var7, 13612, param4.field_l, param4.field_h);
          var8 = ai.field_b[1];
          if (param4 instanceof lj &&
            ((lj) (param4)).field_y) {
            var8.c((param4.field_l - var8.field_r >> 1) + 1 + var6_int, 1 + (var7 + (param4.field_h - var8.field_s >> 1)), 256);
          }
          var9 = -113 / ((param3 - 51) / 47);
          if (param4.b((byte) -109)) {
            ri.a(param4.field_l - 4, var6_int + 2, var7 + 2, (byte) -86, param4.field_h - 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("kd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_55_0 = 0;
        String stackIn_55_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_58_4;
        int stackIn_59_5 = 0;
        int stackIn_103_0;
        int stackIn_103_1;
        int stackIn_103_2;
        int stackIn_103_3;
        int stackIn_103_4;
        boolean stackIn_104_5 = false;
        int stackIn_106_0;
        int stackIn_106_1;
        int stackIn_106_2;
        int stackIn_106_3;
        int stackIn_106_4;
        boolean stackIn_107_5;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        ti var4 = null;
        Object var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pi var15 = null;
        ti var16 = null;
        StringBuilder var17 = null;
        Object var8Lifetime1;
        Object var8Lifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          dh.field_B.f(0, param1);
          if (qk.field_e == null ||
            !(qk.field_e.length >= ej.field_p.length())) {
            qk.field_e = new int[ej.field_p.length()];
          }
          var2_int = dc.field_a % 750;
          for (var3 = 0; var3 < qk.field_e.length; var3++) {
            if (150 <= var2_int &&
              var2_int < 250) {
              qk.field_e[var3] = (int)(5.0 * Math.sin((double)(var2_int - 250) / 5.0));
            } else {
              qk.field_e[var3] = 0;
            }
            var2_int--;
            if (0 > var2_int) {
              var2_int += 750;
            }
          }
          var3Lifetime1 = hk.field_a.a(ej.field_p);
          hk.field_a.b(10325023, -1);
          hk.field_a.a(ej.field_p, 34 + (12 * wl.field_K.field_n - var3Lifetime1 >> 1), param1 + ((-hk.field_a.field_y + wl.field_K.field_m - hk.field_a.field_t >> 1) + 114 + hk.field_a.field_y), (int[]) null, qk.field_e);
          if (0 <= jl.field_j &&
            3 > jl.field_j) {
            var4_int = 10;
            var5_ref = null;
            if (jl.field_j == 0) {
              var5_ref = sh.field_a + qi.field_c.field_h;
            }
            if (jl.field_j == 1) {
              ob.a(1, 0, sg.field_p, dc.field_a);
              var4_int = var4_int + (tj.field_s.field_m - hk.field_a.field_y);
              var5_ref = ll.field_W;
            }
            if (jl.field_j == 2) {
              var5_ref = nl.field_g;
            }
            if (var5_ref != null) {
              var6 = 4 + (hk.field_a.field_t + hk.field_a.field_y);
              var7 = hk.field_a.b((String) (var5_ref), 160) * var6;
              dk.a(var4_int + 10 + var7, mk.field_B, -28018, 451, o.field_i + 237 + param1, 180);
              hk.field_a.a((String) (var5_ref), 461, o.field_i + 247 + param1, 160, var7, 0, -1, 1, 0, var6);
            }
          } else {
            if (qe.field_F != null) {
              var16 = qe.field_F[rd.field_c[gk.field_e]];
              var4 = var16;
              if (jl.field_j == 3) {
                var5 = o.field_i + 413;
                var6 = 30 - (o.field_i * 30 - 3420) * (o.field_i - 114) / 12996;
                var4.c(var5, var6 + (-var16.field_l + 480 - (var16.field_m - param1)));
              } else {
                var4.c(413, param1 + (-var16.field_l + 480) - var16.field_m);
              }
            }
          }
          var17 = new StringBuilder(4);
          var5Lifetime1 = wk.field_c / 50;
          if (param0 <= 84) {
            kd.a(1);
          }
          var6Lifetime1 = var5Lifetime1 / 60;
          var5Lifetime1 = var5Lifetime1 % 60;
          if (var6Lifetime1 <= 99) {
            discarded$0 = var17.append((char)(48 + var6Lifetime1 / 10));
            discarded$1 = var17.append((char)(var6Lifetime1 % 10 + 48));
            discarded$2 = var17.append(':');
            discarded$3 = var17.append((char)(var5Lifetime1 / 10 + 48));
            discarded$4 = var17.append((char)(var5Lifetime1 % 10 + 48));
          } else {
            discarded$5 = var17.append("****");
          }
          boolean decompiledFrameRemainder0 = true;
          wf.field_d.a(var17.toString(), 250, 333 + param1, 255, -1);
          var7Lifetime1 = ni.a((byte) -111);
          if (n.field_a != 10 && (!mg.field_d ||
            2 != n.field_a)) {
            if (var7Lifetime1 >= 0 &&
              re.field_A >= 6) {
              if (mg.field_d &&
                n.field_a == 0 &&
                var7Lifetime1 > 0) {
                var8_int = 128 + (int)(Math.sin(3.141592653589793 * (double)dc.field_a / 50.0) * 64.0);
                fg.a(param1 + 376, 264, (byte) 98, 164, 13, jk.field_x.a(true) - 10, pj.field_x, var8_int);
              }
              pa.a(param1 + 376, tj.field_z + var7Lifetime1, 39935, 16776867, 164, 16710412, 264, -10, 39935);
            } else {
              pa.a(param1 + 376, da.field_z, 39935, 8421504, 164, 8421504, 264, -10, 39935);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (2 <= re.field_A) {
              pa.a(376 + param1, pd.field_c, 39935, 16776867, 164, 16710412, 264, -10, 39935);
            } else {
              pa.a(376 + param1, pd.field_c, 39935, 8421504, 164, 8421504, 264, -10, 39935);
            }
          }
          stackIn_55_0 = param1 + 376;
          stackIn_55_1 = th.field_b;
          stackIn_55_2 = 16711680;
          if (re.field_A != 6) {
            stackIn_56_3 = 8421504;
          } else {
            stackIn_56_3 = 16776867;
          }
          stackIn_58_4 = 108;
          if (re.field_A != 6) {
            stackIn_59_5 = 8421504;
          } else {
            stackIn_59_5 = 16710412;
          }
          pa.a(stackIn_55_0, stackIn_55_1, stackIn_55_2, stackIn_56_3, stackIn_58_4, stackIn_59_5, 134, -10, 16711680);
          if (3 != re.field_A &&
            re.field_A != 4) {
            if (re.field_A == 0) {
              var8 = hf.field_f;
            } else {
              if (re.field_A < 6) {
                var8 = hd.field_c;
              } else {
                var8 = lb.field_g;
              }
            }
            od.field_g.a(false, dc.field_a, 3, (int[][]) (var8), param1);
            wk.field_a.a(false, dc.field_a, 3, (int[][]) (var8), param1);
            si.field_i.a(false, dc.field_a, 3, (int[][]) (var8), param1);
            od.field_g.a(true, dc.field_a, 3, (int[][]) (var8), param1);
            wk.field_a.a(true, dc.field_a, 3, (int[][]) (var8), param1);
            si.field_i.a(true, dc.field_a, 3, (int[][]) (var8), param1);
          } else {
            od.field_g.a(false, dc.field_a, 3, il.field_c, param1);
            si.field_i.a(false, dc.field_a, 3, wc.field_a, param1);
            od.field_g.a(true, dc.field_a, 3, il.field_c, param1);
            si.field_i.a(true, dc.field_a, 3, wc.field_a, param1);
          }
          if (0 == n.field_a) {
            var8Lifetime1 = null;
            if (re.field_A == 1) {
              var8Lifetime1 = tb.field_b[0];
            }
            if (2 == re.field_A) {
              var8Lifetime1 = tb.field_b[1];
            }
            if (re.field_A == 4) {
              var8Lifetime1 = tb.field_b[2];
            }
            if (var8Lifetime1 != null &&
              dc.field_a < 50) {
              var9 = ((ti) (var8Lifetime1)).field_n * (100 - 2 * dc.field_a) / 50;
              var10 = ((ti) (var8Lifetime1)).field_m * (-(2 * dc.field_a) + 100) / 50;
              ((ti) (var8Lifetime1)).b(-var9 + 640 >> 1, 480 - var10 >> 1, var9, var10);
            }
          }
          if (null != sg.field_d) {
            sg.field_d.a(dc.field_a, param1, 1, 0);
          }
          if (n.field_a > 0) {
            var8_intLifetime1 = eg.field_b % 58;
            for (var9Lifetime1 = 0; fg.field_i.length > var9Lifetime1; var9Lifetime1++) {
              var10Lifetime1 = -var9Lifetime1 + var8_intLifetime1 >> 3;
              var11 = (fg.field_i[var9Lifetime1] + 10 * (eg.field_b / 58)) % 187;
              var12 = var11 + 442;
              var13 = (n.field_a - 1) * 12 + vl.field_G[var9Lifetime1];
              if (var10Lifetime1 >= 0 &&
                var10Lifetime1 < 5) {
                hf.field_d[cc.field_f[var9Lifetime1] * 5 + var10Lifetime1].c(var12, var13 + param1);
              }
            }
          }
          for (var8_intLifetime2 = 0; n.field_a > var8_intLifetime2; var8_intLifetime2++) {
            hk.field_a.a(var8_intLifetime2 + 1 + ". ", 464, 53 + (12 * var8_intLifetime2 + param1), 16711680, -1);
            hk.field_a.b(vi.field_g[var8_intLifetime2].toString(), 464, param1 + (12 * var8_intLifetime2 + 53), 16711680, -1);
            hk.field_a.a(Integer.toString(vi.field_a[var8_intLifetime2]), 627, param1 + 12 * var8_intLifetime2 + 53, 16711680, -1);
          }
          hk.field_a.b(sg.field_k, 464, param1 + 173, 16711680, -1);
          hk.field_a.a(Integer.toString(ce.field_c), 627, 173 + param1, 16711680, -1);
          if (n.field_a == 10) {
            hk.field_a.b(ub.field_e, 464, 185 + param1, 16711680, -1);
            hk.field_a.a(Integer.toString(wk.field_d), 627, 185 + param1, 16711680, -1);
          }
          hk.field_a.b(ve.field_D, 464, 197 + param1, 16711680, -1);
          hk.field_a.a(Integer.toString(eh.field_a), 627, 197 + param1, 16711680, -1);
          if (ad.field_e) {
            dk.a(136, mk.field_B, -28018, 180, param1 + 88, 280);
            wf.field_d.a(he.field_g, 190, param1 + 93, 260, 80, 0, -1, 1, 0, wf.field_d.field_y + 3);
            stackIn_103_0 = 65280;
            stackIn_103_1 = 80;
            stackIn_103_2 = 16776867;
            stackIn_103_3 = 16710412;
            stackIn_103_4 = param1 + 183;
            stackIn_104_5 = (0 == a.field_S.field_d);
            jk.a(stackIn_103_0, stackIn_103_1, stackIn_103_2, stackIn_103_3, stackIn_103_4, stackIn_104_5, il.field_a, 224, 65280, (byte) -50);
            stackIn_106_0 = 16711680;
            stackIn_106_1 = 80;
            stackIn_106_2 = 16776867;
            stackIn_106_3 = 16710412;
            stackIn_106_4 = param1 + 183;
            stackIn_107_5 = (1 == a.field_S.field_d);
            jk.a(stackIn_106_0, stackIn_106_1, stackIn_106_2, stackIn_106_3, stackIn_106_4, stackIn_107_5, nh.field_h, 336, 16711680, (byte) 111);
          }
          if (ll.field_S) {
            wf.field_d.a("FPS: " + ub.field_a, 630, 30, 65535, -1);
            wf.field_d.a("LPS: " + oc.field_y, 630, 60, 65535, -1);
          }
          var15 = (pi) (oj.field_u.a((byte) -95));
          var8Lifetime2 = var15;
          if (var8Lifetime2 != null) {
            var10Lifetime2 = da.field_C;
            if (var10Lifetime2 < 80) {
              var9Lifetime2 = -32 + var10Lifetime2 / 2;
            } else {
              if (var10Lifetime2 >= 230) {
                var9Lifetime2 = -(var10Lifetime2 / 2) + 123;
              } else {
                var9Lifetime2 = 8;
              }
            }
            jk.field_x.a(16776867, var9Lifetime2 - 5, 3, 56 + wf.field_d.a(qj.field_a[var15.field_i]), 0, 16776867);
            fc.field_h[var15.field_i].e(8, var9Lifetime2);
            wf.field_d.b(qj.field_a[var15.field_i], 48, var9Lifetime2 + wf.field_d.field_y, 0, -1);
          }
          var9Lifetime3 = sb.field_h[(2147483647 & nc.field_t) % sb.field_h.length];
          vh.field_n = vh.field_n - var9Lifetime3;
          hf.field_j = hf.field_j - var9Lifetime3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "kd.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 > -58) {
          kd.a(20);
        }
    }

    static {
        field_d = "Names cannot start or end with space or underscore";
        field_b = new long[32];
    }
}
