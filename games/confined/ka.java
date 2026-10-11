/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka extends pm {
    private double field_O;
    private oi field_I;
    static int field_P;
    static mi field_N;
    private int field_J;
    static volatile int field_L;
    double field_K;
    static byte[] field_F;
    static String field_G;
    gk field_M;

    void a(boolean param0, ee param1) {
        try {
          if (!param0) {
            field_P = -79;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 > -54) {
          this.g((byte) 11);
          return false;
        }
        return false;
    }

    ka(pm param0, double param1, bi param2) {
        this(param0.field_A, param0.field_E, param0.field_t, param0.field_D, param0.field_C * param1, param2);
    }

    final void a(int param0, vg param1) {
        try {
          if (param0 != -1) {
            field_F = (byte[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_K = this.field_K + this.field_O;
        this.field_J = (int)this.field_K;
        if (param0 != 11878) {
          this.a(96, -128);
          if (this.field_J < uc.field_db.length) {
            return;
          }
          this.field_z = true;
          if (null != this.field_M) {
            this.field_M.field_t = null;
            return;
          }
          return;
        }
        if (this.field_J < uc.field_db.length) {
          return;
        }
        this.field_z = true;
        if (null == this.field_M) {
          return;
        }
        this.field_M.field_t = null;
    }

    final boolean c(int param0) {
        if (param0 != 5) {
          field_G = (String) null;
          return false;
        }
        return false;
    }

    void a(int param0, hf param1) {
        try {
          if (param0 >= -29) {
            mb var4 = (mb) null;
            this.a(-79, (mb) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, mb param1) {
        try {
          if (param0 != -23154) {
            this.field_K = -0.9744507612027556;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(mn param0, byte param1) {
        try {
          this.field_I.field_t = this.field_E;
          this.field_I.field_o = this.field_t;
          this.field_I.field_p = this.field_D;
          this.field_I.field_u = this.field_C * (this.field_C * (64.0 / (double)uc.field_db.length)) * ((double)uc.field_db.length - this.field_K);
          int var3_int = -113 % ((-2 - param1) / 62);
          param0.a((rk) (this.field_I), (byte) -108);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean g(byte param0) {
        if (param0 < 64) {
          field_P = -1;
          return false;
        }
        return false;
    }

    void a(int param0, ah param1) {
        try {
          int var3_int = 98 % ((param0 - 14) / 53);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        try {
          if (param2 >= -5) {
            field_G = (String) null;
          }
          this.a(-13, uc.field_db[this.field_J], param1, param3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(mi param0, String param1, int param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.b(param2 + 12)) {
            stackIn_2_0 = (String) (param1);
            return stackIn_2_0;
          }
          if (param2 != -12) {
            field_G = (String) null;
          }
          stackIn_6_0 = param3 + " - " + param0.c(-123) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ka.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(pm param0, int param1) {
        try {
          if (param1 >= -81) {
            this.field_O = 2.3214224287080496;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean k(int param0) {
        if (param0 != -58) {
          return true;
        }
        return in.field_h;
    }

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_6_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param1 != 23617) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              90 >= var5) {
              var3[var4] = (char)(97 + (var5 - 65));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_24_0 = new String(var8);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ka.U(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(boolean param0, il param1) {
        try {
          if (param0) {
            mb var4 = (mb) null;
            this.a(98, (mb) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 72) {
            return false;
          }
          field_G = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ka.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(byte param0, sa param1) {
        try {
          if (param0 != 9) {
            pm var4 = (pm) null;
            this.a((pm) null, 62);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        cl var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (cl) null;
            this.a((cl) null, (byte) -89);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ka.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean i(int param0) {
        if (param0 != 8) {
          field_N = (mi) null;
          return false;
        }
        return false;
    }

    void a(cl param0, byte param1) {
        try {
          int var3_int = -120 / ((-35 - param1) / 60);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ka(hn param0, double param1, double param2, double param3, double param4, bi param5) {
        super(param0, param1, param2, param3, param4);
        RuntimeException var11 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_J = 0;
        this.field_K = 0.0;
        this.field_I = new oi((pm) (this));
        try {
          this.field_O = (double)uc.field_db.length / (Math.pow(param4, 0.3333333333333333) * 64.0);
          if (param5 == null) {
            return;
          }
          this.field_M = new gk((pm) (this), param5, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_7_0 = var11;
          stackIn_7_1 = new StringBuilder().append("ka.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void l(int param0) {
        if (param0 != 0) {
          field_P = 76;
          field_G = null;
          field_N = null;
          field_F = null;
          return;
        }
        field_G = null;
        field_N = null;
        field_F = null;
    }

    final void a(hm param0, boolean param1) {
        try {
          if (!param1) {
            field_F = (byte[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(kh param0, int param1) {
        try {
          if (param1 <= 122) {
            field_N = (mi) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ka.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean h(byte param0) {
        ag.field_h = true;
        int var1 = -51 / ((param0 - 22) / 43);
        ec.field_e = ri.a(-3) + 15000L;
        return rk.field_e == 11 ? true : false;
    }

    static {
        field_L = 0;
        field_G = "Error connecting to server. Please try using a different server.";
    }
}
