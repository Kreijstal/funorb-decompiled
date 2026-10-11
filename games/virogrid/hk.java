/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends km {
    static long field_Kb;
    static int field_Jb;
    static String field_Ib;
    static int field_Hb;
    static String field_Gb;
    private km field_Nb;
    static volatile int field_Mb;
    static String field_Eb;
    km field_Fb;
    static boolean[] field_Lb;
    static e field_Ob;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, mg[] param8, byte param9, mg[] param10, boolean param11, int param12, String param13, e param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        e var16 = null;
        try {
          wm.a(new wg(param8), oe.field_f, param3, qg.field_w, param5, param1, param0, param5, na.field_Hb, param12, param7, param4, new wg(param10), param14, param14, sf.field_I, param9 - 118, la.field_k, param12, jf.field_o);
          fe.a((byte) 45, param11, param2, param6, param13);
          if (param9 != 118) {
            var16 = (e) null;
            hk.a(104, -22, 108, 67, 68, -43, true, 54, (mg[]) null, (byte) 44, (mg[]) null, false, 44, (String) null, (e) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("hk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param14 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var4 = -param2;
        if (null != this.field_Nb) {
          var4 = this.field_Nb.c((byte) 83);
        }
        var5 = -param2;
        if (this.field_Fb != null) {
          var5 = this.field_Fb.a(-param2 + (-var4 - param0) + this.field_K - param0, (byte) 71);
        }
        var6 = param2 + (param0 + var4 - (-var5 - param0));
        if (this.field_K < var6) {
          var5 = var5 + (-var6 + this.field_K);
          var6 = this.field_K;
        }
        if (1 == this.field_lb) {
          param0 = param0 + (this.field_K - var6) / 2;
        }
        if (this.field_lb == 2) {
          param0 = param0 + (this.field_K - var6);
        }
        if (null != this.field_Nb) {
          this.field_Nb.a(param0, this.field_ub, var4, (byte) -100, 0);
          this.field_Nb.field_D = this.field_D;
        }
        if (null != this.field_Fb) {
          this.field_Fb.a(var4 + param0 + param2, this.field_ub, var5, (byte) -96, 0);
          if (this.field_Nb == null) {
            this.field_Fb.field_lb = this.field_lb;
          } else {
            this.field_Fb.field_lb = 0;
          }
          this.field_Fb.field_D = this.field_D;
        }
        if (param1 < -51) {
          return;
        }
        this.b(25, -10, -111);
    }

    public static void d(boolean param0) {
        if (param0) {
          hk.d(true);
          field_Ib = null;
          field_Lb = null;
          field_Gb = null;
          field_Ob = null;
          field_Eb = null;
          return;
        }
        field_Ib = null;
        field_Lb = null;
        field_Gb = null;
        field_Ob = null;
        field_Eb = null;
    }

    final int c(int param0, int param1, int param2) {
        int var5 = 0;
        int var4 = -param1;
        if (param0 <= -76) {
          if (this.field_Nb != null) {
            var4 = this.field_Nb.c((byte) 70);
          }
          var5 = -param1;
          if (this.field_Fb != null) {
            var5 = this.field_Fb.c((byte) 56);
          }
          return param2 + (param1 + param2) - (-var4 - var5);
        }
        return -30;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 == 2) {
          this.a(param1, param5, param0, (byte) -47, param3);
          this.b(param6, -94, param4);
          return;
        }
        field_Ob = (e) null;
        this.a(param1, param5, param0, (byte) -47, param3);
        this.b(param6, -94, param4);
    }

    hk(long param0, km param1, km param2, km param3, mg param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Nb = new km(0L, param2);
            this.field_Nb.field_qb = param4;
            this.a(0, this.field_Nb);
          }
          if (param5 != null) {
            this.field_Fb = new km(0L, param3, param5);
            this.a(0, this.field_Fb);
            this.b((byte) 42);
          } else {
            this.b((byte) 42);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("hk.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_Jb = 0;
        field_Ib = "Rated game";
        field_Gb = "Next";
        field_Mb = 0;
        field_Eb = "Private";
        field_Hb = 0;
    }
}
