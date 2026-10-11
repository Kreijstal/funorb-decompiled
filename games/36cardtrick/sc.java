/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static gj field_b;
    static byte field_a;
    static String field_c;

    final static void a(int param0, byte param1, boolean param2) {
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        String stackIn_49_2 = null;
        boolean stackIn_90_0 = false;
        boolean stackIn_91_1 = false;
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
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
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
        var10 = Main.field_T;
        try {
          gh.field_g = true;
          v.field_R = param0;
          if (v.field_R == 0) {
            var3_int = mh.a(false, rc.field_o, mb.field_a, tk.field_l, ij.field_a);
            var4 = 3 + var3_int;
            me.field_a = new String[var4];
            wd.field_d = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              wd.field_d[var5] = -1;
            }
            dd.field_j = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              me.field_a[var5] = ij.field_a[var5];
            }
            me.field_a[-3 + var4] = "";
            me.field_a[-2 + var4] = ck.field_I;
            wd.field_d[var4 - 2] = 0;
            dd.field_j[0] = 4;
            me.field_a[-1 + var4] = gh.field_i;
            wd.field_d[var4 - 1] = 1;
            dd.field_j[1] = 5;
          } else if (1 == v.field_R) {
            var3_int = mh.a(false, rc.field_o, mb.field_a, tk.field_l, ij.field_a);
            var4 = var3_int + 2;
            me.field_a = new String[var4];
            wd.field_d = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              wd.field_d[var5] = -1;
            }
            dd.field_j = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              me.field_a[var5] = ij.field_a[var5];
            }
            me.field_a[var4 - 2] = "";
            me.field_a[var4 - 1] = gh.field_i;
            wd.field_d[-1 + var4] = 0;
            dd.field_j[0] = 5;
          } else if (2 != v.field_R) {
            if (v.field_R == 3) {
              if (jk.field_a.field_b) {
                var3_int = mh.a(false, rc.field_o, mb.field_a, oj.field_b, ij.field_a);
              } else {
                var3_int = mh.a(false, rc.field_o, mb.field_a, ll.field_a, ij.field_a);
              }
              var4 = var3_int + 2;
              me.field_a = new String[var4];
              wd.field_d = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                wd.field_d[var5] = -1;
              }
              dd.field_j = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                me.field_a[var5] = ij.field_a[var5];
              }
              me.field_a[var4 - 2] = "";
              me.field_a[var4 - 1] = gh.field_i;
              wd.field_d[var4 - 1] = 0;
              dd.field_j[0] = 5;
            } else if (v.field_R == 4) {
              var3_int = mh.a(false, rc.field_o, mb.field_a, fe.field_d, ij.field_a);
              var4 = var3_int + 2;
              me.field_a = new String[var4];
              wd.field_d = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                wd.field_d[var5] = -1;
              }
              dd.field_j = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                me.field_a[var5] = ij.field_a[var5];
              }
              me.field_a[-2 + var4] = "";
              me.field_a[-1 + var4] = gh.field_i;
              wd.field_d[var4 - 1] = 0;
              dd.field_j[0] = 5;
            } else {
              if (v.field_R != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = mh.a(false, rc.field_o, mb.field_a, ij.field_b, ij.field_a);
              var4 = var3_int + 3;
              wd.field_d = new int[var4];
              me.field_a = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                wd.field_d[var5] = -1;
              }
              dd.field_j = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                me.field_a[var5] = ij.field_a[var5];
              }
              me.field_a[-3 + var4] = "";
              me.field_a[var4 - 2] = fh.field_D;
              wd.field_d[-2 + var4] = 0;
              dd.field_j[0] = 3;
              me.field_a[var4 - 1] = gh.field_i;
              wd.field_d[var4 - 1] = 1;
              dd.field_j[1] = 5;
            }
          } else {
            var3_int = mh.a(false, rc.field_o, mb.field_a, re.a(rf.field_g, new String[]{"<br><%0><br>"}, (byte) -50), ij.field_a);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ij.field_a[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ia.field_d = new String[var4];
            og.a(ij.field_a, 0, ia.field_d, 0, var4);
            da.field_c = new String[-1 + (var3_int - var4)];
            og.a(ij.field_a, 1 + var4, da.field_c, 0, -1 + (var3_int - var4));
            var3_int = mh.a(false, rc.field_o, mb.field_a, re.a(bf.field_b, new String[]{"<br><%0><br>"}, (byte) -50), ij.field_a);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ij.field_a[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            tf.field_p = new String[var4];
            og.a(ij.field_a, 0, tf.field_p, 0, var4);
            gl.field_G = new String[var3_int + (-var4 - 1)];
            og.a(ij.field_a, var4 + 1, gl.field_G, 0, -var4 + (var3_int - 1));
            if (ia.field_d.length >= tf.field_p.length) {
              stackIn_31_0 = ia.field_d.length;
            } else {
              stackIn_31_0 = tf.field_p.length;
            }
            var5 = stackIn_31_0;
            if (da.field_c.length < gl.field_G.length) {
              stackIn_34_0 = gl.field_G.length;
            } else {
              stackIn_34_0 = da.field_c.length;
            }
            var6 = stackIn_34_0;
            var7 = var6 + var5 + 7;
            wd.field_d = new int[var7];
            me.field_a = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              wd.field_d[var8] = -1;
            }
            wd.field_d[1] = 0;
            me.field_a[1] = qd.field_b;
            dd.field_j = new int[2];
            me.field_a[0] = oa.field_c;
            me.field_a[3] = gf.field_a;
            wd.field_d[3] = 1;
            dd.field_j[1] = 2;
            me.field_a[4] = ll.field_b;
            dd.field_j[0] = 5;
            me.field_a[2] = ai.field_l;
            me.field_a[5] = "";
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_41_0 = me.field_a;
              stackIn_41_1 = 6 + var8Lifetime2;
              if (-var5 + var8Lifetime2 + tf.field_p.length < 0) {
                stackIn_42_2 = "";
              } else {
                stackIn_42_2 = tf.field_p[tf.field_p.length + var8Lifetime2 - var5];
              }
              stackIn_41_0[stackIn_41_1] = stackIn_42_2;
            }
            me.field_a[6 + var5] = null;
            wd.field_d[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_46_0 = me.field_a;
              stackIn_46_1 = var8Lifetime3 + 7 + var5;
              stackIn_46_2 = gl.field_G.length;
              stackIn_46_3 = var8Lifetime3;
              if (stackIn_46_2 <= stackIn_46_3) {
                stackIn_49_2 = "";
              } else {
                stackIn_49_2 = gl.field_G[var8Lifetime3];
              }
              stackIn_46_0[stackIn_46_1] = stackIn_49_2;
            }
            jl.field_c = id.a(79);
          }
          cg.field_e.field_i = dd.field_j.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; me.field_a.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_90_0 = false;
            stackIn_91_1 = !(wd.field_d[var4Lifetime1] < 0);
            var5Lifetime1 = hj.a(stackIn_90_0, stackIn_91_1, me.field_a[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (v.field_R == 2) {
            var11 = ia.field_d;
            var4_ref_String__ = var11;
            for (var5Lifetime2 = 0; var5Lifetime2 < var11.length; var5Lifetime2++) {
              var12 = var11[var5Lifetime2];
              var7Lifetime1 = hj.a(false, false, var12);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = da.field_c;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var13 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = hj.a(false, false, var13);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          cc.field_d = dl.field_g + var3_intLifetime1 - (var3_intLifetime1 >> 1);
          cc.field_e = cg.field_e.field_i * (e.field_i + a.field_o << 1);
          cb.field_i = dl.field_g - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; me.field_a.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_115_0 = cc.field_e;
            if (0 > wd.field_d[var4Lifetime2]) {
              stackIn_116_1 = sa.field_d;
            } else {
              stackIn_116_1 = tl.field_b;
            }
            cc.field_e = stackIn_115_0 + stackIn_116_1;
          }
          qe.field_E = s.field_c - (cc.field_e >> 1);
          ud.field_a = new int[me.field_a.length][];
          var4Lifetime3 = 0;
          var6Lifetime1 = 90 / ((61 - param1) / 54);
          var5Lifetime3 = qe.field_E;
          while (var4Lifetime3 < me.field_a.length) {
            var7Lifetime2 = wd.field_d[var4Lifetime3];
            if (var7Lifetime2 >= 0) {
              var8Lifetime1 = hj.a(false, true, me.field_a[var4Lifetime3]);
              var5Lifetime3 = var5Lifetime3 + e.field_i;
              var9 = dl.field_g - (var8Lifetime1 >> 1);
              ud.field_a[var4Lifetime3] = new int[4];
              ud.field_a[var4Lifetime3][0] = var9 - tc.field_b;
              ud.field_a[var4Lifetime3][1] = var5Lifetime3;
              ud.field_a[var4Lifetime3][2] = var8Lifetime1 + (tc.field_b << 1);
              var5Lifetime3 = var5Lifetime3 + ((a.field_o << 1) + e.field_i + tl.field_b);
              ud.field_a[var4Lifetime3][3] = (a.field_o << 1) + tl.field_b;
            } else {
              var5Lifetime3 = var5Lifetime3 + sa.field_d;
            }
            var4Lifetime3++;
          }
          if (2 != v.field_R) {
            cg.field_e.a(-91, af.a(ij.field_e, true, eg.field_b), 0, param2);
          } else {
            cg.field_e.a(-88, -1, -1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "sc.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 178313985) {
          field_c = (String) null;
        }
        field_b = null;
    }

    final static void a(byte param0, uf param1) {
        try {
          rk.a(true, param1, false);
          int var2_int = 57 % ((param0 + 15) / 39);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "sc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 != 20) {
          field_c = (String) null;
        }
        if (h.field_F != 0 - vb.field_b &&
          h.field_F != -vb.field_b + 250) {
        }
        h.field_F = h.field_F + 1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = "Unpacking sound effects";
    }
}
