/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends gd {
    static int field_S;
    static int field_T;
    static String field_Q;
    static int[][] field_R;
    int field_O;
    static String field_P;

    final static void a(String param0, byte param1) {
        try {
          jj.field_d = param0;
          sn.a(93, 12);
          if (param1 != 58) {
            lk.f(87);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (param1 == 8187) {
          var4 = param0 + this.field_t;
          var5 = this.field_i + param2;
          wd.field_l[this.field_O].a(20 + var5, 30 + var4, true, 30);
          super.b(param0, param1 ^ 0, param2);
          return;
        }
    }

    lk(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, 0);
        this.field_O = param4;
        this.g(255);
    }

    public static void h(int param0) {
        field_Q = null;
        field_R = (int[][]) null;
        if (param0 == 25161) {
          field_P = null;
          return;
        }
        String var2 = (String) null;
        lk.a((String) null, (byte) -122);
        field_P = null;
    }

    final void g(int param0) {
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var14 = null;
        String var13 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var2 = gm.field_d.field_J[this.field_O];
        int var3 = gm.field_d.field_F[this.field_O];
        Object var4 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        if (var2 != 0) {
          var9 = jk.a(new String[]{Integer.toString(var2)}, nh.field_i, 30496);
          var4 = var9;
          var4 = var9;
          var4 = var9;
          if (var3 != 0) {
            var4 = var9 + ", " + jk.a(new String[]{Integer.toString(var3)}, to.field_a, 30496);
          }
          if (!ve.a(false)) {
            var10 = li.field_b[this.field_O];
            var6 = db.field_v.b(var10);
            var7 = db.field_v.field_H + la.field_b.field_E;
            if (var4 != null) {
              var8 = db.field_v.b((String) (var4));
              if (var8 > var6) {
                var6 = var8;
              }
              var7 = var7 + db.field_v.field_H;
            }
            this.field_K = new cn(var6, var7);
            this.field_H = new cn(var6, var7);
            this.field_z = new cn(var6, var7);
            jh.c();
            this.field_K.e();
            db.field_v.b(var10, 0, la.field_b.field_H, 12632256, -1);
            if (var4 == null) {
              this.field_H.e();
              gf.a();
              this.field_K.e(0, 0, 16744448);
              this.field_z.e();
              gf.a();
              this.field_K.e(0, 0, 12690143);
              jh.b();
              this.field_K.field_A = this.field_x - var7 >> 1;
              this.field_K.field_w = 60;
              this.field_H.field_w = 60;
              this.field_H.field_A = this.field_x - var7 >> 1;
              this.field_z.field_w = 60;
              this.field_z.field_A = this.field_x - var7 >> 1;
              this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
              this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
              return;
            }
            db.field_v.b((String) (var4), 0, la.field_b.field_H * 2, 8421504, -1);
            this.field_H.e();
            gf.a();
            this.field_K.e(0, 0, 16744448);
            this.field_z.e();
            gf.a();
            this.field_K.e(0, 0, 12690143);
            jh.b();
            this.field_K.field_A = this.field_x - var7 >> 1;
            this.field_K.field_w = 60;
            this.field_H.field_w = 60;
            this.field_H.field_A = this.field_x - var7 >> 1;
            this.field_z.field_w = 60;
            this.field_z.field_A = this.field_x - var7 >> 1;
            this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
            this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
            return;
          }
          if (!hm.field_m[this.field_O]) {
            var11 = li.field_b[this.field_O];
            var6Lifetime2 = db.field_v.b(var11);
            var7Lifetime2 = db.field_v.field_H + la.field_b.field_E;
            if (var4 != null) {
              var8Lifetime2 = db.field_v.b((String) (var4));
              if (var8Lifetime2 > var6Lifetime2) {
                var6Lifetime2 = var8Lifetime2;
              }
              var7Lifetime2 = var7Lifetime2 + db.field_v.field_H;
            }
            this.field_K = new cn(var6Lifetime2, var7Lifetime2);
            this.field_H = new cn(var6Lifetime2, var7Lifetime2);
            this.field_z = new cn(var6Lifetime2, var7Lifetime2);
            jh.c();
            this.field_K.e();
            db.field_v.b(var11, 0, la.field_b.field_H, 12632256, -1);
            if (var4 == null) {
              this.field_H.e();
              gf.a();
              this.field_K.e(0, 0, 16744448);
              this.field_z.e();
              gf.a();
              this.field_K.e(0, 0, 12690143);
              jh.b();
              this.field_K.field_A = this.field_x - var7Lifetime2 >> 1;
              this.field_K.field_w = 60;
              this.field_H.field_w = 60;
              this.field_H.field_A = this.field_x - var7Lifetime2 >> 1;
              this.field_z.field_w = 60;
              this.field_z.field_A = this.field_x - var7Lifetime2 >> 1;
              this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
              this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
              return;
            }
            db.field_v.b((String) (var4), 0, la.field_b.field_H * 2, 8421504, -1);
            this.field_H.e();
            gf.a();
            this.field_K.e(0, 0, 16744448);
            this.field_z.e();
            gf.a();
            this.field_K.e(0, 0, 12690143);
            jh.b();
            this.field_K.field_A = this.field_x - var7Lifetime2 >> 1;
            this.field_K.field_w = 60;
            this.field_H.field_w = 60;
            this.field_H.field_A = this.field_x - var7Lifetime2 >> 1;
            this.field_z.field_w = 60;
            this.field_z.field_A = this.field_x - var7Lifetime2 >> 1;
            this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
            this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
            return;
          }
          if (var2 < 5) {
            var12 = li.field_b[this.field_O];
            var6Lifetime3 = db.field_v.b(var12);
            var7Lifetime3 = db.field_v.field_H + la.field_b.field_E;
            if (var4 != null) {
              var8Lifetime3 = db.field_v.b((String) (var4));
              if (var8Lifetime3 > var6Lifetime3) {
                var6Lifetime3 = var8Lifetime3;
              }
              var7Lifetime3 = var7Lifetime3 + db.field_v.field_H;
            }
            this.field_K = new cn(var6Lifetime3, var7Lifetime3);
            this.field_H = new cn(var6Lifetime3, var7Lifetime3);
            this.field_z = new cn(var6Lifetime3, var7Lifetime3);
            jh.c();
            this.field_K.e();
            db.field_v.b(var12, 0, la.field_b.field_H, 12632256, -1);
            if (var4 == null) {
              this.field_H.e();
              gf.a();
              this.field_K.e(0, 0, 16744448);
              this.field_z.e();
              gf.a();
              this.field_K.e(0, 0, 12690143);
              jh.b();
              this.field_K.field_A = this.field_x - var7Lifetime3 >> 1;
              this.field_K.field_w = 60;
              this.field_H.field_w = 60;
              this.field_H.field_A = this.field_x - var7Lifetime3 >> 1;
              this.field_z.field_w = 60;
              this.field_z.field_A = this.field_x - var7Lifetime3 >> 1;
              this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
              this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
              return;
            }
            db.field_v.b((String) (var4), 0, la.field_b.field_H * 2, 8421504, -1);
            this.field_H.e();
            gf.a();
            this.field_K.e(0, 0, 16744448);
            this.field_z.e();
            gf.a();
            this.field_K.e(0, 0, 12690143);
            jh.b();
            this.field_K.field_A = this.field_x - var7Lifetime3 >> 1;
            this.field_K.field_w = 60;
            this.field_H.field_w = 60;
            this.field_H.field_A = this.field_x - var7Lifetime3 >> 1;
            this.field_z.field_w = 60;
            this.field_z.field_A = this.field_x - var7Lifetime3 >> 1;
            this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
            this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
            return;
          }
          var14 = (String) (var4) + ", " + qh.field_j;
          var13 = li.field_b[this.field_O];
          var6Lifetime4 = db.field_v.b(var13);
          var7Lifetime4 = db.field_v.field_H + la.field_b.field_E;
          if (var14 != null) {
            var8Lifetime4 = db.field_v.b(var14);
            if (var8Lifetime4 > var6Lifetime4) {
              var6Lifetime4 = var8Lifetime4;
            }
            var7Lifetime4 = var7Lifetime4 + db.field_v.field_H;
          }
          this.field_K = new cn(var6Lifetime4, var7Lifetime4);
          this.field_H = new cn(var6Lifetime4, var7Lifetime4);
          this.field_z = new cn(var6Lifetime4, var7Lifetime4);
          jh.c();
          this.field_K.e();
          db.field_v.b(var13, 0, la.field_b.field_H, 12632256, -1);
          if (var14 == null) {
            this.field_H.e();
            gf.a();
            this.field_K.e(0, 0, 16744448);
            this.field_z.e();
            gf.a();
            this.field_K.e(0, 0, 12690143);
            jh.b();
            this.field_K.field_A = this.field_x - var7Lifetime4 >> 1;
            this.field_K.field_w = 60;
            this.field_H.field_w = 60;
            this.field_H.field_A = this.field_x - var7Lifetime4 >> 1;
            this.field_z.field_w = 60;
            this.field_z.field_A = this.field_x - var7Lifetime4 >> 1;
            this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
            this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
            return;
          }
          db.field_v.b(var14, 0, la.field_b.field_H * 2, 8421504, -1);
          this.field_H.e();
          gf.a();
          this.field_K.e(0, 0, 16744448);
          this.field_z.e();
          gf.a();
          this.field_K.e(0, 0, 12690143);
          jh.b();
          this.field_K.field_A = this.field_x - var7Lifetime4 >> 1;
          this.field_K.field_w = 60;
          this.field_H.field_w = 60;
          this.field_H.field_A = this.field_x - var7Lifetime4 >> 1;
          this.field_z.field_w = 60;
          this.field_z.field_A = this.field_x - var7Lifetime4 >> 1;
          this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
          this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
          return;
        }
        if (var3 != 0) {
          var4 = jk.a(new String[]{Integer.toString(var3)}, to.field_a, 30496);
        }
        String var15 = li.field_b[this.field_O];
        var6Lifetime1 = db.field_v.b(var15);
        var7Lifetime1 = db.field_v.field_H + la.field_b.field_E;
        if (var4 != null) {
          var8Lifetime1 = db.field_v.b((String) (var4));
          if (var8Lifetime1 > var6Lifetime1) {
            var6Lifetime1 = var8Lifetime1;
          }
          var7Lifetime1 = var7Lifetime1 + db.field_v.field_H;
        }
        this.field_K = new cn(var6Lifetime1, var7Lifetime1);
        this.field_H = new cn(var6Lifetime1, var7Lifetime1);
        this.field_z = new cn(var6Lifetime1, var7Lifetime1);
        jh.c();
        this.field_K.e();
        db.field_v.b(var15, 0, la.field_b.field_H, 12632256, -1);
        if (var4 == null) {
          this.field_H.e();
          gf.a();
          this.field_K.e(0, 0, 16744448);
          this.field_z.e();
          gf.a();
          this.field_K.e(0, 0, 12690143);
          jh.b();
          this.field_K.field_A = this.field_x - var7Lifetime1 >> 1;
          this.field_K.field_w = 60;
          this.field_H.field_w = 60;
          this.field_H.field_A = this.field_x - var7Lifetime1 >> 1;
          this.field_z.field_w = 60;
          this.field_z.field_A = this.field_x - var7Lifetime1 >> 1;
          this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
          this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
          return;
        }
        db.field_v.b((String) (var4), 0, la.field_b.field_H * 2, 8421504, -1);
        this.field_H.e();
        gf.a();
        this.field_K.e(0, 0, 16744448);
        this.field_z.e();
        gf.a();
        this.field_K.e(0, 0, 12690143);
        jh.b();
        this.field_K.field_A = this.field_x - var7Lifetime1 >> 1;
        this.field_K.field_w = 60;
        this.field_H.field_w = 60;
        this.field_H.field_A = this.field_x - var7Lifetime1 >> 1;
        this.field_z.field_w = 60;
        this.field_z.field_A = this.field_x - var7Lifetime1 >> 1;
        this.field_I = rb.a(16, this.field_z, param0, (byte) -33);
        this.field_N = rb.a(16, this.field_H, 16711680, (byte) -18);
    }

    final static String a(String param0, nh param1, String param2, byte param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.a(-14354)) {
            stackIn_2_0 = (String) (param2);
            return stackIn_2_0;
          }
          if (param3 <= -119) {
            stackIn_7_0 = param0 + " - " + param1.b(100) + "%";
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("lk.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void f(int param0) {
        ia.field_K = null;
        sg.field_b = null;
        ga.field_o = null;
        ro.field_B = false;
        if (param0 != 16) {
          field_S = 2;
        } else {
          System.gc();
          return;
        }
        System.gc();
    }

    final void a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var8 = DungeonAssault.field_K;
        int var4 = this.field_t + param0;
        int var5 = param1 + this.field_i;
        int var7 = 63 / ((param2 - 41) / 61);
        for (var6 = 0; 10 > var6; var6++) {
          gf.g(30 + var4, 20 + var5, 20 + var6, 0, 16);
        }
    }

    static {
        field_P = "CONFIRM";
        field_S = 0;
        field_Q = "Your email address is used to identify this account";
    }
}
