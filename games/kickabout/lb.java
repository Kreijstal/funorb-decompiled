/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb extends wi {
    static String[] field_K;
    private String[] field_J;
    static ut field_L;
    static String field_H;
    static String field_G;
    static String field_N;
    private tf field_E;
    static volatile int field_M;
    static boolean field_F;
    private er field_I;

    private final er b(int param0, int param1, int param2) {
        er var4;
        er var5;
        int var6;
        var6 = Kickabout.field_G;
        var4 = (er) (this.field_E.g(24009));
        if (param1 != 2) {
          this.field_I = (er) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param0 >= var5.field_g &&
              param2 >= var5.field_m &&
              var5.field_g + var5.field_e > param0 &&
              var5.field_m + var5.field_f >= param2) {
              return var4;
            }
            var5 = var5.field_j;
          }
          var4 = (er) (this.field_E.c(param1 ^ 35));
        }
        return null;
    }

    final static boolean a(int param0, int param1, int param2) {
        gm var4;
        boolean stackIn_8_0 = false;
        if (param2 != 480) {
          var4 = (gm) null;
          lb.a((gm) null, 69);
        }
        stackIn_8_0 = (20 + param0 > 0) && (param1 > 0) && (param0 - 20 < 640) && (480 > -40 + param1);
        return stackIn_8_0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -this.field_t + param1;
        int var6 = -this.field_g + param2;
        er var7 = this.b(var5, 2, var6);
        if (var7 != null &&
          null != this.field_k) {
          ((qu) ((Object) this.field_k)).a(this, param0, var7.field_i, 40);
        }
    }

    public static void i(int param0) {
        field_L = null;
        field_K = null;
        field_G = null;
        field_N = null;
        field_H = null;
        if (param0 != 9574) {
          field_M = 34;
        }
    }

    final static void a(byte param0, int param1) {
        ml var2 = or.field_d;
        if (param0 != -105) {
          lb.i(83);
        }
        var2.b(param1, (byte) -80);
        var2.a(116, 1);
        var2.a(param0 ^ -32, 2);
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param0 != -1) {
          field_H = (String) null;
        }
        this.a(((ke) ((Object) this.field_r)).b(param0 + 4, (fd) (this)), 1, param2, param1, param3);
    }

    lb(String param0, gj param1) {
        super(param0, (jv) null);
        this.field_I = null;
        try {
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        if (!cq.e(15137)) {
          return;
        }
        try {
          if (param0 != -28153) {
            field_L = (ut) null;
          }
          or.field_d.b(89, (byte) 77);
          or.field_d.field_n = or.field_d.field_n + 2;
          var2_int = or.field_d.field_n;
          or.field_d.a(14190, param1);
          or.field_d.d(or.field_d.field_n - var2_int, 62);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String f(int param0) {
        if (null == this.field_I) {
          return null;
        }
        if (null == this.field_J) {
          return null;
        }
        if (param0 != -1) {
          this.b(112, 119, -84, -8);
        }
        if (this.field_I.field_i >= this.field_J.length) {
          return null;
        }
        return this.field_J[this.field_I.field_i];
    }

    void a(byte param0, fd param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.field_I = null;
          if (this.field_m) {
            var5_int = -param2 + (el.field_A - this.field_t);
            var6 = n.field_m - (param3 + this.field_g);
            this.field_I = this.b(var5_int, 2, var6);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ak a(gm param0, int param1) {
        ak var2 = null;
        RuntimeException var2_ref = null;
        ak stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ak(param1);
          var2.field_m = param0;
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("lb.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1 ^ 0, param2, param3, param4);
        this.a((byte) -41);
        if (param1 != 1) {
          field_H = (String) null;
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          if (param2 != 12082) {
            field_H = (String) null;
          }
          if (this.field_J == null ||
            param1 >= this.field_J.length) {
            var7 = new String[1 + param1];
            var8 = var7;
            var4 = var8;
            if (null != this.field_J) {
              for (var5 = 0; var5 < this.field_J.length; var5++) {
                var7[var5] = this.field_J[var5];
              }
            }
            this.field_J = var8;
          }
          this.field_J[param1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("lb.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(fd param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lb.HA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (int) (char)param1, param2, param3);
        if (0 != param0) {
          return;
        }
        ke var5 = (ke) ((Object) this.field_r);
        er var6 = this.field_I;
        if (var6 != null) {
          var7 = var5.a((fd) (this), param2, -1);
          var8 = var5.a(true, (fd) (this), param3);
          do {
            ob.b(param1 - 63, 2 + var6.field_e, var6.field_m + (var8 - 2), var6.field_f + 2, -2 + (var7 + var6.field_g));
            var6 = var6.field_j;
          } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        ke var3;
        iq var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        qj var12;
        int var13;
        int var14;
        er var15;
        int var16;
        int var7Lifetime1;
        var16 = Kickabout.field_G;
        this.field_E = new tf();
        var2 = 0;
        var3 = (ke) ((Object) this.field_r);
        var4 = var3.a(param0 ^ -4996, (fd) (this));
        if (param0 != -41) {
          field_H = (String) null;
        }
        while (true) {
          var5 = this.field_q.indexOf("<hotspot=", var2);
          if (-1 == var5) {
            return;
          }
          var7 = this.field_q.indexOf(">", var5);
          var6 = this.field_q.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_q.indexOf("</hotspot>", var5);
          var8 = var4.a(param0 + 41, var5);
          var9 = var4.a(0, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_c[var11];
            if (var11 == var8) {
              stackIn_9_0 = var4.b(0, var5);
            } else {
              stackIn_9_0 = var12.field_b[0];
            }
            var13 = stackIn_9_0;
            if (var11 == var9) {
              stackIn_14_0 = var4.b(param0 + 41, var2);
            } else {
              if (var12 != null) {
                stackIn_14_0 = var12.field_b[-1 + var12.field_b.length];
              } else {
                stackIn_14_0 = 0;
              }
            }
            var14 = stackIn_14_0;
            var15 = new er(var7Lifetime1, var13, var12.field_g, -var13 + var14, Math.max(var3.a((byte) -76), -var12.field_g + var12.field_d));
            if (var10 != null) {
              ((er) (var10)).field_j = var15;
            }
            var10 = var15;
            this.field_E.a(var15, param0 + 44);
          }
        }
    }

    static {
        field_K = new String[]{"Auto-Switch: Off", "Auto-Switch: On"};
        field_H = "Tips";
        field_N = "Names cannot contain consecutive spaces";
        field_M = 0;
        field_G = "Use this alternative as your account name";
    }
}
