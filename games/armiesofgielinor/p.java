/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    private kl field_g;
    static String field_d;
    static int field_b;
    static wd field_a;
    static String field_i;
    static String field_f;
    private kl field_h;
    private bg field_e;
    static String field_c;
    private bg field_j;

    private final sn a(String param0, String param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        sn stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_g.a(param1, 125);
          if (var5_int < param2) {
            stackIn_2_0 = null;
            return (sn) (stackIn_2_0);
          }
          var6 = this.field_g.a((byte) 119, var5_int, param0);
          if (var6 < 0) {
            return null;
          }
          stackIn_7_0 = this.a(param2 ^ 0, param3, var6, var5_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("p.E(");
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
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final sn a(boolean param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        sn stackIn_2_0 = null;
        sn stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_g.e(-113) == 1) {
            stackIn_2_0 = this.a(0, param1, param2, 0);
            return stackIn_2_0;
          }
          if (1 == this.field_g.d(param2, -2)) {
            stackIn_6_0 = this.a(0, param1, 0, param2);
            return stackIn_6_0;
          }
          if (!param0) {
            field_a = (wd) null;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("p.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final sn a(byte param0, String param1, String param2) {
        RuntimeException var4 = null;
        java.applet.Applet var5 = null;
        sn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -125) {
            var5 = (java.applet.Applet) null;
            p.a(-46, (java.applet.Applet) null);
          }
          stackIn_3_0 = this.a((int[]) null, (byte) 115, param2, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("p.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final sn b(int param0, int[] param1, int param2, int param3) {
        sn stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        sn stackIn_17_0 = null;
        sn stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sn var8 = null;
        qs var9 = null;
        sn var8Lifetime1;
        try {
          var5_int = param3 ^ (65532 & param2 << 4 | param2 >>> 12);
          var5_int = var5_int | param2 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (sn) (this.field_j.a(-56, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != null &&
            0 >= param1[0]) {
            stackIn_6_0 = null;
            return (sn) (stackIn_6_0);
          }
          var9 = (qs) (this.field_e.a(param0 + 648691672, var6));
          if (var9 == null) {
            var9 = qs.a(this.field_h, param2, param3);
            if (var9 == null) {
              stackIn_10_0 = null;
              return (sn) (stackIn_10_0);
            }
            this.field_e.a(var9, var6, param0 + 648691834);
          }
          var8Lifetime1 = var9.a(param1);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.d(param0 + 648691815);
          if (param0 != -648691772) {
            stackIn_17_0 = (sn) null;
            return stackIn_17_0;
          }
          this.field_j.a(var8Lifetime1, var6, 32);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("p.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_i = null;
        field_c = null;
        if (param0 == -58) {
          field_d = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        p.a(114, (java.applet.Applet) null);
        field_d = null;
    }

    private final sn a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sn var8 = null;
        rm var9 = null;
        sn var10 = null;
        sn stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        sn stackIn_12_0 = null;
        sn stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        sn var8Lifetime1;
        try {
          var5_int = (param3 >>> 12 | (1073745919 & param3) << 4) ^ param2;
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (sn) (this.field_j.a(param0 ^ -121, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            stackIn_6_0 = null;
            return (sn) (stackIn_6_0);
          }
          var9 = rm.a(this.field_g, param3, param2);
          if (var9 == null) {
            stackIn_9_0 = null;
            return (sn) (stackIn_9_0);
          }
          if (param0 != 0) {
            stackIn_12_0 = (sn) null;
            return stackIn_12_0;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_j.a(var8Lifetime1, var6, 77);
          if (param1 != null) {
            param1[0] = param1[0] - var10.field_o.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("p.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final sn a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        sn stackIn_2_0 = null;
        sn stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.e(-111) == 1) {
            stackIn_2_0 = this.b(-648691772, param0, 0, param2);
            return stackIn_2_0;
          }
          if (this.field_h.d(param2, -2) == 1) {
            stackIn_6_0 = this.b(-648691772, param0, param2, 0);
            return stackIn_6_0;
          }
          var4_int = 50 % ((param1 + 62) / 45);
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("p.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (param0 != -24602) {
            return;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != wc.a(var3, 0)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("p.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final sn a(String param0, byte param1, String param2) {
        RuntimeException var4 = null;
        sn stackIn_2_0 = null;
        sn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -97) {
            stackIn_4_0 = this.a(param0, param2, param1 + 97, (int[]) null);
            return stackIn_4_0;
          }
          stackIn_2_0 = (sn) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("p.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String a(int param0, int param1, byte param2, int param3) {
        int var4;
        int var5;
        int var5Lifetime1;
        if (0 >= param0) {
          throw new IllegalArgumentException("Can only get ordinal for positive numbers");
        }
        if (0 == param3) {
          var4 = param0 % 100;
          if (var4 < 11) {
            var5 = param0 % 10;
            if (var5 == 1) {
              return param0 + "st";
            }
            if (var5 == 2) {
              return param0 + "nd";
            }
            if (var5 == 3) {
              return param0 + "rd";
            }
            return param0 + "th";
          }
          if (var4 <= 13) {
            return param0 + "th";
          }
          var5Lifetime1 = param0 % 10;
          if (var5Lifetime1 == 1) {
            return param0 + "st";
          }
          if (var5Lifetime1 == 2) {
            return param0 + "nd";
          }
          if (var5Lifetime1 == 3) {
            return param0 + "rd";
          }
          return param0 + "th";
        }
        if (param2 >= -90) {
          field_c = (String) null;
        }
        if (param3 == 1) {
          return param0 + ".";
        }
        if (param3 == 2) {
          if (param0 != 1) {
            return param0 + "ème";
          }
          if (param1 == 2) {
            return param0 + "ère";
          }
          return param0 + "er";
        }
        if (3 != param3) {
          if (param3 == 4) {
            return param0 + "e";
          }
          throw new IllegalArgumentException("Unsupported language " + param3);
        }
        if (2 != param1) {
          return param0 + "º";
        }
        return param0 + "ª";
    }

    p(kl param0, kl param1) {
        this.field_e = new bg(256);
        this.field_j = new bg(256);
        try {
          this.field_g = param0;
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "p.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final sn a(int[] param0, byte param1, String param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        sn stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_h.a(param3, 108);
          if (var5_int < 0) {
            stackIn_2_0 = null;
            return (sn) (stackIn_2_0);
          }
          var6 = this.field_h.a((byte) 119, var5_int, param2);
          if (var6 < 0) {
            return null;
          }
          var7 = -61 / ((param1 - 48) / 33);
          stackIn_7_0 = this.b(-648691772, param0, var5_int, var6);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("p.H(");
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
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_f = "Searching for opponents";
        field_i = "<%0> wins!";
        field_d = "This password contains your email address, and would be easy to guess";
        field_c = "Catalysts that cause units to duplicate.";
    }
}
