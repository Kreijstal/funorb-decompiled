/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static String field_a;
    String field_o;
    static String field_k;
    int field_e;
    int[] field_b;
    static String field_n;
    static int[][] field_c;
    int field_h;
    private long field_f;
    int field_j;
    static boolean field_l;
    private String field_i;
    static oa field_g;
    private int field_d;
    private boolean field_m;

    final static hj a(int param0, int param1, hj[] param2, int param3) {
        hj dupTemp$0 = null;
        int var15 = 0;
        hj stackIn_19_0 = null;
        hj stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hj var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        hj var23 = null;
        hj var24 = null;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var19Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          var4_int = param2[0].field_o;
          var5 = param2[2].field_o;
          var6 = param2[0].field_v;
          var7 = param2[6].field_v;
          var8 = 16;
          var9 = 16;
          if (0 != param1 % var8) {
            param1 = param1 + (var8 - param1 % var8);
          }
          if (param3 % var9 != 0) {
            param3 = param3 + (var9 - param3 % var9);
          }
          var11 = param1 + (var4_int + var5);
          if (param0 != -8096) {
            ij.b(70);
          }
          var12 = param3 + (var7 + var6);
          for (var13 = 0; var13 < 4; var13++) {
            var23 = lb.field_t[var13];
            if (var23 != null &&
              var23.field_s == var11 &&
              var12 == var23.field_y) {
              for (var14 = var13; var14 > 0; var14--) {
                lb.field_t[var14] = lb.field_t[var14 - 1];
              }
              lb.field_t[0] = var23;
              stackIn_19_0 = var23;
              return stackIn_19_0;
            }
          }
          for (var13Lifetime1 = 3; var13Lifetime1 > 0; var13Lifetime1--) {
            lb.field_t[var13Lifetime1] = lb.field_t[-1 + var13Lifetime1];
          }
          dupTemp$0 = new hj(param1 + (var4_int + var5), var6 + (var7 + param3));
          lb.field_t[0] = dupTemp$0;
          var24 = dupTemp$0;
          var10 = var24;
          vb.a(-98, var24);
          tc.a(10, 10, var4_int + param1 - (-var5 + 10), -10 + (var7 + var6 + param3));
          for (var13Lifetime2 = 0; var4_int + (param1 + var5) > var13Lifetime2; var13Lifetime2 = var13Lifetime2 + param2[4].field_s) {
            for (var14Lifetime1 = 0; var7 + (var6 + param3) > var14Lifetime1; var14Lifetime1 = var14Lifetime1 + param2[4].field_y) {
              param2[4].a(var13Lifetime2, var14Lifetime1);
            }
          }
          tc.d();
          hi.a(param2, var7 + var6 + param3, true, var5 + (var4_int + param1), 0, 0);
          var13Lifetime3 = (param1 * param1 + param3 * param3) / 4;
          for (var14Lifetime2 = -4; param1 + 4 > var14Lifetime2; var14Lifetime2++) {
            for (var15 = -4; 4 + param3 > var15; var15++) {
              var16 = (int)Math.sqrt((double)((var14Lifetime2 - param1 / 2) * (var14Lifetime2 - param1 / 2) + (-(param3 / 2) + var15) * (-(param3 / 2) + var15)));
              var17 = 128 + 64 * var16 / (int)Math.sqrt((double)var13Lifetime3);
              if (var17 > 256) {
                var17 = 256;
              }
              var18 = var14Lifetime2 + (var4_int + tc.field_j * (var6 + var15));
              var19 = tc.field_b[var18];
              var20 = var19 & 16711935;
              var20 = var20 * var17;
              var21 = 65280 & var19;
              var21 = var21 * var17;
              var20 = var20 & -16711936;
              var21 = var21 & 16711680;
              var19Lifetime1 = (var20 | var21) >> 8;
              tc.field_b[var18] = var19Lifetime1;
            }
          }
          ug.b(-1);
          stackIn_40_0 = var10;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("ij.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (null == cc.field_w) {
          return;
        }
        om.a(-46342, cc.field_w);
        cc.field_w.a(wi.field_b, 50);
        cc.field_w = null;
        if (param0 != 4) {
          ij.c(-47);
        }
        if (hh.field_c != null) {
          hh.field_c.b(125);
        }
        kd.field_b.requestFocus();
    }

    final static nd a(String param0, int param1, int param2) {
        nd var3 = null;
        RuntimeException var3_ref = null;
        nd stackIn_2_0 = null;
        nd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new nd(false);
          var3.field_d = param0;
          if (param1 != 256) {
            stackIn_2_0 = (nd) null;
            return stackIn_2_0;
          }
          var3.field_b = param2;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ij.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (!this.field_m && (2 != this.field_h ||
          0 >= this.field_d)) {
          if (param0 > -36) {
            return 80;
          }
          if (this.field_f == ra.field_bb) {
            return 1;
          }
          if (eg.field_b != 2) {
            return 0;
          }
          if (cg.a(2113942113, this.field_i)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static void a(boolean param0, int param1) {
        if (7 != mi.field_d) {
          throw new RuntimeException();
        }
        int var2 = pf.a((byte) 65, kn.b((byte) -49).field_p);
        if (var2 == 2) {
          wm.a(param0, false, 12);
        }
        if (var2 != 0) {
          return;
        }
        qd.a(20830, 3 + cf.field_w);
        nm.field_b = kn.b((byte) -49);
        if (pd.a(nm.field_b, true)) {
          bl.field_r = new sg(nm.field_b, 0, false, false, t.field_l, -1);
        } else {
          ca.field_r = 0;
          on.field_r = t.field_l;
          fl.field_j = false;
          qn.field_k = false;
          bl.field_r = null;
          sk.field_i = -1;
        }
        kk.field_j = true;
        wm.a(param0, false, 10);
        ((ti) (l.field_a[10])).field_p = 480;
        if (param1 >= -72) {
          field_k = (String) null;
        }
    }

    public static void b(int param0) {
        int var1 = -26 / ((param0 - 53) / 48);
        field_k = null;
        field_c = (int[][]) null;
        field_a = null;
        field_g = null;
        field_n = null;
    }

    ij(boolean param0) {
        this.field_j = kf.field_H;
        this.field_f = fc.field_c;
        this.field_h = ch.field_m;
        this.field_i = kl.field_u;
        this.field_e = vn.field_f;
        this.field_o = fi.field_kb;
        this.field_d = pj.field_o;
        if (param0) {
          this.field_b = lm.field_d;
        } else {
          this.field_b = null;
        }
        this.field_m = jc.field_f;
    }

    static {
        field_n = "Two kills remaining.";
        field_c = new int[][]{new int[]{65}, new int[]{66}, new int[]{32}, new int[]{48}, new int[]{86, 81, 82, 80}};
        field_a = "pts";
    }
}
