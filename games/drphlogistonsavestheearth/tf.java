/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends ca {
    private boolean field_hb;
    private String field_lb;
    static bb field_qb;
    static String[] field_nb;
    private hd field_fb;
    static String field_kb;
    private String field_ob;
    private boolean field_gb;
    static volatile int field_mb;
    static String field_pb;
    static int field_jb;
    static String field_ib;

    final static int a(CharSequence param0, char param1, int param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 != 16752) {
            field_nb = (String[]) null;
          }
          var3_int = 0;
          var4 = param0.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param1 == param0.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("tf.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void n(int param0) {
        int var3 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        int stackIn_30_0 = 0;
        String stackIn_35_0 = null;
        String stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        gk stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        gk var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var1_int = jd.field_N;
          var2 = 0;
          if (re.field_g == 2) {
            var3_long = -aa.field_d + la.a(false);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          if (param0 != 17077) {
            field_mb = 118;
          }
          for (var3 = 0; sg.field_f.length > var3; var3++) {
            var4 = lg.field_a[var3];
            if (0 > var4) {
              var5 = b.field_h;
            } else {
              if (wg.field_k.field_f == var4) {
                var5 = a.field_i;
              } else {
                var5 = pj.field_E;
              }
            }
            var6 = sg.field_f[var3];
            if (re.field_g == 2 &&
              var2 == 1) {
              if (lk.field_i.length < ng.field_d.length) {
                stackIn_20_0 = ng.field_d.length;
              } else {
                stackIn_20_0 = lk.field_i.length;
              }
              var7 = stackIn_20_0;
              if (var3 >= 6 &&
                6 + var7 > var3) {
                if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                  stackIn_26_0 = lk.field_i[-var7 + (-6 + var3) + lk.field_i.length];
                } else {
                  stackIn_26_0 = "";
                }
                var6 = stackIn_26_0;
              }
              if (ga.field_i.length <= wg.field_h.length) {
                stackIn_30_0 = wg.field_h.length;
              } else {
                stackIn_30_0 = ga.field_i.length;
              }
              var8 = stackIn_30_0;
              if (7 + var7 <= var3 &&
                var8 + 7 + var7 > var3) {
                if (wg.field_h.length <= -7 + (var3 - var7)) {
                  stackIn_35_0 = "";
                } else {
                  stackIn_35_0 = wg.field_h[-7 + var3 - var7];
                }
                var6 = stackIn_35_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            stackIn_41_0 = var6;
            stackIn_42_1 = !(var4 < 0);
            var7Lifetime1 = u.a(stackIn_41_0, stackIn_42_1, true);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + ji.field_f;
            if (var4 >= 0) {
              if (wg.field_k.field_f != var4) {
                stackIn_47_0 = wd.field_c;
              } else {
                stackIn_47_0 = ue.field_a;
              }
              var9 = stackIn_47_0;
              var1_int = var1_int + ig.field_h;
              if (var9 != null) {
                var9.a(ni.field_p + (wa.field_N << 1), var8Lifetime1 - dg.field_d, var7Lifetime1 + (dg.field_d << 1), var1_int, 7453);
              }
              var1_int = var1_int + wa.field_N;
            }
            if (var4 >= 0) {
              cj.field_a.c(var6, var8Lifetime1, var1_int + hi.field_g, var5, -1);
              var1_int = var1_int + (wa.field_N + ig.field_h + ni.field_p);
            } else {
              uj.field_i.c(var6, var8Lifetime1, ha.field_a + var1_int, var5, -1);
              var1_int = var1_int + s.field_g;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "tf.C(" + param0 + ')');
        }
    }

    tf(k param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_ob = param1;
          if (null != this.field_ob) {
            var3_int = wi.field_e.a(this.field_ob, 260, wi.field_e.field_x);
            this.b(300, 1688990433, var3_int + 150);
          }
          this.field_fb = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_gb = false;
          this.field_hb = false;
          this.field_fb.field_E = true;
          this.b(this.field_fb, (byte) 61);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(byte param0) {
        this.field_hb = true;
        if (param0 == 23) {
          this.field_fb.field_E = false;
          return;
        }
        field_nb = (String[]) null;
        this.field_fb.field_E = false;
    }

    final static void a(gi param0, int param1, gi param2) {
        try {
          if (null != param0.field_b) {
            param0.a(param1 ^ -32364);
          }
          if (param1 != 16709) {
            gi var4 = (gi) null;
            tf.a((gi) null, 103, (gi) null);
          }
          param0.field_b = param2.field_b;
          param0.field_e = param2;
          param0.field_b.field_e = param0;
          param0.field_e.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "tf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        super.c(param0, 59, param2);
        wi.field_e.b(this.field_lb, param2 + (this.field_w >> 1), 103 + param0, 16777215, -1);
        if (this.field_ob != null) {
          wj.g(20 + param2, 120 + (param0 - 7), 260, 8421504);
          wi.field_e.a(this.field_ob, param2 + 20, 8 + (param0 + 120), 260, 100, 16777215, -1, 1, 0, wi.field_e.field_x);
        }
        if (param1 >= 26) {
          return;
        }
        field_nb = (String[]) null;
    }

    final void a(String param0, boolean param1, int param2, float param3) {
        int stackIn_3_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          stackIn_3_0 = (this.field_gb) ? 0 : 1;
          if (stackIn_3_0 == (param1 ? 1 : 0)) {
            stackIn_7_1 = (param1);
            this.field_gb = stackIn_7_1;
            if (this.field_gb) {
              this.field_fb.a(false, 8405024, 4210752);
              this.field_fb.field_E = true;
            } else {
              this.field_fb.a(false, 2113632, 4210752);
              if (this.field_hb) {
                this.field_fb.field_E = false;
              }
            }
          }
          if (param2 != 6) {
            this.a((String) null, false, 76, -0.6110716462135315f);
          }
          this.field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
          this.field_lb = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("tf.H(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_ib = null;
        field_pb = null;
        field_kb = null;
        field_nb = null;
        if (param0) {
          field_jb = -111;
          field_qb = null;
          return;
        }
        field_qb = null;
    }

    static {
        field_nb = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_qb = new bb();
        field_mb = 0;
        field_ib = "Invalid password.";
    }
}
