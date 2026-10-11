/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends al {
    static ph field_k;
    static rb field_l;
    static long field_n;
    static int field_p;
    static rd field_o;
    static int field_m;
    static String field_j;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param0, (byte) 54) == a.field_e) {
            stackIn_3_0 = ke.field_l;
            return stackIn_3_0;
          }
          if (param1 != -114) {
            nj.a(false, -29, 82);
          }
          stackIn_7_0 = ha.field_g;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("nj.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final vf b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        vf stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        vf stackIn_8_0 = null;
        vf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 54) {
            stackIn_2_0 = (vf) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = (null != hc.a(param0, 4011)) ? 0 : 1;
          var3_int = stackIn_6_0;
          if (var3_int != 0) {
            stackIn_10_0 = mc.field_a;
            return stackIn_10_0;
          }
          stackIn_8_0 = a.field_e;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("nj.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 22382) {
          nj.d(83);
        }
        field_o = null;
        field_j = null;
    }

    nj(ba param0) {
        super(param0);
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        String stackIn_75_2 = null;
        boolean stackIn_91_0 = false;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = Bounce.field_N;
        try {
          ea.field_f = true;
          ne.field_u = param2;
          if (ne.field_u == 0) {
            var3_int = r.a(ba.field_E, ga.field_g, vg.field_g, 1, gk.field_a);
            var4 = 3 + var3_int;
            se.field_E = new String[var4];
            m.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              m.field_a[var5] = -1;
            }
            ii.field_n = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              se.field_E[var5] = ga.field_g[var5];
            }
            se.field_E[var4 - 3] = "";
            se.field_E[-2 + var4] = tb.field_o;
            m.field_a[var4 - 2] = 0;
            ii.field_n[0] = 4;
            se.field_E[-1 + var4] = uk.field_b;
            m.field_a[var4 - 1] = 1;
            ii.field_n[1] = 5;
          } else if (1 == ne.field_u) {
            var3_int = r.a(ba.field_E, ga.field_g, vg.field_g, 1, gk.field_a);
            var4 = var3_int + 2;
            se.field_E = new String[var4];
            m.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              m.field_a[var5] = -1;
            }
            ii.field_n = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              se.field_E[var5] = ga.field_g[var5];
            }
            se.field_E[var4 - 2] = "";
            se.field_E[-1 + var4] = uk.field_b;
            m.field_a[var4 - 1] = 0;
            ii.field_n[0] = 5;
          } else if (2 != ne.field_u) {
            if (ne.field_u == 3) {
              if (ck.field_e.field_l) {
                var3_int = r.a(ba.field_E, ga.field_g, vg.field_f, param1 + 25699, gk.field_a);
              } else {
                var3_int = r.a(ba.field_E, ga.field_g, ra.field_f, param1 + 25699, gk.field_a);
              }
              var4 = 2 + var3_int;
              se.field_E = new String[var4];
              m.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                m.field_a[var5] = -1;
              }
              ii.field_n = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                se.field_E[var5] = ga.field_g[var5];
              }
              se.field_E[-2 + var4] = "";
              se.field_E[-1 + var4] = uk.field_b;
              m.field_a[var4 - 1] = 0;
              ii.field_n[0] = 5;
            } else if (ne.field_u == 4) {
              var3_int = r.a(ba.field_E, ga.field_g, of.field_a, 1, gk.field_a);
              var4 = var3_int + 2;
              m.field_a = new int[var4];
              se.field_E = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                m.field_a[var5] = -1;
              }
              ii.field_n = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                se.field_E[var5] = ga.field_g[var5];
              }
              se.field_E[var4 - 2] = "";
              se.field_E[var4 - 1] = uk.field_b;
              m.field_a[-1 + var4] = 0;
              ii.field_n[0] = 5;
            } else {
              if (5 != ne.field_u) {
                throw new IllegalArgumentException();
              }
              var3_int = r.a(ba.field_E, ga.field_g, pe.field_g, param1 + 25699, gk.field_a);
              var4 = 3 + var3_int;
              se.field_E = new String[var4];
              m.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                m.field_a[var5] = -1;
              }
              ii.field_n = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                se.field_E[var5] = ga.field_g[var5];
              }
              se.field_E[-3 + var4] = "";
              se.field_E[var4 - 2] = wa.field_f;
              m.field_a[-2 + var4] = 0;
              ii.field_n[0] = 3;
              se.field_E[-1 + var4] = uk.field_b;
              m.field_a[var4 - 1] = 1;
              ii.field_n[1] = 5;
            }
          } else {
            var3_int = r.a(ba.field_E, ga.field_g, jf.a(al.field_g, new String[]{"<br><%0><br>"}, (byte) -126), 1, gk.field_a);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ga.field_g[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            eb.field_E = new String[var4];
            cb.a(ga.field_g, 0, eb.field_E, 0, var4);
            ll.field_E = new String[var3_int - var4 - 1];
            cb.a(ga.field_g, var4 + 1, ll.field_E, 0, -var4 + (var3_int - 1));
            var4 = -1;
            var3_int = r.a(ba.field_E, ga.field_g, jf.a(se.field_B, new String[]{"<br><%0><br>"}, (byte) -126), param1 ^ -25697, gk.field_a);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ga.field_g[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            t.field_r = new String[var4];
            cb.a(ga.field_g, 0, t.field_r, 0, var4);
            vb.field_k = new String[-1 + (var3_int - var4)];
            cb.a(ga.field_g, var4 + 1, vb.field_k, 0, var3_int + (-var4 - 1));
            if (eb.field_E.length >= t.field_r.length) {
              stackIn_57_0 = eb.field_E.length;
            } else {
              stackIn_57_0 = t.field_r.length;
            }
            var5 = stackIn_57_0;
            if (vb.field_k.length > ll.field_E.length) {
              stackIn_60_0 = vb.field_k.length;
            } else {
              stackIn_60_0 = ll.field_E.length;
            }
            var6 = stackIn_60_0;
            var7 = var6 + (7 + var5);
            se.field_E = new String[var7];
            m.field_a = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              m.field_a[var8] = -1;
            }
            m.field_a[1] = 0;
            se.field_E[0] = mg.field_l;
            se.field_E[1] = eb.field_F;
            ii.field_n = new int[2];
            ii.field_n[0] = 5;
            ii.field_n[1] = 2;
            m.field_a[3] = 1;
            se.field_E[4] = ma.field_u;
            se.field_E[5] = "";
            se.field_E[3] = ab.field_g;
            se.field_E[2] = field_j;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_67_0 = se.field_E;
              stackIn_67_1 = 6 + var8Lifetime2;
              if (-var5 + t.field_r.length + var8Lifetime2 < 0) {
                stackIn_68_2 = "";
              } else {
                stackIn_68_2 = t.field_r[-var5 + var8Lifetime2 + t.field_r.length];
              }
              stackIn_67_0[stackIn_67_1] = stackIn_68_2;
            }
            se.field_E[6 + var5] = null;
            m.field_a[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_72_0 = se.field_E;
              stackIn_72_1 = var8Lifetime3 + (7 + var5);
              stackIn_72_2 = var8Lifetime3;
              stackIn_72_3 = vb.field_k.length;
              if (stackIn_72_2 >= stackIn_72_3) {
                stackIn_75_2 = "";
              } else {
                stackIn_75_2 = vb.field_k[var8Lifetime3];
              }
              stackIn_72_0[stackIn_72_1] = stackIn_75_2;
            }
            gd.field_a = fa.a(109);
          }
          cf.field_f.field_f = ii.field_n.length;
          if (param1 != -25698) {
            nj.d(-32);
          }
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < se.field_E.length; var4Lifetime1++) {
            stackIn_91_0 = !(m.field_a[var4Lifetime1] < 0);
            var5Lifetime1 = vh.a(stackIn_91_0, se.field_E[var4Lifetime1], true);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (ne.field_u == 2) {
            var10 = eb.field_E;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = vh.a(false, var11, true);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = ll.field_E;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = vh.a(false, var12, true);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ef.field_a = (hj.field_a + cl.field_m << 1) * cf.field_f.field_f;
          ui.field_p = var3_intLifetime1 + bi.field_h - (var3_intLifetime1 >> 1);
          bb.field_b = bi.field_h - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; var4Lifetime2 < se.field_E.length; var4Lifetime2++) {
            stackIn_115_0 = ef.field_a;
            if (m.field_a[var4Lifetime2] >= 0) {
              stackIn_116_1 = pb.field_j;
            } else {
              stackIn_116_1 = k.field_D;
            }
            ef.field_a = stackIn_115_0 + stackIn_116_1;
          }
          jl.field_a = uf.field_a - (ef.field_a >> 1);
          lf.field_r = new int[se.field_E.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = jl.field_a;
          while (se.field_E.length > var4Lifetime3) {
            var6Lifetime1 = m.field_a[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = vh.a(true, se.field_E[var4Lifetime3], true);
              var5Lifetime3 = var5Lifetime3 + hj.field_a;
              var8Lifetime1 = -(var7Lifetime2 >> 1) + bi.field_h;
              lf.field_r[var4Lifetime3] = new int[4];
              lf.field_r[var4Lifetime3][0] = -kk.field_z + var8Lifetime1;
              lf.field_r[var4Lifetime3][1] = var5Lifetime3;
              lf.field_r[var4Lifetime3][2] = (kk.field_z << 1) + var7Lifetime2;
              lf.field_r[var4Lifetime3][3] = pb.field_j + (cl.field_m << 1);
              var5Lifetime3 = var5Lifetime3 + (pb.field_j + (hj.field_a + (cl.field_m << 1)));
            } else {
              var5Lifetime3 = var5Lifetime3 + k.field_D;
            }
            var4Lifetime3++;
          }
          if (ne.field_u != 2) {
            cf.field_f.a(param0, -125, qe.a(uc.field_C, (byte) -101, ll.field_y), 0);
          } else {
            cf.field_f.a(param0, 99, -1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "nj.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = new ph("email");
        field_m = 64;
        field_o = new rd();
        field_j = "to keep fullscreen or";
    }
}
