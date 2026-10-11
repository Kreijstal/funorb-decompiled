/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql implements ol {
    private int field_c;
    static String field_e;
    private int field_l;
    static String field_o;
    static int field_t;
    static boolean field_d;
    static String field_i;
    static String field_j;
    private int field_b;
    static String field_f;
    private int field_a;
    static String field_k;
    static String field_p;
    static String field_s;
    private int field_h;
    private int field_n;
    private int field_r;
    static ha field_q;
    static eh field_m;
    private e field_g;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 <= 74) {
          field_o = (String) null;
        }
        cm.field_h.a(param1, param5, param2, (byte) -105, param4);
        if (null != dk.field_v) {
          dk.field_v.a(param6, param3, param3 - bf.field_o, param5, param5, 0);
        }
    }

    final static String[] a(String param0, byte param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var11 = (CharSequence) ((Object) param0);
          var3_int = gg.a(var11, param2, param1 + 139);
          var4 = new String[var3_int + 1];
          var5 = 0;
          if (param1 != -123) {
            var10 = (String) null;
            ql.a(110, (String) null, (String) null);
          }
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ql.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -89) {
            return false;
          }
          if (jd.a(-685, param2)) {
            return false;
          }
          if (al.a(param2, 125)) {
            return false;
          }
          if (we.a((byte) 12, param2)) {
            return false;
          }
          if (param1.length() == 0) {
            return true;
          }
          if (mj.a(param2, param1, (byte) 113)) {
            return false;
          }
          if (me.a(param2, param1, true)) {
            return false;
          }
          if (!w.a(param2, param1, false)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("ql.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static java.awt.Frame a(int param0, int param1, pd param2, int param3, int param4, boolean param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        String var10 = null;
        ch[] var11 = null;
        un var12 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          if (!param2.b(121)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (param4 == 0) {
            var11 = eh.a(105, param2);
            var6 = var11;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var11.length; var8++) {
              if (var11[var8].field_c == param3 &&
                param1 == var11[var8].field_k && ((param0 == 0 ||
                var11[var8].field_d == param0) &&
                (var7_int == 0 ||
                !(var11[var8].field_g <= param4)))) {
                param4 = var11[var8].field_g;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              stackIn_27_0 = null;
              return (java.awt.Frame) (stackIn_27_0);
            }
          }
          if (param5) {
            var10 = (String) null;
            ql.a((String) null, (byte) 7, '￞');
          }
          var12 = param2.a(param0, param4, param3, 1289287280, param1);
          while (var12.field_a == 0) {
            mm.a(-25, 10L);
          }
          var7 = (java.awt.Frame) (var12.field_f);
          if (var7 == null) {
            stackIn_35_0 = null;
            return (java.awt.Frame) (stackIn_35_0);
          }
          if (2 != var12.field_a) {
            stackIn_40_0 = var7;
            return stackIn_40_0;
          }
          ah.a((byte) 71, param2, var7);
          stackIn_38_0 = null;
          return (java.awt.Frame) (stackIn_38_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_43_0 = var6_ref;
          stackIn_43_1 = new StringBuilder().append("ql.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        qn var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var14 = param1 instanceof qn ? (qn) (param1) : null;
          df.b(param0 + param1.field_l, param3 + param1.field_u, param1.field_g, param1.field_m, this.field_h);
          if (var14 == null) {
          }
          var7 = var14.field_M + (param0 + param1.field_l);
          var8 = var14.field_N + (param3 + param1.field_u);
          df.c(var7, var8, var14.field_F, this.field_c);
          if (-1 != var14.field_O) {
            var9 = 2.0 * ((double)var14.field_O * 3.141592653589793) / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            df.c(var11 + var7, var12 + var8, 1, this.field_r);
          }
          if (param4 != -23294) {
            ql.a((byte) -39, -110, 72, -97, -121, -28, 103);
          }
          df.c(var7, var8, 2, 1);
          var9Lifetime1 = 3.141592653589793 * (double)var14.field_G * 2.0 / (double)var14.field_Q;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_F);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_F);
          df.a(var7, var8, var11Lifetime1 + var7, var8 + var12Lifetime1, 1);
          if (null != this.field_g) {
            var13 = var14.field_F + var14.field_M + this.field_b;
            this.field_g.a(param1.field_n, var13 + (param1.field_l + param0), param1.field_u + param3 + this.field_n, -var13 + (-this.field_b + param1.field_g), param1.field_m - (this.field_b << 1), this.field_l, this.field_a, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ql.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_m = null;
        field_k = null;
        field_e = null;
        field_p = null;
        if (param0 > -76) {
          field_p = (String) null;
        }
        field_q = null;
        field_s = null;
        field_j = null;
        field_o = null;
        field_f = null;
    }

    ql(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_a = param4;
          this.field_b = param1;
          this.field_c = param5;
          this.field_r = param6;
          this.field_n = param2;
          this.field_l = param3;
          this.field_h = param7;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_e = "Advertising websites";
        field_i = "Chat view has been scrolled up. Scroll down to chat.";
        field_o = "Go Back";
        field_d = true;
        field_f = "Show private chat from my friends and opponents";
        field_k = "You cannot add yourself!";
        field_s = "Lost";
        field_j = "Options Menu";
        field_t = 200;
        field_p = "Show lobby chat from my friends";
    }
}
