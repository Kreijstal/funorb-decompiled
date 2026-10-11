/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends kca {
    static int field_m;
    static int field_n;
    private tra field_j;
    static int field_l;
    private tra field_o;
    static String[] field_k;

    final static void b(byte param0) {
        if (tga.field_a == null) {
          return;
        }
        tga.field_a.a(true);
        if (param0 < 91) {
          return;
        }
        tga.field_a = null;
    }

    final static qca a(pr[] param0, kda param1, int param2) {
        int var3_int = 0;
        Object stackIn_25_0 = null;
        qca stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < param0.length; var3_int++) {
            if (param0[var3_int] == null) {
              return null;
            }
            if (0L >= param0[var3_int].field_c) {
              return null;
            }
          }
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; var5 < param0.length; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, param0[var5].field_c);
          }
          if (param2 != 1) {
            field_l = 12;
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, gba.field_f, 0);
          if (0 == gba.field_f[0]) {
            if (0 == gba.field_f[0]) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, gba.field_f, 1);
            if (gba.field_f[1] > 1) {
              var11 = new byte[gba.field_f[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, gba.field_f[1], gba.field_f, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (0 == gba.field_f[0]) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (var7 < param0.length) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, param0[var7].field_c);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_25_0 = null;
              return (qca) (stackIn_25_0);
            }
          }
          stackIn_27_0 = new qca(param1, var3_long, param0);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("jm.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static long a(CharSequence param0, int param1) {
        int var6 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var4 = 82 / ((-66 - param1) / 51);
          var2_long = 0L;
          var5 = param0.length();
          for (var6 = 0; var6 < var5; var6++) {
            var2_long = var2_long * 37L;
            var7 = param0.charAt(var6);
            if (var7 >= 65 &&
              var7 <= 90) {
              var2_long = var2_long + (long)(-65 + (var7 + 1));
            } else if (97 <= var7 &&
              var7 <= 122) {
              var2_long = var2_long + (long)(-97 + var7 + 1);
            } else {
              if (var7 >= 48 &&
                57 >= var7) {
                var2_long = var2_long + (long)(var7 - 21);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_21_0 = var2_long;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("jm.G(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -33) {
            this.field_j = (tra) null;
          }
          var3 = this.field_j.field_o.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              -1 + var3.length() > var5) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              stackIn_14_0 = (0 <= var4.indexOf(var7));
              return stackIn_14_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("jm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_o.field_o.toLowerCase();
          var4 = param1.toLowerCase();
          if (param0 == ~var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (ld.a(false, var5)) {
            stackIn_5_0 = dva.field_a;
            return stackIn_5_0;
          }
          if (qda.a((byte) -72, var5)) {
            stackIn_8_0 = qqa.field_o;
            return stackIn_8_0;
          }
          if (eba.a(var5, 6912)) {
            stackIn_11_0 = hf.field_e;
            return stackIn_11_0;
          }
          if (this.b(-37, param1)) {
            stackIn_15_0 = waa.field_e;
            return stackIn_15_0;
          }
          if (var6.length() <= 0) {
            stackIn_18_0 = pv.field_m;
            return stackIn_18_0;
          }
          if (ne.a(true, var5, var6)) {
            stackIn_21_0 = kl.field_j;
            return stackIn_21_0;
          }
          if (kv.a((byte) 55, var5, var6)) {
            stackIn_25_0 = wl.field_h;
            return stackIn_25_0;
          }
          if (!jea.a(true, var5, var6)) {
            return dva.field_a;
          }
          stackIn_29_0 = kl.field_j;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("jm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    jm(tra param0, tra param1, tra param2) {
        super(param0);
        try {
          this.field_o = param1;
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_k = null;
        if (param0) {
          jm.b(false);
        }
    }

    final it a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        it stackIn_2_0 = null;
        it stackIn_6_0 = null;
        it stackIn_10_0 = null;
        it stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14) {
            stackIn_2_0 = (it) null;
            return stackIn_2_0;
          }
          var3 = this.field_o.field_o.toLowerCase();
          var4 = param1.toLowerCase();
          if (0 == var4.length()) {
            stackIn_6_0 = fp.field_c;
            return stackIn_6_0;
          }
          if (!jg.a(-102, var3, var4)) {
            stackIn_10_0 = fp.field_c;
            return stackIn_10_0;
          }
          if (!this.b(param0 - 123, param1)) {
            return uh.field_k;
          }
          stackIn_14_0 = fp.field_c;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("jm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_n = 2147483647;
        field_m = 0;
        field_l = 2097152;
        field_k = new String[]{"88b346", "4879b4", "b64848", "9e47b4"};
    }
}
