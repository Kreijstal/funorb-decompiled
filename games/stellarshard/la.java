/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends g implements ec, oi {
    private boolean field_N;
    static th field_O;
    private ig field_E;
    static oj field_I;
    private boolean field_P;
    private ae field_K;
    private boolean field_M;
    private ig field_J;
    private ae field_Q;
    private ig field_D;
    private String field_G;
    static mj field_B;
    static java.awt.Frame field_L;

    la(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (uk) null);
        kg dupTemp$0 = null;
        kg dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        ig stackIn_18_1 = null;
        ig stackIn_18_2 = null;
        ig stackIn_19_1 = null;
        ig stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        b var6 = null;
        RuntimeException var6_ref = null;
        bd var7 = null;
        String var8 = null;
        bh var9 = null;
        kg var12 = null;
        kg var13 = null;
        try {
          this.field_G = param1;
          stackIn_4_1 = (param3);
          this.field_M = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_N = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_P = stackIn_10_1;
          if (this.field_P && (this.field_M ||
            this.field_N)) {
            throw new IllegalStateException();
          }
          this.field_Q = (ae) ((Object) new pl(param0, (lf) (this), 100));
          this.field_K = (ae) ((Object) new pl("", (lf) (this), 20));
          if (!this.field_P) {
            this.field_D = new ig(oj.field_a, (lf) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_N) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = bk.field_e;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = o.field_c;
            }
            this.field_J = new ig(stackIn_19_3, (lf) null);
            if (this.field_M) {
              this.field_E = new ig(gk.field_g, (lf) (this));
            }
          } else {
            this.field_D = new ig(qb.field_l, (lf) null);
            this.field_J = new ig(wc.field_z, (lf) null);
            this.field_Q.field_E = false;
          }
          this.field_Q.field_u = (uk) ((Object) new vg(10000536));
          this.field_K.field_u = (uk) ((Object) new il(10000536));
          var6 = new b();
          this.field_D.field_u = (uk) ((Object) var6);
          if (this.field_J != null) {
            this.field_J.field_u = (uk) ((Object) var6);
          }
          if (null != this.field_E) {
            this.field_E.field_u = (uk) ((Object) var6);
          }
          this.field_Q.field_x = k.field_a;
          if (this.field_E != null) {
            this.field_E.field_x = hi.field_c;
          }
          if (!this.field_P) {
            if (this.field_N) {
              this.field_J.field_x = ua.field_f;
              this.field_J.field_u = (uk) ((Object) new ll());
            } else {
              this.field_J.field_u = (uk) ((Object) new ll());
            }
          } else {
            this.field_J.field_x = fk.field_q;
          }
          this.field_k = 15;
          var7 = si.field_V;
          if (null != this.field_G) {
            this.field_k = this.field_k + (5 + var7.b(this.field_G, -40 + this.field_p, var7.field_N));
          }
          var8 = k.field_c;
          var9 = ml.a(hf.a((byte) -15), (byte) -122);
          if (kk.field_k == var9) {
            var8 = dd.field_h;
          } else {
            if (var9 == ak.field_d) {
              var8 = al.field_e;
            }
          }
          dupTemp$0 = new kg(10, this.field_k, -20 + this.field_p, 25, this.field_Q, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b(4, dupTemp$0);
          this.field_k = this.field_k + (5 + ((rj) ((Object) var12)).field_t);
          dupTemp$1 = new kg(10, this.field_k, -20 + this.field_p, 25, this.field_K, false, 80, 3, var7, 16777215, th.field_b);
          var13 = dupTemp$1;
          this.b(4, dupTemp$1);
          this.field_D.field_v = (lf) (this);
          this.field_k = this.field_k + (((rj) ((Object) var13)).field_t + 5);
          if (this.field_E != null) {
            this.field_E.field_v = (lf) (this);
          }
          if (this.field_J != null) {
            this.field_J.field_v = (lf) (this);
          }
          if (this.field_E == null) {
            this.field_D.b(-10 + (this.field_p - 6), 8, this.field_k, 30, 23987);
            this.field_k = this.field_k + 35;
          } else {
            this.field_D.b(-95 + this.field_p, 85, this.field_k, 30, 23987);
            this.field_k = this.field_k + 60;
          }
          if (this.field_E != null) {
            this.field_E.b(-6 + this.field_p - 10, 8, this.field_k, 30, 23987);
            this.field_k = this.field_k + 35;
          }
          if (this.field_J != null) {
            if (!this.field_P &&
              !this.field_N) {
              this.field_J.b(40, 8, this.field_k, 20, 23987);
              this.field_k = this.field_k + 25;
            } else {
              this.field_J.b(-10 + this.field_p - 6, 8, this.field_k, 30, 23987);
              this.field_k = this.field_k + 35;
            }
          }
          this.b(this.field_p, 0, 0, 3 + this.field_k, 23987);
          this.b(4, this.field_D);
          if (this.field_E != null) {
            this.b(4, this.field_E);
          }
          if (this.field_J != null) {
            this.b(4, this.field_J);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("la.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void e(byte param0) {
        int var2 = 114 / ((param0 + 74) / 33);
        this.field_Q.d(true);
        this.field_K.d(true);
    }

    final String f(byte param0) {
        if (null == this.field_Q.field_m) {
          return "";
        }
        int var2 = -67 % ((param0 + 6) / 54);
        return this.field_Q.field_m;
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = stellarshard.field_B;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; param2 > var4; var4++) {
          var6[var4] = param1;
        }
        if (param0 < 64) {
          field_I = (oj) null;
        }
        return new String(var3);
    }

    public final void b(ae param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_Q) {
            this.field_K.a(-2147483648, (rj) (this));
          }
          if (this.field_K == param0) {
            this.g((byte) 107);
          }
          if (param1 != 0) {
            la.a(-12, 'ﾋ', 44);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("la.W(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char[] var4 = null;
        int var6 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          var3 = 91 % ((35 - param1) / 34);
          var2_int = param0.length();
          var4 = new char[var2_int];
          for (var5 = 0; var5 < var2_int; var5++) {
            var4[-var5 + (var2_int - 1)] = param0.charAt(var5);
          }
          stackIn_5_0 = new String(var4);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("la.FB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0 ^ 0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.a(param3, -8666);
            return stackIn_7_0;
          }
          if (param0 != 29657) {
            this.f((byte) -128);
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_13_0 = this.a(param3, (byte) -45);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("la.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void a(ae param0, int param1) {
        try {
          if (param1 != 0) {
            field_O = (th) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "la.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (null != this.field_G) {
          si.field_V.a(this.field_G, param3 + this.field_w + 20, 15 + this.field_k + param2, this.field_p - 40, this.field_t, 16777215, -1, 1, 0, si.field_V.field_N);
        }
        if (this.field_E != null) {
          ti.g(param3 + 10, 134 + param2, -20 + this.field_p, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        field_L = null;
        field_I = null;
        field_O = null;
        if (param0 <= 82) {
          la.a(-59);
        }
        field_B = null;
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = stellarshard.field_B;
        try {
          if (param3) {
            return;
          }
          if (this.field_D != param2) {
            if (this.field_E == param2) {
              ta.a((byte) 91);
            } else {
              if (param2 == this.field_J) {
                if (!this.field_P) {
                  if (!this.field_N) {
                    rk.a(3);
                  } else {
                    cg.a((byte) 57);
                  }
                } else {
                  dg.g(16608);
                }
              }
            }
          } else {
            this.g((byte) 61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("la.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 <= 50) {
          return;
        }
        if (sg.a((byte) 102) ||
          !(this.field_Q.field_m.length() <= 0) &&
          !(this.field_K.field_m.length() <= 0)) {
          rc.a(this.field_K.field_m, this.field_Q.field_m, true);
        }
    }

    final void b(String param0, int param1) {
        ae var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_Q;
          var4 = param0;
          var3.a((byte) 20, var4, false);
          this.field_K.d(true);
          if (param1 != 15) {
            field_L = (java.awt.Frame) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("la.DB(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_O = new th();
        oj discarded$0 = new oj();
    }
}
