/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends ip {
    private boolean field_p;
    private String field_o;
    private static long[] field_q;
    static cn field_r;
    static int field_t;
    static int field_n;
    static en field_u;
    static boolean field_s;
    static cn[] field_m;

    final void e(boolean param0) {
        if (!param0) {
          return;
        }
        this.field_o = null;
    }

    public static void e(byte param0) {
        field_q = null;
        field_m = null;
        int var1 = -44 / ((-37 - param0) / 44);
        field_r = null;
        field_u = null;
    }

    final static void e(int param0) {
        Object stackIn_25_0 = null;
        ai stackIn_25_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var1_intLifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = DungeonAssault.field_K;
        try {
          jh.c();
          if (null == wm.field_c) {
            bn.field_f = new cn(378, 300);
            wm.field_c = new cn(410, 332);
            wm.field_c.field_A = -16;
            wm.field_c.field_w = -16;
          }
          bn.field_f.e();
          gf.a();
          for (var1_int = 0; var1_int < 7; var1_int++) {
            var2 = 27 * (-var1_int + 6);
            var3 = 20 * var1_int;
            var4 = -var1_int + 6;
            var5 = 0;
            while (1 + var1_int > var5) {
              var6 = 16777215;
              if (null != qj.field_c[var4]) {
                if (var4 != 0 &&
                  var4 != 6) {
                  rl.field_d[5].e(var2, var3, var6);
                }
                if (var4 != 6 &&
                  48 != var4) {
                  rl.field_d[4].e(27 + var2, var3, var6);
                }
                ed.a(var3, var2, var4, (byte) -127, var6);
                rl.field_d[4].e(var2, var3 + 20, var6);
                rl.field_d[5].e(27 + var2, 20 + var3, var6);
              }
              var4 += 8;
              var5++;
              var2 += 54;
            }
          }
          for (var1_intLifetime1 = 7; 13 > var1_intLifetime1; var1_intLifetime1++) {
            var2Lifetime1 = -162 + 27 * var1_intLifetime1;
            var3Lifetime1 = 20 * var1_intLifetime1;
            var4Lifetime1 = var1_intLifetime1 * 7 - 42;
            var5Lifetime1 = 0;
            while (13 - var1_intLifetime1 > var5Lifetime1) {
              var6Lifetime1 = 16777215;
              stackIn_25_0 = null;
              stackIn_25_1 = qj.field_c[var4Lifetime1];
              if (stackIn_25_0 != stackIn_25_1) {
                rl.field_d[5].e(var2Lifetime1, var3Lifetime1, var6Lifetime1);
                rl.field_d[4].e(27 + var2Lifetime1, var3Lifetime1, var6Lifetime1);
                ed.a(var3Lifetime1, var2Lifetime1, var4Lifetime1, (byte) -93, var6Lifetime1);
                rl.field_d[5].e(27 + var2Lifetime1, var3Lifetime1 + 20 + 0, var6Lifetime1);
                rl.field_d[4].e(var2Lifetime1, var3Lifetime1 + 20 - 0, var6Lifetime1);
              }
              var4Lifetime1 += 8;
              var5Lifetime1++;
              var2Lifetime1 += 54;
            }
          }
          wm.field_c.e();
          gf.a();
          if (param0 < 35) {
            field_t = -99;
          }
          bn.field_f.e(16, 16, 8454143);
          gf.d(8, 8, 0, 0, wm.field_c.field_y, wm.field_c.field_v);
          bn.field_f.e(16, 16, 0);
          jh.b();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "kh.E(" + param0 + ')');
        }
    }

    final static boolean d(byte param0) {
        if (-1 == nj.field_b) {
          if (!oi.a(-12929, 1)) {
            return false;
          }
          nj.field_b = ra.field_c.c(true);
          ra.field_c.field_o = 0;
        }
        if (nj.field_b == -2) {
          if (!oi.a(-12929, 2)) {
            return false;
          }
          nj.field_b = ra.field_c.k(0);
          ra.field_c.field_o = 0;
        }
        if (param0 > -59) {
          field_q = (long[]) null;
        }
        return oi.a(-12929, nj.field_b);
    }

    final static boolean d(boolean param0) {
        boolean stackIn_9_0 = false;
        if (!param0) {
          field_r = (cn) null;
        }
        stackIn_9_0 = (null != gi.field_S) || (uc.g(127)) || (null != mh.field_e) || (ck.g(-1));
        return stackIn_9_0;
    }

    final od a(String param0, int param1) {
        vk var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        od stackIn_3_0 = null;
        od stackIn_9_0 = null;
        od stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!o.a((byte) 31, var4)) {
            stackIn_3_0 = pd.field_J;
            return stackIn_3_0;
          }
          if (!param0.equals(this.field_o)) {
            var3 = vk.a((byte) -126, param0);
            if (var3 != null &&
              null == var3.field_g) {
              this.field_p = var3.field_a;
              this.field_o = param0;
            } else {
              stackIn_9_0 = oc.field_A;
              return stackIn_9_0;
            }
          }
          var3_int = 108 % ((5 - param1) / 44);
          if (this.field_p) {
            stackIn_14_0 = c.field_d;
          } else {
            stackIn_14_0 = pd.field_J;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("kh.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        vk var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = jg.a(104, var5);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_o)) {
            var4 = vk.a((byte) -126, param1);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_g) {
              return null;
            }
            this.field_p = var4.field_a;
            this.field_o = param1;
          }
          if (!this.field_p) {
            stackIn_14_0 = fp.field_a;
            return stackIn_14_0;
          }
          if (param0 >= 44) {
            stackIn_19_0 = ng.field_N;
            return stackIn_19_0;
          }
          stackIn_17_0 = (String) null;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("kh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    kh(rm param0) {
        super(param0);
        this.field_p = false;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_q = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_q[var2] = var0;
        }
    }
}
