/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    long field_p;
    boolean field_h;
    static String field_m;
    int field_g;
    static String field_i;
    static int[] field_a;
    String field_o;
    String field_k;
    int field_c;
    String field_d;
    int field_l;
    int[] field_f;
    String field_b;
    int field_n;
    qr field_j;
    int field_e;

    final int a(byte param0) {
        if (this.field_h) {
          return 2;
        }
        if (this.field_n == 2) {
          if (this.field_c > 0) {
            return 2;
          }
          if (~this.field_p == ~ec.field_p) {
            return 1;
          }
          if (po.field_b == 2) {
            if (da.a(-30106, this.field_b)) {
              return 1;
            }
            if (param0 > 100) {
              return 0;
            }
            return 23;
          }
          if (param0 > 100) {
            return 0;
          }
          return 23;
        }
        if (~this.field_p == ~ec.field_p) {
          return 1;
        }
        if (po.field_b == 2) {
          if (da.a(-30106, this.field_b)) {
            return 1;
          }
          if (param0 > 100) {
            return 0;
          }
          return 23;
        }
        if (param0 > 100) {
          return 0;
        }
        return 23;
    }

    final static String a(eg param0, int param1) {
        int incrementValue$0 = 0;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ne var4 = null;
        String var5 = null;
        String[] var6 = null;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 0;
          var4 = (ne) (param0.field_v.d(0));
          while (var4 != null) {
            if (ho.field_d == var4.field_h) {
              if (var4.field_r != 0 &&
                null != var4.field_k) {
                var3++;
              }
              var2_int = var2_int + var4.field_p;
            }
            var4 = (ne) (param0.field_v.a((byte) -71));
          }
          if (param1 != 23248) {
            stackIn_11_0 = (String) null;
            return stackIn_11_0;
          }
          if (var2_int == 0) {
            stackIn_14_0 = bq.field_f;
            return stackIn_14_0;
          }
          if (1 == var2_int) {
            stackIn_18_0 = bk.field_d;
          } else {
            stackIn_18_0 = re.a(rl.field_e, 4371, new String[]{Integer.toString(var2_int)});
          }
          var9 = stackIn_18_0;
          var5 = var9;
          if (0 != var3) {
            var6 = new String[1 + var3];
            var3 = 1;
            var6[0] = var9;
            var4 = (ne) (param0.field_v.d(0));
            while (var4 != null) {
              if (var4.field_h == ho.field_d &&
                var4.field_r != 0 &&
                null != var4.field_k) {
                if (var4.field_r != 1) {
                  var7 = re.a(wl.field_c, 4371, new String[]{pa.a(var4.field_k, -97), Integer.toString(var4.field_r)});
                } else {
                  var7 = re.a(lh.field_H, 4371, new String[]{pa.a(var4.field_k, -110)});
                }
                incrementValue$0 = var3;
                var3++;
                var6[incrementValue$0] = var7;
              }
              var4 = (ne) (param0.field_v.a((byte) -71));
            }
            var5 = va.a(-2, var6);
          }
          stackIn_33_0 = var5;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("nf.E(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int[] a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param0.length;
          var3 = new int[var2_int];
          if (param1 != 3718) {
            nf.b((byte) -75);
          }
          var4 = 1;
          while (true) {
            if (var2_int <= var4) {
              stackIn_11_0 = var3;
              return stackIn_11_0;
            }
            var5 = var4;
            while (true) {
              var5--;
              if (0 <= var5 &&
                param0[var3[var5]] > param0[var4]) {
                var3[1 + var5] = var3[var5];
                continue;
              }
              break;
            }
            var3[1 + var5] = var4;
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("nf.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var4 = param1.indexOf(param0);
        if (param2 <= 57) {
          return (String) null;
        }
        while (var4 != -1) {
          param1 = param1.substring(0, var4) + param3 + param1.substring(var4 + param0.length());
          var4 = param1.indexOf(param0, var4 + param3.length());
        }
        return param1;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var3 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        if (null != tc.field_G) {
          var3 = tc.field_G.b(param2, (byte) -68);
          if (var3 != -2) {
            if (var3 != -1) {
              var4 = tc.field_G.i(-86) ? 1 : 0;
              bb.a(94, tc.field_G.field_Gb, param1, var4 != 0, tc.field_G.g((byte) -42), var3);
            }
            tc.field_G = null;
            ai.a(3);
          }
          var3Lifetime2 = 107 % ((param0 + 29) / 53);
          return;
        }
        var3Lifetime1 = 107 % ((param0 + 29) / 53);
    }

    nf(boolean param0) {
        this.field_e = va.field_b;
        if (param0) {
          this.field_f = mb.field_p;
        } else {
          this.field_f = null;
        }
        this.field_b = em.field_a;
        this.field_k = ke.field_h;
        this.field_c = nj.field_a;
        this.field_h = kr.field_b;
        this.field_o = mc.field_q;
        this.field_p = sp.field_j;
        this.field_l = el.field_f;
        this.field_g = fm.field_f;
        this.field_n = ob.field_k;
        this.field_d = jc.field_s;
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 != -25) {
          field_i = (String) null;
          field_m = null;
          field_a = null;
          return;
        }
        field_m = null;
        field_a = null;
    }

    nf(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_h = true;
          this.field_k = param4;
          this.field_g = param2;
          this.field_o = param3;
          this.field_d = param1;
          this.field_c = 0;
          this.field_n = param0;
          this.field_p = 0L;
          this.field_e = 0;
          this.field_f = null;
          this.field_b = param1;
          this.field_l = 0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "nf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Total fleets lost.";
        field_i = "Close";
    }
}
