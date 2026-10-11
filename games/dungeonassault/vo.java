/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends ip {
    static String field_m;
    static String field_q;
    private rm field_n;
    static String field_o;
    static int field_r;
    private rm field_p;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7Lifetime1;
        var9 = DungeonAssault.field_K;
        try {
          if (param0 < 44) {
            return;
          }
          je.a((byte) -96, param1, param2, bf.field_d, param4, param3);
          var5_int = param4 + gf.field_i * param2;
          var6 = -param3 + gf.field_i;
          for (var7 = -param1; var7 < 0; var7++) {
            for (var8 = -param3; var8 < 0; var8++) {
              gf.field_b[var5_int] = mp.a(gf.field_b[var5_int], -2147483648);
              var5_int++;
            }
            var5_int = var5_int + var6;
          }
          qe.b(param4, param2, param3, param1, 2105376, 192, 80);
          for (var7Lifetime1 = 0; var7Lifetime1 < 4; var7Lifetime1++) {
            qe.a(param4 + var7Lifetime1, param2 + var7Lifetime1, param3 - var7Lifetime1 * 2, param1 - 2 * var7Lifetime1, 16777215, -(var7Lifetime1 * 16) + 64, 80 - var7Lifetime1 * 20);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "vo.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 44) {
            this.field_n = (rm) null;
          }
          var6 = this.field_n.field_w.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          var5 = var4;
          if (sm.a(1, var5)) {
            stackIn_7_0 = fm.field_j;
            return stackIn_7_0;
          }
          if (dj.a(6623, var5)) {
            stackIn_10_0 = ad.field_c;
            return stackIn_10_0;
          }
          if (j.a(var5, (byte) -124)) {
            stackIn_14_0 = di.field_k;
            return stackIn_14_0;
          }
          if (this.a(param1, (byte) -106)) {
            stackIn_18_0 = tp.field_x;
            return stackIn_18_0;
          }
          if (var6.length() <= 0) {
            stackIn_21_0 = dl.field_a;
            return stackIn_21_0;
          }
          if (gk.a(var6, var5, 16777215)) {
            stackIn_25_0 = qd.field_b;
            return stackIn_25_0;
          }
          if (gl.a(var6, 0, var5)) {
            stackIn_28_0 = mf.field_a;
            return stackIn_28_0;
          }
          if (!uo.a((byte) -69, var6, var5)) {
            stackIn_33_0 = fm.field_j;
            return stackIn_33_0;
          }
          stackIn_31_0 = qd.field_b;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("vo.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    vo(rm param0, rm param1, rm param2) {
        super(param0);
        try {
          this.field_p = param2;
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final od a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        od stackIn_3_0 = null;
        od stackIn_7_0 = null;
        od stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 113 % ((param1 - 5) / 44);
          var4 = this.field_n.field_w.toLowerCase();
          var5 = param0.toLowerCase();
          if (var5.length() == 0) {
            stackIn_3_0 = pd.field_J;
            return stackIn_3_0;
          }
          if (!wm.a(var4, var5, (byte) -83)) {
            stackIn_7_0 = pd.field_J;
            return stackIn_7_0;
          }
          if (!this.a(param0, (byte) -117)) {
            return c.field_d;
          }
          stackIn_11_0 = pd.field_J;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("vo.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_m = null;
        field_o = null;
        if (param0 != 1) {
          vo.e(-81);
        }
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -95) {
            field_r = -102;
          }
          var3 = this.field_p.field_w.toLowerCase();
          var4 = param0.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (0 > var4.indexOf(var7)) {
                return false;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("vo.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_m = "<col=178B8B>Use skill - <%0></col>";
        field_o = "<col=8B1717>Disarm</col>";
    }
}
