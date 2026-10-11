/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends fa {
    static boolean field_m;
    int field_p;
    static String field_l;
    fa field_k;
    static ak field_o;
    pp field_n;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          var3 = 1;
          while (true) {
            if (param0.length() <= var3) {
              var4 = 125 / ((param1 + 52) / 59);
              return true;
            }
            if (~var2_int == ~param0.charAt(var3)) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("cm.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        int var2 = (ni.field_q - 640) / 2;
        int var3 = qh.field_c * qh.field_c;
        int var4 = -(param0 * param0) + var3;
        if (param1 == 4740) {
          ff.field_h.a(90, -124 + (t.field_d - 90), -(var4 * 199 / var3) + var2, 256, 199);
          ai.field_A.a(0, t.field_d - 124, var4 * 438 / var3 + (var2 + 202), 256, 438);
          return;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var4 = -77 % ((param1 - 28) / 58);
        int var3 = param2 >>> 31;
        return (param2 + var3) / param0 - var3;
    }

    final static char a(byte param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        var2 = 255 & param0;
        if (param1 != 63) {
          cm.e(47);
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (128 > var2) {
            return (char)var2;
          }
          if (160 > var2) {
            var3 = jg.field_I[-128 + var2];
            if (0 == var3) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 > var2) {
          return (char)var2;
        }
        if (160 <= var2) {
          return (char)var2;
        }
        var3Lifetime1 = jg.field_I[-128 + var2];
        if (0 == var3Lifetime1) {
          var3Lifetime1 = 63;
        }
        var2Lifetime1 = var3Lifetime1;
        return (char)var2Lifetime1;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        if (param0 == 128) {
          field_l = null;
          field_o = null;
          return;
        }
        String var2 = (String) null;
        cm.a((String) null, -122);
        field_l = null;
        field_o = null;
    }

    final static void a(int param0, boolean param1, long param2, String param3, int param4, int param5) {
        int var8 = 0;
        try {
          int var7_int = -86 % ((-33 - param0) / 49);
          aa.field_f.g(param5, 15514);
          aa.field_f.field_m = aa.field_f.field_m + 1;
          var8 = aa.field_f.field_m;
          aa.field_f.a(false, param2);
          aa.field_f.b((byte) -41, param3);
          aa.field_f.e(160, param4);
          aa.field_f.e(160, param1 ? 1 : 0);
          aa.field_f.f(aa.field_f.field_m - var8, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "cm.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void e(int param0) {
        String var3 = null;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 >= -84) {
          var3 = (String) null;
          cm.a(-64, true, 36L, (String) null, -110, -88);
        }
        var1 = fj.field_c;
        synchronized (var1) {
          oi.field_c = oi.field_c + 1;
          ef.field_b = jm.field_o;
          uf.field_d = u.field_b;
          bg.field_k = ra.field_d;
          im.field_Jb = u.field_j;
          u.field_j = false;
          nm.field_c = tl.field_a;
          uo.field_a = c.field_X;
          ji.field_c = fa.field_j;
          tl.field_a = 0;
        }
    }

    cm(pp param0, fa param1) {
        try {
          this.field_n = param0;
          this.field_p = param0.e();
          this.field_k = param1;
          this.field_n.h(128 + ia.field_h * this.field_p >> 8);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = false;
        field_l = "Instructions";
    }
}
