/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oh extends jj {
    private int field_ab;
    private qa field_ib;
    private int field_eb;
    private ak field_fb;
    static int field_db;
    private tf field_hb;
    private int field_cb;
    private int field_gb;
    private int field_bb;
    static String field_jb;

    final void l(int param0) {
        if (this.field_fb == null) {
          super.l(param0);
          return;
        }
        if (fl.field_e != this.field_fb) {
          this.a(this.field_ib.field_j + (this.field_gb + 12), (byte) -128, this.field_ib.field_u + 12);
          this.c(this.field_ib, 115);
        } else {
          this.field_hb.field_F = 256;
          this.field_fb = null;
          super.l(param0);
          return;
        }
        this.field_hb.field_F = 256;
        this.field_fb = null;
        super.l(param0);
    }

    final static void a(rh param0, rh param1, boolean param2, byte param3, rh param4) {
        try {
          uc.field_c = pk.a((byte) 68, "");
          uc.field_c.a(false, 10518);
          j.a(param4, param1, param3 ^ 31756, param0);
          if (param3 != 28) {
            oh.c(2, -119, 119);
          }
          mg.a(-125);
          ui.field_kb = ql.field_l;
          cb.field_v = ql.field_l;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "oh.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0) {
        int fieldTemp$0 = 0;
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime1Lifetime1;
        int var2Lifetime1Lifetime2;
        if (null == this.field_fb) {
          var2 = -59 / ((38 - param0) / 49);
          return super.a(-57);
        }
        if (this.field_fb != rk.field_w) {
          if (this.field_fb != fl.field_e) {
            var2Lifetime1 = -59 / ((38 - param0) / 49);
            return super.a(-57);
          }
          fieldTemp$0 = this.field_eb + 1;
          this.field_eb = this.field_eb + 1;
          if (this.field_cb == fieldTemp$0) {
            this.field_fb = null;
            this.field_hb.field_F = 256;
            var2Lifetime1Lifetime1 = -59 / ((38 - param0) / 49);
            return super.a(-57);
          }
          this.field_hb.field_F = (this.field_eb << 8) / this.field_cb;
          var2Lifetime1Lifetime2 = -59 / ((38 - param0) / 49);
          return super.a(-57);
        }
        int fieldTemp$1 = this.field_eb + 1;
        this.field_eb = this.field_eb + 1;
        if (fieldTemp$1 == this.field_ab) {
          this.field_fb = ml.field_I;
          this.a(this.field_bb, 12 + this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), -95);
          this.field_hb.field_F = 0;
          this.field_eb = 0;
          var2Lifetime2 = -59 / ((38 - param0) / 49);
          return super.a(-57);
        }
        this.field_hb.field_F = -((this.field_eb << 8) / this.field_ab) + 256;
        var2Lifetime3 = -59 / ((38 - param0) / 49);
        return super.a(-57);
    }

    final void m(int param0) {
        if (rk.field_w == this.field_fb) {
          return;
        }
        this.field_eb = 0;
        this.field_fb = fl.field_e;
        this.c(this.field_ib, 99);
        this.field_hb.field_F = 0;
        this.field_ib = null;
        int var2 = 89 % ((-56 - param0) / 45);
    }

    oh(f param0, qa param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_u, param1.field_j + (12 + param2));
        try {
          this.field_bb = param4;
          this.field_gb = param2;
          this.field_cb = param3;
          this.field_ab = param3;
          this.c(param1, 98);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void c(qa param0, int param1) {
        if (null != this.field_hb) {
          this.field_hb.c(-1);
        }
        if (param0 != null) {
          param0.a(6, param0.field_u, 6 + this.field_gb, param0.field_j, 80);
          this.field_hb = new tf(param0);
        } else {
          this.field_hb = new tf();
        }
        this.a((qa) (this.field_hb), (byte) -85);
        if (param1 <= 79) {
          return;
        }
        try {
          this.field_ib = null;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "oh.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static dd c(int param0, int param1, int param2) {
        int var6 = fleas.field_A ? 1 : 0;
        dd var7 = new dd(param2, param2);
        dd var3 = var7;
        int var4 = 0;
        int var5 = 73 % ((param0 - 37) / 48);
        while (var3.field_B.length > var4) {
          var7.field_B[var4] = param1;
          var4++;
        }
        return var3;
    }

    public static void f(byte param0) {
        field_jb = null;
        if (param0 >= -86) {
          oh.c(73, 19, -11);
        }
    }

    void d(qa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_ib = param0;
          if (ml.field_I == this.field_fb) {
            this.a(this.field_bb, 12 + this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), 122);
            this.field_eb = 0;
          } else {
            if (this.field_fb != rk.field_w) {
              this.field_eb = 0;
              this.field_fb = rk.field_w;
            }
          }
          if (param1 == 26034) {
            return;
          }
          this.m(-84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("oh.IA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void d(boolean param0) {
        if (!param0) {
          ol.field_d = new ca();
          ak.field_a.d(ol.field_d, 26034);
          return;
        }
        field_jb = (String) null;
        ol.field_d = new ca();
        ak.field_a.d(ol.field_d, 26034);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = fleas.field_A ? 1 : 0;
        if (param8 < param11) {
          if (param0 > param11) {
            pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
          } else {
            if (param0 <= param8) {
              pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
            } else {
              pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
            }
          }
        } else {
          if (param8 < param0) {
            pa.a(param9, param8, param4, param12, param14, param15, param2, param11, param6, param3, param7, gb.field_a, param1, param13, param0, 32679, param10);
          } else {
            if (param0 <= param11) {
              pa.a(param6, param11, param2, param15, param4, param3, param14, param0, param1, param12, param10, gb.field_a, param9, param7, param8, 32679, param13);
            } else {
              pa.a(param1, param0, param2, param12, param14, param3, param4, param11, param6, param15, param7, gb.field_a, param9, param10, param8, param5 ^ 32679, param13);
            }
          }
        }
        if (param5 == 0) {
          return;
        }
        field_jb = (String) null;
    }

    final boolean j(int param0) {
        this.l(-1);
        if (param0 > 70) {
          return super.j(80);
        }
        qa var3 = (qa) null;
        this.d((qa) null, 45);
        return super.j(80);
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0 + 0, param1, param2, param3)) {
            return true;
          }
          if (param0 != -2) {
            this.l(118);
          }
          if (null == this.field_hb) {
            return false;
          }
          if (param1 == 98) {
            this.field_hb.a(param2, -61);
          }
          if (param1 == 99) {
            this.field_hb.a(param2, -70);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("oh.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_db = 50;
        field_jb = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
