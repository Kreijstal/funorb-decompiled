/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr extends oj {
    int field_D;
    static String field_y;
    int field_E;
    static String field_G;
    static wk field_z;
    static byte[] field_F;
    private int field_B;
    static int[][] field_C;
    static int field_A;

    public static void g(int param0) {
        if (param0 > -88) {
          field_A = 25;
        }
        field_z = null;
        field_C = (int[][]) null;
        field_G = null;
        field_F = null;
        field_y = null;
    }

    final static void h(int param0) {
        al.field_f = new je(0L, (je) null);
        if (fh.field_c) {
          al.field_f.a(t.field_g, 84);
        }
        al.field_f.a(nf.field_Kb, 104);
        pj.field_E = new ea(sa.field_c, al.field_f);
        if (param0 != 14570) {
          return;
        }
        no.field_T = new je(0L, (je) null);
        no.field_T.a(pj.field_E.field_a, 127);
        no.field_T.a(cp.field_d, 39);
        ak.b(false);
    }

    final String a(byte param0, boolean param1) {
        int var3 = -17 % ((param0 - 53) / 51);
        if (param1) {
          System.out.println("Deploy event debug");
          System.out.println("Unit at " + this.field_E + "," + this.field_D);
        }
        String var4 = "EventDeploy: pos: (" + this.field_E + "," + this.field_D + "), mods: " + this.field_B;
        return var4;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -84) {
            field_y = (String) null;
          }
          stackIn_3_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("tr.A(");
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static of a(byte param0, long param1) {
        if (param0 != 121) {
          tr.h(23);
        }
        return (of) (oi.field_d.a((byte) -27, param1));
    }

    final void a(ha param0, int param1) {
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ne var4_ref_ne = null;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        try {
          if (param1 != -26661) {
            return;
          }
          var6 = param0.c(this.field_D, true, this.field_E);
          if (var6 != null &&
            !var6.c(false)) {
            if (var6.field_N == 7) {
              var6.e(param1 + 26577);
              var4_ref_ne = param0.field_Eb[this.field_E + this.field_D * param0.field_v];
              var4_ref_ne.field_h = 11;
              var4_ref_ne.field_j = 1;
              var4_ref_ne.field_b = true;
              var4_ref_ne.field_g = this.field_B;
              var4_ref_ne.field_a = var6.field_O;
            }
            if (var6.field_N == 34) {
              var6.field_W = true;
              var6.field_s = true;
              var6.field_Y = 20;
              var6.field_t = 20;
              var6.a((byte) 71);
              var6.z(10);
            }
            if (var6.field_N == 17) {
              var6.e(param1 ^ 26692);
              if ((1 & this.field_B) > 0) {
                stackIn_13_0 = -1 + var6.field_J;
              } else {
                stackIn_13_0 = var6.field_J;
              }
              var4 = stackIn_13_0;
              if ((2 & this.field_B) > 0) {
                stackIn_16_0 = var6.field_w - 1;
              } else {
                stackIn_16_0 = var6.field_w;
              }
              var5 = stackIn_16_0;
              param0.a(var5, var4, (byte) -13, var6.field_O);
            }
          }
          fl.a(param0, -115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("tr.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        dn stackIn_5_0;
        boolean stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        boolean stackIn_6_4 = false;
        je stackIn_21_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        at var4 = null;
        Object var5 = null;
        hl var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        tg var16 = null;
        tg var17 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 >= -67) {
            field_G = (String) null;
          }
          stackIn_5_0 = sc.field_g.field_Kb;
          stackIn_5_1 = param1;
          stackIn_5_2 = (2 + jn.field_d) * (3 * param2);
          stackIn_5_3 = jn.field_d + 2;
          stackIn_6_4 = (pq.field_b == sc.field_g.field_Kb);
          var3_int = ((dn) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_6_4, 0, 2) ? 1 : 0;
          var4 = sc.field_g.field_Nb.field_fb;
          if (th.field_a != 2 &&
            th.field_a != 1) {
            sc.field_g.field_Kb.field_Nb.field_X = ef.field_a;
            sc.field_g.field_xb = false;
            jm.a(sc.field_g.field_Nb, -71);
            return;
          }
          sc.field_g.field_Kb.field_Nb.field_X = null;
          sc.field_g.field_xb = true;
          var5 = null;
          var6 = (hl) (var4.e((byte) 110));
          while (var6 != null) {
            var7 = 0;
            if (var6.field_fb == null) {
              var6.field_Qb = new je(0L, ga.field_i);
              var6.a(var6.field_Qb, 114);
              var6.field_Jb = new je(0L, ga.field_i);
              var6.a(var6.field_Jb, 113);
              var6.i(-10027);
              var7 = 1;
            }
            var6.field_gb = sc.field_g.field_Nb.field_gb;
            var6.field_Qb.a(jn.field_d, -20500, var6.field_gb, 0, 0);
            var8 = 0;
            if (null != var6.field_Nb &&
              !var6.field_Nb.equals("")) {
              var6.field_Jb.field_cb = tl.field_e;
              var6.field_Jb.field_W = 16737894;
              var6.field_Jb.a(jn.field_d, -20500, tl.field_e.field_A + 3, 0, 0);
              var8 = 1;
            }
            var9 = 0;
            var10 = var6.field_gb;
            if (var8 != 0) {
              var9 = 3 + tl.field_e.field_A;
              var10 = var10 - var9;
            }
            stackIn_21_0 = var6.field_Qb;
            if (var10 <= 0) {
              stackIn_22_1 = var6.field_Mb;
            } else {
              stackIn_22_1 = ka.a(var6.field_Qb.field_Z, var6.field_Mb, var10);
            }
            stackIn_21_0.field_X = stackIn_22_1;
            stackIn_25_0 = (var6.field_Qb.field_X.equals(var6.field_Mb)) ? 0 : 1;
            var11 = stackIn_25_0;
            var6.field_Qb.a(jn.field_d, -20500, var10, 0, var9);
            if (var3_int == 0) {
              var6.field_nb = -var6.field_ob + jn.field_d;
            }
            if (var7 != 0) {
              sc.field_g.field_Nb.a(var6, true, 2, (je) (var5));
            }
            if (var6.field_Jb != null &&
              var6.field_Jb.field_eb) {
              ad.field_I = var6.field_Nb;
            } else {
              if (var6.field_Qb.field_eb &&
                var11 != 0) {
                ad.field_I = var6.field_Mb;
              }
            }
            if (0 != var6.field_yb) {
              ng.a(sc.field_g.field_Kb, var6, (int[]) null, var6.field_Mb, -1, -110, -1, var6.field_Pb, 0L);
              var16 = tn.field_Z;
              var13_ref_String = jm.field_u;
              var16.field_i.a(7, var13_ref_String, (byte) -100);
              var17 = tn.field_Z;
              var13 = iu.field_t;
              var14 = ur.field_z;
              var17.field_i.a(0, var14, 0, (byte) -118, var13);
            }
            var5 = var6;
            var6 = (hl) (var4.a((byte) 123));
          }
          if (0 != sc.field_g.field_Ib.field_yb) {
            tb.field_e = new oc(sc.field_g.field_Ib.field_V, sc.field_g.field_Ib.field_D, sc.field_g.field_Ib.field_gb, sc.field_g.field_Ib.field_ob, iw.field_o, kq.field_N, eq.field_h, eq.field_h);
            ut.field_fb = 2;
          }
          if (sc.field_g.field_Rb.field_yb == 0) {
            return;
          }
          tb.field_e = new oc(sc.field_g.field_Rb.field_V, sc.field_g.field_Rb.field_D, sc.field_g.field_Rb.field_gb, sc.field_g.field_Rb.field_ob, lw.field_kb, kq.field_N, eq.field_h, eq.field_h);
          ut.field_fb = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "tr.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    tr(int param0, int param1, int param2) {
        this.field_B = param2;
        this.field_E = param0;
        this.field_m = 18;
        this.field_D = param1;
    }

    static {
        field_G = "<%0> wants to join";
        field_y = "You win!";
        field_A = 0;
        field_C = new int[][]{null, null, null, null, null, null};
    }
}
