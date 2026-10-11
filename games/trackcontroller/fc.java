/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fc {
    static String field_a;
    static String field_g;
    fc field_e;
    static String field_f;
    static String[] field_c;
    static int field_d;
    fc field_h;
    long field_b;

    final static boolean c(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 < 2) {
          return false;
        }
        stackIn_7_0 = (rl.field_N >= 10) && (!ge.field_D) && (!gh.a(3100));
        return stackIn_7_0;
    }

    final boolean b(int param0) {
        if (param0 != 10000536) {
          fc.a(20, 32, 14, (byte) -49, 34);
        }
        if (null == this.field_e) {
          return false;
        }
        return true;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param3 != 12105912) {
          return (String) null;
        }
        if (param0) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return field_c[var4];
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          if (param3 > -14) {
            field_a = (String) null;
          }
          ll.a(param4, param1, param0 + 1, 10000536);
          ll.a(param4, param2 + param1, param0 + 1, 12105912);
          var5_int = 1;
          var6 = param2;
          if (var5_int + param1 < ll.field_b) {
            var5_int = ll.field_b - param1;
          }
          if (param1 + var6 > ll.field_g) {
            var6 = -param1 + ll.field_g;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 152 + var7 * 48 / param2;
            var9 = var8 << 8 | var8 << 16 | var8;
            ll.field_i[param4 + (param1 + var7) * ll.field_d] = var9;
            ll.field_i[param0 + (ll.field_d * (var7 + param1) + param4)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var5), "fc.LB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          field_a = (String) null;
        }
        if (null != sb.field_b) {
          sb.field_b.f();
        }
        if (g.field_x != null) {
          g.field_x.f();
        }
    }

    final static boolean b(boolean param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          try {
            if (!uf.field_b.startsWith("win")) {
              return false;
            }
            if (param0) {
              field_a = (String) null;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (var3 >= param1.length()) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                return true;
              }
              if (-1 != var2.indexOf((int) param1.charAt(var3))) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var2_ref2;
          stackIn_22_1 = new StringBuilder().append("fc.QB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_f = null;
        field_a = null;
        if (param0 != 118) {
          field_d = 105;
        }
        field_c = null;
    }

    final void a(int param0) {
        if (param0 >= -22) {
          this.field_b = 48L;
        }
        if (null == this.field_e) {
          return;
        }
        this.field_e.field_h = this.field_h;
        this.field_h.field_e = this.field_e;
        this.field_h = null;
        this.field_e = null;
    }

    static {
        field_a = "Log in / Register";
        field_f = "Waiting for sound effects";
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_d = 0;
    }
}
