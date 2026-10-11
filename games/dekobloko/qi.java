/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qi extends ek {
    private pk field_P;
    static String field_L;
    private String[] field_K;
    private vj field_O;
    static vj field_Q;
    static vj field_S;
    static String field_N;
    static String field_T;
    static ck field_R;
    static boolean field_M;

    String c(byte param0) {
        if (null == this.field_P) {
          return null;
        }
        if (null == this.field_K) {
          return null;
        }
        if (this.field_K.length <= this.field_P.field_p) {
          return null;
        }
        if (param0 != 113) {
          return (String) null;
        }
        return this.field_K[this.field_P.field_p];
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = -125 % ((-61 - param0) / 43);
        this.b(((nl) ((Object) this.field_p)).a((ce) (this), -125), param3, param1, param2, -16555);
    }

    final static void a(boolean param0, byte param1) {
        if (lk.field_F) {
          h.field_d = uh.a(j.field_d, param0, !gk.field_Ib ? 1 : 2, -104);
          return;
        }
        if (mg.field_Zb) {
          cl.field_B = qj.a(-21, param0);
          return;
        }
        if (fm.field_e) {
          am.field_a = ib.a((byte) -108, param0);
          return;
        }
        if (he.field_db) {
          jm.a(0, param0);
          he.field_db = false;
          return;
        }
        if (ob.field_k) {
          tj.a(param0, 111);
          gi.field_b = true;
          ob.field_k = false;
          return;
        }
        kf.field_G.c(-1, param0);
        if (param1 >= -99) {
          qi.h(-32);
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, 48, param2, param3);
          this.field_P = null;
          if (this.field_q) {
            var5_int = -this.field_u + (bh.field_g - param3);
            var6 = pm.field_f - (param2 + this.field_D);
            this.field_P = this.a(1, var6, var5_int);
          }
          if (param1 < 38) {
            this.field_K = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("qi.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (param2 != 1) {
            return;
          }
          if (null == this.field_K ||
            param1 >= this.field_K.length) {
            var7 = new String[param1 + 1];
            var8 = var7;
            var4 = var8;
            if (null != this.field_K) {
              for (var5 = 0; this.field_K.length > var5; var5++) {
                var7[var5] = this.field_K[var5];
              }
            }
            this.field_K = var8;
          }
          this.field_K[param1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("qi.J(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, -128, param2, param3);
        if (param1 >= -103) {
          this.a(112);
        }
        if (param2 != 0) {
          return;
        }
        nl var9 = (nl) ((Object) this.field_p);
        pk var6 = this.field_P;
        if (var6 == null) {
        } else {
          var7 = var9.a((byte) 24, (ce) (this), param0);
          var8 = var9.a(param3, 0, (ce) (this));
          do {
            kd.a(2 + var6.field_n, var6.field_t + (var7 - 2), (byte) -128, -2 + (var6.field_u + var8), var6.field_s + 2);
            var6 = var6.field_o;
          } while (var6 != null);
        }
    }

    final static w e(byte param0) {
        int var1 = 48 / ((64 - param0) / 52);
        return qa.d(5);
    }

    final static void a(float param0, int param1, String param2) {
        try {
          cg.field_d = param0;
          he.field_hb = param2;
          int var3_int = 79 / ((-18 - param1) / 58);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "qi.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final pk a(int param0, int param1, int param2) {
        pk var4;
        pk var5;
        int var6;
        ce var7;
        var6 = client.field_A ? 1 : 0;
        var4 = (pk) (this.field_O.c((byte) 49));
        if (param0 != 1) {
          var7 = (ce) null;
          this.a((ce) null, 8, -16, -10);
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param2 >= var5.field_t &&
              var5.field_u <= param1 &&
              param2 < var5.field_n + var5.field_t &&
              var5.field_u + var5.field_s >= param1) {
              return var4;
            }
            var5 = var5.field_o;
          }
          var4 = (pk) (this.field_O.d(true));
        }
        return null;
    }

    public static void f(byte param0) {
        field_R = null;
        field_S = null;
        field_L = null;
        int var1 = -63 % ((-30 - param0) / 38);
        field_T = null;
        field_N = null;
        field_Q = null;
    }

    boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          field_N = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qi.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        hm.a(param0, (byte) -104);
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -this.field_u + param0;
        int var6 = param1 - this.field_D;
        pk var7 = this.a(1, var6, var5);
        if (var7 != null) {
          if (null != this.field_v) {
            ((rl) ((Object) this.field_v)).a(this, param2, -118, var7.field_p);
          } else {
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(2874);
    }

    final void a(int param0) {
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        nl var3;
        cf var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        nf var12;
        int var13;
        int var14;
        pk var15;
        int var16;
        int var7Lifetime1;
        var16 = client.field_A ? 1 : 0;
        this.field_O = new vj();
        var2 = 0;
        if (param0 != 2874) {
          field_S = (vj) null;
        }
        var3 = (nl) ((Object) this.field_p);
        var4 = var3.a((ce) (this), (byte) 117);
        while (true) {
          var5 = this.field_E.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_E.indexOf(">", var5);
          var6 = this.field_E.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_E.indexOf("</hotspot>", var5);
          var8 = var4.a(false, var5);
          var9 = var4.a(false, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_a[var11];
            if (var11 != var8) {
              stackIn_9_0 = var12.field_a[0];
            } else {
              stackIn_9_0 = var4.a((byte) -94, var5);
            }
            var13 = stackIn_9_0;
            if (var9 != var11) {
              if (var12 != null) {
                stackIn_14_0 = var12.field_a[var12.field_a.length - 1];
              } else {
                stackIn_14_0 = 0;
              }
            } else {
              stackIn_14_0 = var4.a((byte) -94, var2);
            }
            var14 = stackIn_14_0;
            var15 = new pk(var7Lifetime1, var13, var12.field_c, var14 - var13, Math.max(var3.a((byte) -120), -var12.field_c + var12.field_i));
            if (var10 != null) {
              ((pk) (var10)).field_o = var15;
            }
            this.field_O.a(var15, 2777);
            var10 = var15;
          }
        }
    }

    qi(String param0, gl param1) {
        super(param0, (kg) null);
        this.field_P = null;
        try {
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "to over <%0> great games";
        field_L = "Fast Drop Bonus: ";
        field_T = "Checking";
        field_Q = new vj();
        field_R = new ck(270, 70);
    }
}
