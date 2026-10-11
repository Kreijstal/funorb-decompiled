/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu extends hd implements lv {
    private ot field_Cb;
    private String field_Hb;
    static em field_Eb;
    private String field_Gb;
    fn field_Bb;
    static int[] field_zb;
    private String field_yb;
    static String field_Ab;
    static String field_Fb;
    static int[] field_Db;

    final void h(byte param0) {
        if (this.field_gb) {
          je.a((byte) 100, this);
        }
        if (param0 != 30) {
          this.h((byte) 44);
        }
    }

    public final void a(int param0, int param1, int param2) {
        int var4 = this.b(0);
        int var5 = this.a(param1 ^ 24);
        int var6 = -(var4 >> 1) + param2;
        int var7 = -(var5 >> 1) + param0;
        on.a(var6, var7, var4, var5, 52479, 60);
        if (this.field_Bb.field_h != 0) {
          on.a(var6, var7, var4, 50, 16777215, 60);
        }
        on.e(var6, var7, var4, var5, 65793);
        q.field_d.c(this.field_yb, -10 + (var6 + var4), 22 + var7, 16777215, 65793);
        q.field_d.c(this.field_Hb, -10 + (var6 + var4), var7 + 36, 16777215, 65793);
        if (param1 != 23) {
          this.field_Hb = (String) null;
        }
        this.field_Cb.c(var6 + 8, 9 + var7);
        if (0 != this.field_Bb.field_h) {
          on.f(var6, var7 + 50, var4, 65793);
          q.field_d.a(this.field_Gb, 5 + var6, var7 + 50, var4 - 10, var5 - 50 - 2, 16777215, 65793, 0, 1, 12);
        }
    }

    final static vn a(boolean param0, int param1, boolean[][] param2, byte param3, boolean[][] param4, int param5, int param6) {
        vn[] array$0 = null;
        vn stackIn_7_0;
        vn stackIn_7_1;
        vn[] stackIn_7_2;
        vn[] stackIn_7_3;
        int stackIn_7_4;
        vn stackIn_8_0 = null;
        vn stackIn_8_1 = null;
        vn stackIn_8_5 = null;
        vn stackIn_12_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_45_0 = 0;
        vn stackIn_53_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8_int = 0;
        vn var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        vn var12 = null;
        int var13 = 0;
        int var14 = 0;
        short[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        vn var24 = null;
        int var25 = 0;
        vn var26 = null;
        short[] var30 = null;
        int var9Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        var23 = Kickabout.field_G;
        try {
          var24 = new vn(new vn[]{qd.field_j[param1]}, 1);
          var26 = var24;
          if (param0) {
            var8_int = wc.field_e[param1];
            for (var9 = 0; var9 < var26.field_H.length; var9++) {
              var24.field_H[var9] = var24.field_H[var9] * 3;
              var26.field_l[var9] = var8_int + (-var8_int + var24.field_l[var9]) * 3;
            }
          }
          array$0 = new vn[2];
          stackIn_7_0 = null;
          stackIn_7_1 = null;
          stackIn_7_2 = array$0;
          stackIn_7_3 = array$0;
          stackIn_7_4 = 1;
          if (param1 == 4) {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_5 = es.field_k;
          } else {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_5 = iw.field_m[param1];
          }
          stackIn_7_3[stackIn_7_4] = stackIn_8_5;
          var8 = new vn(stackIn_7_2, 2);
          var10 = -10 % ((param3 + 49) / 51);
          var9Lifetime1 = (short)param5;
          var11 = (short)param6;
          var12 = new vn(var8, true, false, true, true);
          if (param2 == null &&
            param4 == null) {
            stackIn_12_0 = var12;
            return stackIn_12_0;
          }
          var30 = var8.field_p;
          var16 = var12.field_p;
          if (param1 != 4) {
            var13 = -9284;
            for (var17 = 0; var30.length > var17; var17++) {
              if (var30[var17] == var13) {
                var16[var17] = (short)hk.field_K[param1][0];
              }
            }
          }
          if (param2 != null) {
            var17Lifetime1 = 0;
            for (var18 = 0; var18 < param2.length; var18++) {
              var19 = 20;
              for (var20 = 0; var20 < param2[0].length; var20++) {
                var21 = var20;
                stackIn_29_0 = (param2[-var18 + 12][var21]) ? var11 : var9Lifetime1;
                var14 = stackIn_29_0;
                var13Lifetime1 = ks.a(var19, var17Lifetime1, -67, 7);
                var19 += 5;
                for (var22 = 0; var30.length > var22; var22++) {
                  if (~var30[var22] == ~var13Lifetime1) {
                    var16[var22] = (short)var14;
                  }
                }
              }
              var17Lifetime1 += 3;
            }
          }
          if (param4 != null) {
            var17Lifetime2 = 0;
            for (var18Lifetime1 = 0; param4.length > var18Lifetime1; var18Lifetime1++) {
              var19Lifetime1 = 20;
              for (var20Lifetime1 = 0; var20Lifetime1 < param4[0].length; var20Lifetime1++) {
                var21Lifetime1 = 9 - var20Lifetime1;
                stackIn_45_0 = (param4[12 - var18Lifetime1][var21Lifetime1]) ? var11 : var9Lifetime1;
                var14Lifetime1 = stackIn_45_0;
                var13Lifetime2 = ks.a(var19Lifetime1, var17Lifetime2, -45, 6);
                var19Lifetime1 += 5;
                var25 = 0;
                var22Lifetime1 = var25;
                while (var30.length > var25) {
                  if (~var30[var25] == ~var13Lifetime2) {
                    var16[var25] = (short)var14Lifetime1;
                  }
                  var25++;
                }
              }
              var17Lifetime2 += 3;
            }
          }
          stackIn_53_0 = var12;
          return stackIn_53_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_56_0 = var7;
          stackIn_56_1 = new StringBuilder().append("pu.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_59_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final int b(int param0) {
        if (param0 != 0) {
          return -18;
        }
        return 150;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        gl.field_a.field_n = 0;
        gl.field_a.a(122, 12);
        gl.field_a.b(-43, ac.field_d.nextInt());
        gl.field_a.b(-111, ac.field_d.nextInt());
        gl.field_a.a(102, param3);
        gl.field_a.a(112, param2);
        gl.field_a.g(-1207444472, param1);
        gl.field_a.a(bb.field_Nb, hn.field_h, 38);
        or.field_d.b(18, (byte) -83);
        int fieldTemp$0 = or.field_d.field_n + 1;
        or.field_d.field_n = or.field_d.field_n + 1;
        int var4 = fieldTemp$0;
        or.field_d.a(0, gl.field_a.field_n, 1991220144, gl.field_a.field_f);
        or.field_d.c(62, -var4 + or.field_d.field_n);
        int var5 = 83 % ((40 - param0) / 43);
    }

    public final int a(int param0) {
        int var2 = 50;
        if (param0 != 15) {
          return -84;
        }
        if (this.field_Bb.field_h != 0) {
          var2 = var2 + (20 + q.field_d.c(us.field_h[this.field_Bb.field_h], this.b(param0 ^ 15) - 10, 12));
        }
        return var2;
    }

    public static void i(byte param0) {
        field_Ab = null;
        field_Fb = null;
        field_Db = null;
        int var1 = -80 / ((-13 - param0) / 32);
        field_zb = null;
        field_Eb = null;
    }

    pu(fn param0, boolean param1) {
        try {
          this.field_mb = 32;
          this.field_q = 32;
          this.field_Bb = param0;
          this.field_Cb = param0.d(false);
          this.field_N = (ut) ((Object) this.field_Cb);
          if (param1) {
            this.field_q = this.field_q >> 1;
            this.field_mb = this.field_mb >> 1;
            this.field_N = (ut) ((Object) nh.b(this.field_Cb));
          }
          this.field_yb = rv.field_b[this.field_Bb.field_h].toUpperCase();
          this.field_Hb = vo.$cfr$intArgs$a$53ce4ab4c593(-18, kd.field_u, new String[]{wq.field_a[this.field_Bb.field_k]}).toLowerCase();
          if (0 == this.field_Bb.field_h) {
            this.field_yb = '(' + this.field_yb + ')';
          } else {
            this.field_yb = '"' + this.field_yb + '"';
          }
          this.field_Gb = us.field_h[this.field_Bb.field_h];
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "pu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_Ab = "Unable to add name - system busy";
        field_zb = new int[2];
        field_Db = new int[7];
        field_Fb = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
