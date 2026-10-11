/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static dl field_d;
    static p field_c;
    static int field_e;
    static String[] field_a;
    static km field_b;

    public static void a(int param0) {
        field_d = null;
        if (param0 <= 45) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static rm a(int param0, int param1, int param2, eh param3) {
        RuntimeException var4 = null;
        java.applet.Applet var5 = null;
        rm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!hn.a(param3, param1, param0, (byte) 109)) {
            return null;
          }
          if (param2 != -2071) {
            var5 = (java.applet.Applet) null;
            bd.a(59, (java.applet.Applet) null);
          }
          stackIn_6_0 = bk.a(35);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("bd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static co a(int param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        co[] var3 = null;
        co var5 = null;
        int var6 = 0;
        co stackIn_3_0 = null;
        co stackIn_11_0 = null;
        co stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var2 = wd.a(0, param1, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_3_0 = nd.field_j;
            return stackIn_3_0;
          }
          var3 = wn.a(5);
          if (param0 >= -46) {
            bd.a(-88);
          }
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a((byte) 115, var2)) {
              stackIn_11_0 = var5;
              return stackIn_11_0;
            }
          }
          stackIn_14_0 = nd.field_j;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("bd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, ri param2, e param3, String param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          var7 = 1;
          if (param0 <= 28) {
            field_d = (dl) null;
          }
          while (param4.length() > var7) {
            var8 = param4.charAt(var7);
            if (var8 == 60) {
              var6 = param2.field_d[0] + ((var5_int >> 8) + param3.a(param4.substring(0, var7)));
            }
            if (var6 != -1) {
              param2.field_d[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param2.field_d[var7] = param2.field_d[0] + ((var5_int >> 8) + param3.a(param4.substring(0, var7 + 1)) - param3.a((char) var8));
            }
            if (62 == var8) {
              var6 = -1;
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("bd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        String var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        String var6Lifetime1;
        if (!param1) {
          if (vl.field_i[param3] > vl.field_i[param2]) {
            return true;
          }
          if (vl.field_i[param3] < vl.field_i[param2]) {
            return false;
          }
          if (wh.field_c[param2] < wh.field_c[param3]) {
            return true;
          }
          if (wh.field_c[param2] > wh.field_c[param3]) {
            return false;
          }
          var4 = kf.field_j[param2] + (vc.field_jb[param2] + tg.field_A[param2]);
          if (param0 == 3005) {
            var5 = vc.field_jb[param3] + tg.field_A[param3] + kf.field_j[param3];
            if (var5 > var4) {
              return true;
            }
            if (var5 < var4) {
              return false;
            }
            return !(param2 >= param3);
          }
          var6 = (String) null;
          bd.a(65, 53, (ri) null, (e) null, (String) null);
          var5Lifetime3 = vc.field_jb[param3] + tg.field_A[param3] + kf.field_j[param3];
          if (var5Lifetime3 > var4) {
            return true;
          }
          if (var5Lifetime3 < var4) {
            return false;
          }
          return !(param2 >= param3);
        }
        if (wh.field_c[param2] < wh.field_c[param3]) {
          return true;
        }
        if (wh.field_c[param2] > wh.field_c[param3]) {
          return false;
        }
        if (vl.field_i[param3] > vl.field_i[param2]) {
          return true;
        }
        if (vl.field_i[param3] < vl.field_i[param2]) {
          return false;
        }
        var4Lifetime1 = kf.field_j[param2] + (vc.field_jb[param2] + tg.field_A[param2]);
        if (param0 == 3005) {
          var5Lifetime1 = vc.field_jb[param3] + tg.field_A[param3] + kf.field_j[param3];
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(param2 >= param3);
        }
        var6Lifetime1 = (String) null;
        bd.a(65, 53, (ri) null, (e) null, (String) null);
        var5Lifetime2 = vc.field_jb[param3] + tg.field_A[param3] + kf.field_j[param3];
        if (var5Lifetime2 > var4Lifetime1) {
          return true;
        }
        if (var5Lifetime2 < var4Lifetime1) {
          return false;
        }
        if (param2 >= param3) {
          return false;
        }
        return true;
    }

    static {
        field_d = new dl();
    }
}
