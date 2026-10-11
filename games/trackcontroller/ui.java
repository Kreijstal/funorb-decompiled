/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends di {
    private lb field_q;
    static String field_n;
    static aa field_m;
    static int[] field_r;
    private lb field_o;
    static be field_p;

    final ud a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        ud stackIn_2_0 = null;
        ud stackIn_5_0 = null;
        ud stackIn_10_0 = null;
        ud stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_q.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = ef.field_b;
            return stackIn_2_0;
          }
          if (!ri.a((byte) 56, var4, var3)) {
            stackIn_5_0 = ef.field_b;
            return stackIn_5_0;
          }
          if (param0 > -106) {
            var5 = (String) null;
            this.a(-122, (String) null);
          }
          if (!this.b(param1, 84)) {
            stackIn_12_0 = TrackController.field_G;
            return stackIn_12_0;
          }
          stackIn_10_0 = ef.field_b;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ui.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void g(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 != 95) {
          return;
        }
        if (cj.field_o != null) {
          var1 = cj.field_o;
          synchronized (var1) {
            cj.field_o = null;
          }
        }
    }

    public static void h(int param0) {
        if (param0 != 256) {
          ui.a(-68, 'ﾥ');
        }
        field_n = null;
        field_p = null;
        field_m = null;
        field_r = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (vl.a(param1, param0 ^ -3296)) {
            return true;
          }
          if (param0 != -19050) {
            return false;
          }
          var6 = ob.field_q;
          var2 = var6;
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (var4 == param1) {
              return true;
            }
          }
          var2Lifetime1 = hj.field_f;
          var3Lifetime1 = 0;
          while (true) {
            if (var3Lifetime1 >= var2Lifetime1.length) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 != var4Lifetime1) {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2_ref), "ui.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 24) {
            field_n = (String) null;
          }
          var8 = this.field_o.field_s.toLowerCase();
          var4 = param0.toLowerCase();
          if (var8.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var8.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < -1 + var8.length()) {
              var6 = var8.substring(0, var5);
              var7 = var8.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ui.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = v.a('_', (byte) -31, "", param1);
          if (param2 <= 77) {
            field_m = (aa) null;
          }
          var3 = rb.a(22479, param1);
          stackIn_7_0 = (param0.indexOf(param1) != -1) || (-1 != param0.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ui.G(");
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
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 426) {
            field_m = (aa) null;
          }
          var6 = this.field_q.field_s.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          var5 = var4;
          if (ac.a(var5, -23797)) {
            stackIn_8_0 = nl.field_c;
            return stackIn_8_0;
          }
          if (sd.a(var5, (byte) 115)) {
            stackIn_11_0 = kh.field_a;
            return stackIn_11_0;
          }
          if (ba.a(var5, false)) {
            stackIn_14_0 = mj.field_a;
            return stackIn_14_0;
          }
          if (this.b(param0, 35)) {
            stackIn_17_0 = h.field_a;
            return stackIn_17_0;
          }
          if (var6.length() <= 0) {
            stackIn_31_0 = pf.field_N;
            return stackIn_31_0;
          }
          if (cb.a(var6, var5, (byte) -11)) {
            stackIn_21_0 = qd.field_c;
            return stackIn_21_0;
          }
          if (rh.a(param1 ^ 19012, var6, var5)) {
            stackIn_25_0 = fe.field_J;
            return stackIn_25_0;
          }
          if (!ui.a(var5, var6, (byte) 103)) {
            return nl.field_c;
          }
          stackIn_29_0 = qd.field_c;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("ui.B(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    ui(lb param0, lb param1, lb param2) {
        super(param0);
        try {
          this.field_q = param1;
          this.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        if (-1 == param0) {
          return true;
        }
        if (!param1) {
          ui.h(85);
        }
        return (pf.field_U & 1 << param0) != 0 ? true : false;
    }

    static {
        field_n = "Congratulations! You've completed the full game!";
        field_m = new aa(12, 0, 1, 0);
        field_r = new int[8192];
        field_p = new be(256);
    }
}
