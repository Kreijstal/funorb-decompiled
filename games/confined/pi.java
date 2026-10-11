/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends ga implements ge, el {
    private rg field_Q;
    private na field_R;
    private v field_O;
    static al field_T;
    static int field_H;
    static int[] field_U;
    static String field_P;
    static rb field_S;
    static int field_L;

    public final void a(na param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          if (0 != param1) {
            if (param1 != 1) {
              if (2 == param1) {
                tb.a(-15912, "conduct.ws");
                if (var6 != 0) {
                  tb.a(-15912, "privacy.ws");
                  tb.a(-15912, "terms.ws");
                }
              }
            } else {
              tb.a(-15912, "privacy.ws");
              if (var6 != 0) {
                tb.a(-15912, "terms.ws");
              }
            }
          } else {
            tb.a(-15912, "terms.ws");
          }
          if (!param3) {
            return;
          }
          field_S = (rb) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pi.LA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(String param0, String param1, int param2, String param3) {
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        var5 = Confined.field_J ? 1 : 0;
        if (param2 == 22232) {
          var4 = param3.indexOf(param0);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (-1 == var4))) {
            param3 = param3.substring(0, var4) + param1 + param3.substring(var4 + param0.length());
            stackIn_7_0 = (String) (param3);
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_7_0).indexOf(param0, param1.length() + var4);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_7_0 = (String) (param3);
          }
          return stackIn_7_0;
        }
        pi.j(-6);
        var4Lifetime1 = param3.indexOf(param0);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (-1 == var4Lifetime1))) {
          param3 = param3.substring(0, var4Lifetime1) + param1 + param3.substring(var4Lifetime1 + param0.length());
          stackIn_13_0 = (String) (param3);
          if (var5 == 0) {
            var4Lifetime1 = ((String) (Object) stackIn_13_0).indexOf(param0, param1.length() + var4Lifetime1);
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_13_0 = (String) (param3);
        }
        return stackIn_13_0;
    }

    private final String k(int param0) {
        if (param0 != -99) {
          field_T = (al) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(byte param0) {
        field_U = null;
        field_T = null;
        field_S = null;
        field_P = null;
        if (param0 >= -70) {
          pi.a((byte) -105);
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -80, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_5_0 = this.c(param0, 32);
            return stackIn_5_0;
          }
          var5_int = 103 % ((47 - param1) / 43);
          if (99 != param2) {
            return false;
          }
          stackIn_9_0 = this.a(17731, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pi.Q(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param1.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param1.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param1.equals("J")) {
            stackIn_12_0 = Long.TYPE;
            return stackIn_12_0;
          }
          if (param1.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param1.equals("F")) {
            stackIn_19_0 = Float.TYPE;
            return stackIn_19_0;
          }
          if (param1.equals("D")) {
            stackIn_23_0 = Double.TYPE;
            return stackIn_23_0;
          }
          if (param0 <= 79) {
            field_L = -40;
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("pi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Q == param3) {
            la.j(29);
            this.field_O.n(10);
          }
          if (param0 > 68) {
            return;
          }
          discarded$1 = this.l(86);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("pi.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    pi(v param0) {
        super(0, 0, 288, 0, (fe) null);
        String var7 = null;
        int var3 = 0;
        vf var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_O = param0;
          this.field_Q = new rg(gi.field_fb, (uk) null);
          this.field_Q.field_n = (fe) ((Object) new je());
          var7 = b.a(new String[]{this.k(-99), this.l(99)}, ja.field_g, 1177);
          var3 = 20;
          var4 = new vf(gm.field_cb, 0, 0, 0, 0, 16777215, -1, 3, 0, gm.field_cb.field_C, -1, 2147483647, true);
          this.field_R = new na(var7, var4);
          this.field_R.field_C = "";
          this.field_R.a(0, (byte) 9, om.field_o);
          this.field_R.a(1, (byte) 9, om.field_o);
          this.field_R.field_t = (uk) (this);
          this.field_R.field_F = -40 + this.field_F;
          this.field_R.b(var3, 26, this.field_F - 40, 8888);
          var3 = var3 + (15 + this.field_R.field_z);
          this.b(this.field_R, 10);
          var5 = 4;
          var6 = 200;
          this.field_Q.a(-121, var6, var3, 40, 300 - var6 >> 1);
          this.field_Q.field_t = (uk) (this);
          this.b(this.field_Q, 10);
          this.a(-126, 300, 0, var5 + (var3 + 55), 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void j(int param0) {
        int var2 = 0;
        int var1 = hn.d(24860);
        if (param0 == -1101556575) {
          var2 = gh.a(true);
          kn.field_d.a(-ll.field_a + uh.field_c, ef.field_sb - g.field_n, (byte) 103, (ll.field_a << 1) + var2, var1 + (g.field_n << 1));
          na.f(0);
          return;
        }
    }

    private final String l(int param0) {
        if (param0 != 99) {
          return (String) null;
        }
        return "</col></u>";
    }

    static {
        field_T = new al("email");
        field_U = new int[]{4, 11, 6, 8};
        field_P = "Shield restored";
        field_H = 64;
    }
}
