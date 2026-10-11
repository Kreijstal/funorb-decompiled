/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc implements Runnable {
    volatile en[] field_l;
    volatile boolean field_b;
    volatile boolean field_j;
    fd field_f;
    static vj field_e;
    static int field_a;
    static ui field_d;
    static ji field_k;
    static String field_h;
    static String field_g;
    static sg[] field_c;
    static ud field_i;

    final static int[] a(int[] param0, byte param1, int[] param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          var6 = new int[8];
          var3 = var6;
          var4 = 0;
          if (param1 != 47) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          while (8 > var4) {
            var6[var4] = lb.a(~param2[var4], param0[var4]);
            var4++;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rc.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_k = null;
        field_c = null;
        if (param0 >= -103) {
          return;
        }
        field_g = null;
        field_d = null;
        field_i = null;
    }

    public final void run() {
        int var1_int = 0;
        en var2 = null;
        int var4 = client.field_A ? 1 : 0;
        this.field_b = true;
        try {
          while (!this.field_j) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_l[var1_int];
              if (var2 != null) {
                var2.g();
              }
            }
            ua.a(10L, -128);
            db.a(-68, (Object) null, this.field_f);
          }
        } catch (Exception exception) {
          String var5 = (String) null;
          qb.a((Throwable) ((Object) exception), 16408, (String) null);
        } finally {
          this.field_b = false;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          rc.a(true);
        }
        return kf.field_Q != null ? true : false;
    }

    final static ke a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4) {
        ke stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        ke stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        ke stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        int var6;
        int var7;
        ke var8;
        ke var9;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        var8 = new ke(2);
        var9 = var8;
        stackIn_2_0 = var9;
        stackIn_3_1 = (!param1) ? false : true;
        stackIn_2_0.field_s = stackIn_3_1;
        if (param3 > 0) {
          rc.a(-21);
        }
        stackIn_7_0 = var9;
        stackIn_8_1 = (!param2) ? false : true;
        stackIn_7_0.field_j = stackIn_8_1;
        stackIn_10_0 = var9;
        stackIn_11_1 = (!param0) ? false : true;
        stackIn_10_0.field_r = stackIn_11_1;
        var9.a(new ec(20, qn.field_rb, a.field_t), 115);
        var9.a(new ec(21, lg.field_T, a.field_t), 102);
        var8.field_f[0].field_l = 320 - var8.field_f[0].field_n / 2;
        var8.field_f[0].field_m = 150;
        var8.field_f[1].field_m = 250;
        var8.field_f[1].field_l = 320 - var8.field_f[1].field_n / 2;
        var9.a(-1, param4, -129);
        var6 = var8.field_f[0].field_n;
        var7 = var8.field_f[1].field_n;
        if (var6 < var7) {
          var6 = var7;
        }
        var7Lifetime1 = w.field_kb.a(si.field_g);
        if (var7Lifetime1 > var6) {
          var6 = var7Lifetime1;
        }
        var7Lifetime2 = w.field_kb.a(gf.a(-127, param1, param2, param0));
        if (var6 < var7Lifetime2) {
          var6 = var7Lifetime2;
        }
        var7Lifetime3 = w.field_kb.a(ri.a(0, param1, param2, param0));
        if (var7Lifetime3 > var6) {
          var6 = var7Lifetime3;
        }
        var7Lifetime4 = w.field_kb.a(kk.a(param2, param1, param0, true));
        if (var6 < var7Lifetime4) {
          var6 = var7Lifetime4;
        }
        var9.field_z = 76;
        var9.field_w = -(var6 / 2) + 280;
        var9.field_q = 260;
        var9.field_y = -var9.field_w + (var6 / 2 + 360);
        return var9;
    }

    rc() {
        this.field_l = new en[2];
        this.field_j = false;
        this.field_b = false;
    }

    static {
        int var0 = 0;
        field_a = 0;
        field_h = "Left";
        field_e = new vj();
        field_c = new sg[255];
        field_g = "Cancel unrated rematch";
        for (var0 = 0; var0 < field_c.length; var0++) {
          field_c[var0] = new sg();
        }
    }
}
