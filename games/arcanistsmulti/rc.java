/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    float field_b;
    static String field_o;
    static qb field_h;
    private int field_e;
    static String field_f;
    private int field_p;
    static String field_g;
    private ta[] field_c;
    private int field_q;
    String field_j;
    static String field_n;
    static eg field_a;
    static int field_m;
    static String field_l;
    static qb[] field_k;
    static ll[] field_d;
    static String field_i;

    private final void a(ta param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param1 / 100.0f + (float)(this.field_q + 1);
          if (param2 > -107) {
            return;
          }
          this.field_b = var4_float * (float)this.field_p / (float)(1 + this.field_e);
          if (param1 != 0) {
            this.field_j = param0.field_f + " - " + param1 + "%";
            return;
          }
          this.field_j = param0.field_j;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rc.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        if (param0 == -1321) {
          return null != tc.field_A ? true : false;
        }
        field_a = (eg) null;
        return null != tc.field_A ? true : false;
    }

    final static lg a(eg param0, int param1, String param2, String param3, eg param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        lg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -24755) {
            field_n = (String) null;
          }
          var5_int = param4.c(param2, 105);
          var6 = param4.a(param3, (byte) 73, var5_int);
          stackIn_3_0 = kn.a(param4, var5_int, true, var6, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("rc.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(ec param0, int param1, int param2, int param3, ec param4, int param5) {
        try {
          la.field_d = param2;
          da.field_c = param5;
          bm.field_h = param3;
          if (param1 != 120) {
            field_n = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "rc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_o = null;
        field_g = null;
        field_h = null;
        field_i = null;
        field_l = null;
        field_n = null;
        field_k = null;
        field_d = null;
        if (param0 == -1) {
          field_f = null;
          return;
        }
        field_k = (qb[]) null;
        field_f = null;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param1 == -30218) {
          ma.field_N = param0;
          if (ea.field_F != jo.field_e) {
            var2 = ea.field_F * ea.field_F;
            var3 = var2 - jo.field_e * jo.field_e;
            param0 = param0 + var3 * (vd.field_k - param0) / var2;
          }
          n.field_g.a(640, sa.field_Hb, param0, 120, (byte) -120);
          jd.a(5, vd.field_k - 24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
          return;
        }
        CharSequence var4 = (CharSequence) null;
        rc.a((byte) 20, (CharSequence) null, -57);
        ma.field_N = param0;
        if (ea.field_F != jo.field_e) {
          var2Lifetime1 = ea.field_F * ea.field_F;
          var3Lifetime1 = var2Lifetime1 - jo.field_e * jo.field_e;
          param0 = param0 + var3Lifetime1 * (vd.field_k - param0) / var2Lifetime1;
        }
        n.field_g.a(640, sa.field_Hb, param0, 120, (byte) -120);
        jd.a(5, vd.field_k - 24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
          CharSequence var2 = (CharSequence) null;
          rc.a((byte) 9, (CharSequence) null, 44);
          return ri.a(-97);
        }
        return ri.a(-97);
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -52 % ((param0 - 7) / 60);
          stackIn_1_0 = fn.a(true, (byte) -40, param1, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("rc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean d(int param0) {
        ta var2;
        int var3;
        ec var4;
        ta var5;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 78) {
          var4 = (ec) null;
          rc.a((ec) null, -3, -38, 35, (ec) null, -83);
        }
        while (this.field_q < this.field_e) {
          var5 = this.field_c[this.field_q];
          var2 = var5;
          if (!var5.field_c.c(-10923)) {
            this.a(var5, 0, -123);
            return false;
          }
          if (var5.field_h >= 0 &&
            !var5.field_c.a(true, var5.field_h)) {
            this.a(var2, var5.field_c.a(var5.field_h, -23760), -112);
            return false;
          }
          if (var5.field_g != null &&
            !var5.field_c.a(var5.field_g, -24417)) {
            this.a(var2, var5.field_c.b(var5.field_g, 108), -126);
            return false;
          }
          if (var5.field_h < 0 &&
            var5.field_g == null &&
            var5.field_f != null &&
            !var5.field_c.a(-105)) {
            this.a(var2, var5.field_c.a((byte) -116), -118);
            return false;
          }
          this.field_q = this.field_q + 1;
        }
        return true;
    }

    private rc() throws Throwable {
        throw new Error();
    }

    static {
        field_o = "Hide players in <%0>'s game";
        field_f = "Targeted spells:";
        field_g = "Year";
        field_h = new qb(540, 140);
        field_n = "Just play";
        field_l = "You cannot cast Vine Bridge while flying, land to cast it";
        field_i = "<br><br>Your familiar is already at maximum power.";
    }
}
