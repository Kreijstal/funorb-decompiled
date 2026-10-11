/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends jg {
    private long[] field_i;
    private long field_m;
    private long field_p;
    private long field_h;
    static String field_j;
    private int field_o;
    static String field_n;
    private int field_l;
    static String field_k;

    private final long c(byte param0) {
        int var9 = 0;
        int var10 = Confined.field_J ? 1 : 0;
        int var6 = -30 % ((-28 - param0) / 63);
        long var2 = System.nanoTime();
        long var4 = -this.field_h + var2;
        this.field_h = var2;
        if (var4 > -5000000000L &&
          5000000000L > var4) {
          this.field_i[this.field_o] = var4;
          this.field_o = (1 + this.field_o) % 10;
          if (this.field_l < 1) {
            this.field_l = this.field_l + 1;
          }
        }
        long var7 = 0L;
        for (var9 = 1; var9 <= this.field_l; var9++) {
          var7 = var7 + this.field_i[(10 + (this.field_o - var9)) % 10];
        }
        return var7 / (long)this.field_l;
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        var5 = Confined.field_J ? 1 : 0;
        if (param0 != -25) {
          return -74;
        }
        if (this.field_m < this.field_p) {
          this.field_h = this.field_h + (-this.field_m + this.field_p);
          this.field_m = this.field_m + (this.field_p - this.field_m);
          this.field_p = this.field_p + param1;
          return 1;
        }
        var4 = 0;
        do {
          this.field_p = this.field_p + param1;
          var4++;
        } while (var4 < 10 &&
          this.field_p < this.field_m);
        if (this.field_p < this.field_m) {
          this.field_p = this.field_m;
        }
        return var4;
    }

    final long a(int param0) {
        if (param0 != 10) {
          field_n = (String) null;
        }
        this.field_m = this.field_m + this.c((byte) 105);
        if (this.field_m < this.field_p) {
          return (this.field_p - this.field_m) / 1000000L;
        }
        return 0L;
    }

    public static void c(int param0) {
        field_j = null;
        field_n = null;
        int var1 = 23 % ((param0 - 49) / 55);
        field_k = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_75_2 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        boolean stackIn_89_2 = false;
        int stackIn_113_0 = 0;
        int stackIn_114_1 = 0;
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
        var9 = Confined.field_J ? 1 : 0;
        try {
          ea.field_a = param0;
          in.field_h = true;
          if (ea.field_a == 0) {
            var3_int = ri.a(cf.field_cb, 69, hd.field_c, rn.field_e, wg.field_a);
            var4 = 3 + var3_int;
            dl.field_c = new String[var4];
            la.field_T = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              la.field_T[var5] = -1;
            }
            uc.field_ab = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              dl.field_c[var5] = cf.field_cb[var5];
            }
            dl.field_c[var4 - 3] = "";
            dl.field_c[-2 + var4] = nl.field_e;
            la.field_T[var4 - 2] = 0;
            uc.field_ab[0] = 4;
            dl.field_c[var4 - 1] = s.field_J;
            la.field_T[var4 - 1] = 1;
            uc.field_ab[1] = 5;
          } else if (ea.field_a == 1) {
            var3_int = ri.a(cf.field_cb, 21, hd.field_c, rn.field_e, wg.field_a);
            var4 = var3_int + 2;
            la.field_T = new int[var4];
            dl.field_c = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              la.field_T[var5] = -1;
            }
            uc.field_ab = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              dl.field_c[var5] = cf.field_cb[var5];
            }
            dl.field_c[-2 + var4] = "";
            dl.field_c[var4 - 1] = s.field_J;
            la.field_T[-1 + var4] = 0;
            uc.field_ab[0] = 5;
          } else if (ea.field_a != 2) {
            if (3 == ea.field_a) {
              if (ki.field_d.field_p) {
                var3_int = ri.a(cf.field_cb, 106, cd.field_n, rn.field_e, wg.field_a);
              } else {
                var3_int = ri.a(cf.field_cb, -113, gh.field_d, rn.field_e, wg.field_a);
              }
              var4 = 2 + var3_int;
              la.field_T = new int[var4];
              dl.field_c = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                la.field_T[var5] = -1;
              }
              uc.field_ab = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                dl.field_c[var5] = cf.field_cb[var5];
              }
              dl.field_c[var4 - 2] = "";
              dl.field_c[var4 - 1] = s.field_J;
              la.field_T[var4 - 1] = 0;
              uc.field_ab[0] = 5;
            } else if (ea.field_a == 4) {
              var3_int = ri.a(cf.field_cb, 118, sf.field_s, rn.field_e, wg.field_a);
              var4 = 2 + var3_int;
              la.field_T = new int[var4];
              dl.field_c = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                la.field_T[var5] = -1;
              }
              uc.field_ab = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                dl.field_c[var5] = cf.field_cb[var5];
              }
              dl.field_c[-2 + var4] = "";
              dl.field_c[-1 + var4] = s.field_J;
              la.field_T[-1 + var4] = 0;
              uc.field_ab[0] = 5;
            } else {
              if (ea.field_a != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = ri.a(cf.field_cb, -120, ql.field_A, rn.field_e, wg.field_a);
              var4 = 3 + var3_int;
              la.field_T = new int[var4];
              dl.field_c = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                la.field_T[var5] = -1;
              }
              uc.field_ab = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                dl.field_c[var5] = cf.field_cb[var5];
              }
              dl.field_c[var4 - 3] = "";
              dl.field_c[-2 + var4] = tm.field_a;
              la.field_T[-2 + var4] = 0;
              uc.field_ab[0] = 3;
              dl.field_c[-1 + var4] = s.field_J;
              la.field_T[var4 - 1] = 1;
              uc.field_ab[1] = 5;
            }
          } else {
            var3_int = ri.a(cf.field_cb, 58, b.a(new String[]{"<br><%0><br>"}, ld.field_j, 1177), rn.field_e, wg.field_a);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(cf.field_cb[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            jc.field_d = new String[var4];
            lj.a(cf.field_cb, 0, jc.field_d, 0, var4);
            tf.field_d = new String[-var4 + var3_int - 1];
            lj.a(cf.field_cb, 1 + var4, tf.field_d, 0, -1 - var4 + var3_int);
            var3_int = ri.a(cf.field_cb, 112, b.a(new String[]{"<br><%0><br>"}, kj.field_d, 1177), rn.field_e, wg.field_a);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(cf.field_cb[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            fj.field_s = new String[var4];
            lj.a(cf.field_cb, 0, fj.field_s, 0, var4);
            tk.field_e = new String[-var4 + (var3_int - 1)];
            lj.a(cf.field_cb, var4 + 1, tk.field_e, 0, -var4 + var3_int - 1);
            if (fj.field_s.length > jc.field_d.length) {
              stackIn_58_0 = fj.field_s.length;
            } else {
              stackIn_58_0 = jc.field_d.length;
            }
            var5 = stackIn_58_0;
            if (tk.field_e.length > tf.field_d.length) {
              stackIn_61_0 = tk.field_e.length;
            } else {
              stackIn_61_0 = tf.field_d.length;
            }
            var6 = stackIn_61_0;
            var7 = var5 + 7 + var6;
            la.field_T = new int[var7];
            dl.field_c = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              la.field_T[var8] = -1;
            }
            dl.field_c[1] = in.field_d;
            uc.field_ab = new int[2];
            la.field_T[1] = 0;
            dl.field_c[0] = qa.field_d;
            la.field_T[3] = 1;
            uc.field_ab[1] = 2;
            dl.field_c[2] = hm.field_mb;
            dl.field_c[5] = "";
            dl.field_c[4] = em.field_c;
            dl.field_c[3] = sb.field_i;
            uc.field_ab[0] = 5;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_68_0 = dl.field_c;
              stackIn_68_1 = 6 + var8Lifetime2;
              if (var8Lifetime2 + (fj.field_s.length - var5) < 0) {
                stackIn_69_2 = "";
              } else {
                stackIn_69_2 = fj.field_s[-var5 + var8Lifetime2 + fj.field_s.length];
              }
              stackIn_68_0[stackIn_68_1] = stackIn_69_2;
            }
            dl.field_c[var5 + 6] = null;
            la.field_T[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_74_0 = dl.field_c;
              stackIn_74_1 = var8Lifetime3 + (var5 + 7);
              if (tk.field_e.length <= var8Lifetime3) {
                stackIn_75_2 = "";
              } else {
                stackIn_75_2 = tk.field_e[var8Lifetime3];
              }
              stackIn_74_0[stackIn_74_1] = stackIn_75_2;
            }
            ga.field_M = ri.a(-3);
          }
          ij.field_q.field_k = uc.field_ab.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; dl.field_c.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_88_0 = -3;
            stackIn_88_1 = dl.field_c[var4Lifetime1];
            stackIn_89_2 = !(0 > la.field_T[var4Lifetime1]);
            var5Lifetime1 = cl.a(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == ea.field_a) {
            var10 = jc.field_d;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = cl.a(-3, var11, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = tf.field_d;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = cl.a(-3, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          v.field_Eb = -(var3_intLifetime1 >> 1) + (var3_intLifetime1 + ef.field_vb);
          if (param2 >= -94) {
            return;
          }
          nh.field_b = ij.field_q.field_k * (n.field_d + kb.field_b << 1);
          ef.field_sb = -(var3_intLifetime1 >> 1) + ef.field_vb;
          for (var4Lifetime2 = 0; var4Lifetime2 < dl.field_c.length; var4Lifetime2++) {
            stackIn_113_0 = nh.field_b;
            if (la.field_T[var4Lifetime2] < 0) {
              stackIn_114_1 = wm.field_bb;
            } else {
              stackIn_114_1 = af.field_Z;
            }
            nh.field_b = stackIn_113_0 + stackIn_114_1;
          }
          uh.field_c = pe.field_q - (nh.field_b >> 1);
          tj.field_l = new int[dl.field_c.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = uh.field_c;
          while (var4Lifetime3 < dl.field_c.length) {
            var6Lifetime1 = la.field_T[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + wm.field_bb;
            } else {
              var7Lifetime2 = cl.a(-3, dl.field_c[var4Lifetime3], true);
              var5Lifetime3 = var5Lifetime3 + kb.field_b;
              var8Lifetime1 = ef.field_vb - (var7Lifetime2 >> 1);
              tj.field_l[var4Lifetime3] = new int[4];
              tj.field_l[var4Lifetime3][0] = var8Lifetime1 - jd.field_g;
              tj.field_l[var4Lifetime3][1] = var5Lifetime3;
              tj.field_l[var4Lifetime3][2] = (jd.field_g << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (af.field_Z + kb.field_b + (n.field_d << 1));
              tj.field_l[var4Lifetime3][3] = (n.field_d << 1) + af.field_Z;
            }
            var4Lifetime3++;
          }
          if (2 != ea.field_a) {
            ij.field_q.a(param1, 0, 0, ab.a(0, ld.field_l, jh.field_R));
          } else {
            ij.field_q.a(param1, 0, -1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "q.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    q() {
        this.field_i = new long[10];
        this.field_h = 0L;
        this.field_m = 0L;
        this.field_p = 0L;
        this.field_o = 0;
        this.field_l = 1;
        this.field_m = System.nanoTime();
        this.field_p = System.nanoTime();
    }

    final void a(byte param0) {
        this.field_h = 0L;
        if (this.field_p > this.field_m) {
          this.field_m = this.field_m + (-this.field_m + this.field_p);
        }
        if (param0 != 31) {
          this.a((byte) -34);
        }
    }

    static {
        field_n = "Extra life";
        field_k = "Or <col=FFFFFF>click on the game</col> for mouse control (see next page).";
    }
}
