/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    private boolean field_i;
    private int field_j;
    static int field_c;
    static String field_h;
    private int field_l;
    private int field_b;
    private int field_a;
    private int field_k;
    static String[] field_d;
    private kp field_e;
    private boolean field_f;
    static String field_n;
    static int[] field_m;
    private String[] field_g;

    final void a(int param0) {
        int var6 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        kp stackIn_29_0 = null;
        String[] stackIn_29_1 = null;
        int stackIn_30_2 = 0;
        String stackIn_32_1 = null;
        String[] stackIn_32_2 = null;
        int stackIn_33_3 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        int var9;
        int var10;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        var10 = Kickabout.field_G;
        var2 = this.field_l;
        var3 = this.field_b;
        if (this.field_f) {
          on.a(-2 + var2, -2 + var3, this.field_a + 6, 6 + this.field_j, 4, 16777215, 48);
          iw.a(-47, k.field_j);
          on.b();
          un.field_d.a(pp.field_k.toUpperCase(), 0, 0, this.field_a, -32 + this.field_j >> 1, 16777215, -1, 1, 1, 0);
          un.field_d.a(du.field_g.toUpperCase(), 0, -32 + this.field_j >> 1, this.field_a, -32 + this.field_j >> 1, 16777215, -1, 1, 1, 0);
          ta.e(121);
          k.field_j.b(var2, var3, 96);
        }
        if (param0 < 63) {
          this.field_e = (kp) null;
        }
        pq.field_Q.b(var2, var3, al.a(false, (byte) 14));
        if (this.field_e.field_f == 4) {
          iw.a(-45, jg.field_K);
          on.b();
          ea.a(this.field_e.field_h, 0, false, jg.field_K.field_q, 0, -52);
          ta.e(119);
          jg.field_K.b((-50 + jt.field_yb >> 1) + var2, (-20 + om.field_Bb >> 1) + var3, 96);
        }
        if (this.field_e.field_f == 4) {
          pt.a(var2 + 1 + jt.field_yb, -22914, 1 + var2, om.field_Bb + var3 + 1, var3 + 1);
          var4 = 0;
          var5 = 0;
          for (var6 = 0; var6 < 2; var6++) {
            stackIn_12_0 = (var6 != 0) ? 0 : 1;
            var7 = stackIn_12_0;
            for (var8 = 0; 5 > var8; var8++) {
              stackIn_17_0 = (var7 == 0) ? 16716032 : 2271999;
              var9 = stackIn_17_0;
              var4Lifetime1 = this.field_e.field_e[var6][var8][0] >> 16;
              if (var8 == 0) {
                var9 = 16776960;
              }
              var5Lifetime1 = this.field_e.field_e[var6][var8][1] >> 16;
              on.d(var2 - (-1 - var4Lifetime1), var5Lifetime1 + var3 + 1, 3, var9);
              on.c(var4Lifetime1 + (var2 + 1), var5Lifetime1 + 1 + var3, 3, 65793);
            }
          }
          var4Lifetime2 = this.field_e.field_n >> 16;
          var5Lifetime2 = this.field_e.field_l >> 16;
          on.d(var2 + 1 + var4Lifetime2, var5Lifetime2 + var3 + 1, 3, 16777215);
          on.c(var4Lifetime2 + (var2 + 1), 1 + var3 + var5Lifetime2, 3, 65793);
          ta.e(119);
        } else {
          if (0 > this.field_e.field_f) {
            un.field_d.a(w.field_d, 2 + this.field_l, this.field_b, jt.field_yb, om.field_Bb, 16777215, -1, 1, 1, 0);
          } else {
            if (this.field_e.field_f < 4) {
              un.field_d.a(mc.field_i, this.field_l + 2, this.field_b, jt.field_yb, om.field_Bb, 16777215, -1, 1, 1, 0);
            } else {
              un.field_d.a(ci.field_e, 2 + this.field_l, this.field_b, jt.field_yb, om.field_Bb, 16777215, -1, 1, 1, 0);
            }
          }
        }
        stackIn_29_0 = this.field_e;
        stackIn_29_1 = this.field_g;
        stackIn_30_2 = (!this.field_e.field_d) ? 0 : 1;
        stackIn_32_1 = stackIn_29_1[stackIn_30_2];
        stackIn_32_2 = this.field_g;
        stackIn_33_3 = (this.field_e.field_d) ? 0 : 1;
        eo.a(stackIn_29_0, stackIn_32_1, stackIn_32_2[stackIn_33_3], this.field_l, this.field_b + 123, 80, 32);
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        String var4 = (String) null;
        kk.$cfr$intArgs$a$842e35442ba4(-101, param1, param0, (String) null);
        if (param2 > -35) {
          field_n = (String) null;
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_d = null;
        if (param0 != -104) {
          field_m = (int[]) null;
        }
        field_m = null;
        field_n = null;
    }

    final static boolean a(byte param0) {
        if (oe.field_p != null) {
          return true;
        }
        if (param0 != -94) {
          return false;
        }
        if (!bo.field_Cb.a("scenery", "bleachers", (byte) -10)) {
          return false;
        }
        oe.field_p = ng.a("bleachers", "scenery", 2, bo.field_Cb);
        return true;
    }

    final void a(kp param0, boolean param1, int param2) {
        int var5 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Kickabout.field_G;
        try {
          if (param2 >= -103) {
            field_d = (String[]) null;
          }
          this.field_e = param0;
          if (!param1) {
            this.field_f = false;
            this.field_i = false;
            return;
          }
          if (this.field_l <= el.field_A &&
            el.field_A <= this.field_a + this.field_l &&
            this.field_b <= n.field_m &&
            this.field_b + this.field_j >= n.field_m) {
            this.field_f = true;
          } else {
            this.field_f = false;
          }
          if (this.field_f &&
            wj.field_A == 1) {
            this.field_i = true;
          } else {
            this.field_i = false;
          }
          if (this.field_f) {
            qd.$cfr$intArgs$a$b6210757cdab(-67, ds.field_f);
          }
          if (this.field_i) {
            if (an.field_d) {
              return;
            }
            or.field_d.b(86, (byte) -69);
            or.field_d.a(121, this.field_k);
            an.field_d = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("bl.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    bl(kp param0, String[] param1, int param2, int param3, int param4) {
        try {
          this.field_e = param0;
          this.field_l = param2;
          this.field_a = jt.field_yb;
          this.field_g = param1;
          this.field_b = param3;
          this.field_j = 32 + om.field_Bb;
          this.field_k = param4;
          k.field_j = new ut(this.field_a, this.field_j - 32);
          jg.field_K = new ut(50, 20);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_d = new String[]{"POW: Power", "SPD: Speed", "TCK: Tackle", "EXP: Experience"};
        field_n = "Waiting for models";
        field_h = "Friends";
    }
}
