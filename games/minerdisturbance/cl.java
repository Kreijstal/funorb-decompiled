/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends kn implements wg, sh {
    static int field_T;
    private hc field_S;
    private hc field_J;
    private boolean field_K;
    private boolean field_N;
    private boolean field_O;
    private ui field_L;
    static int field_I;
    private String field_R;
    private ui field_P;
    static String field_M;
    private hc field_Q;

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            if (param3 != 310) {
              field_M = (String) null;
            }
            var4 = param0.getGraphics();
            bj.field_e.a(param1, param3 - 197, var4, param2);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("cl.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void n(int param0) {
        if (param0 != -6) {
          this.n(68);
        }
        this.field_P.f((byte) 112);
        this.field_L.f((byte) 112);
    }

    final void a(String param0, int param1) {
        ui var3 = this.field_P;
        String var4 = param0;
        var3.a(false, false, var4);
        if (param1 < 50) {
          return;
        }
        try {
          this.field_L.f((byte) 112);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "cl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void r(int param0) {
        int var2;
        if (dl.a(55) ||
          !(this.field_P.field_s.length() <= 0) &&
          !(0 >= this.field_L.field_s.length())) {
          sj.a(this.field_L.field_s, 19260, this.field_P.field_s);
        }
        var2 = 33 % ((param0 - 78) / 45);
    }

    public final void b(ui param0, int param1) {
        try {
          if (param1 != 60) {
            hc var4 = (hc) null;
            this.a(-73, (byte) -46, (hc) null, -35, 115);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "cl.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void o(int param0) {
        field_M = null;
        if (param0 != 20) {
          field_T = 49;
        }
    }

    final String a(byte param0) {
        if (null == this.field_P.field_s) {
          return "";
        }
        int var2 = 25 / ((param0 - 61) / 46);
        return this.field_P.field_s;
    }

    cl(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ad) null);
        am dupTemp$0 = null;
        am dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        hc stackIn_18_1 = null;
        hc stackIn_18_2 = null;
        hc stackIn_19_1 = null;
        hc stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi var6 = null;
        RuntimeException var6_ref = null;
        we var7 = null;
        String var8 = null;
        sj var9 = null;
        am var12 = null;
        am var13 = null;
        try {
          stackIn_4_1 = (param2);
          this.field_N = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_K = stackIn_7_1;
          this.field_R = param1;
          stackIn_10_1 = (param4);
          this.field_O = stackIn_10_1;
          if (this.field_N && (this.field_K ||
            this.field_O)) {
            throw new IllegalStateException();
          }
          this.field_P = (ui) ((Object) new ke(param0, (rm) (this), 100));
          this.field_L = (ui) ((Object) new ke("", (rm) (this), 20));
          if (!this.field_N) {
            this.field_S = new hc(lj.field_o, (rm) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_O) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = hj.field_a;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = hk.field_d;
            }
            this.field_Q = new hc(stackIn_19_3, (rm) null);
            if (this.field_K) {
              this.field_J = new hc(u.field_a, (rm) (this));
            }
          } else {
            this.field_S = new hc(af.field_s, (rm) null);
            this.field_Q = new hc(o.field_b, (rm) null);
            this.field_P.field_E = false;
          }
          this.field_P.field_A = (ad) ((Object) new gk(10000536));
          this.field_L.field_A = (ad) ((Object) new mn(10000536));
          var6 = new wi();
          this.field_S.field_A = (ad) ((Object) var6);
          if (null != this.field_Q) {
            this.field_Q.field_A = (ad) ((Object) var6);
          }
          if (null != this.field_J) {
            this.field_J.field_A = (ad) ((Object) var6);
          }
          this.field_P.field_n = in.field_a;
          if (null != this.field_J) {
            this.field_J.field_n = ha.field_f;
          }
          if (this.field_N) {
            this.field_Q.field_n = eb.field_c;
          } else {
            if (!this.field_O) {
              this.field_Q.field_A = (ad) ((Object) new nc());
            } else {
              this.field_Q.field_n = si.field_c;
              this.field_Q.field_A = (ad) ((Object) new nc());
            }
          }
          this.field_t = 15;
          var7 = bn.field_d;
          if (null != this.field_R) {
            this.field_t = this.field_t + (5 + var7.b(this.field_R, this.field_v - 40, var7.field_I));
          }
          var8 = oe.field_c;
          var9 = hm.a(28, bm.c(-83));
          if (var9 != ak.field_b) {
            if (var9 == hj.field_e) {
              var8 = ka.field_b;
            }
          } else {
            var8 = bg.field_b;
          }
          dupTemp$0 = new am(10, this.field_t, this.field_v - 20, 25, this.field_P, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(-1, dupTemp$0);
          this.field_t = this.field_t + (((fe) ((Object) var12)).field_q + 5);
          dupTemp$1 = new am(10, this.field_t, this.field_v - 20, 25, this.field_L, false, 80, 3, var7, 16777215, tk.field_c);
          var13 = dupTemp$1;
          this.a(-1, dupTemp$1);
          this.field_S.field_y = (rm) (this);
          this.field_t = this.field_t + (((fe) ((Object) var13)).field_q + 5);
          if (null != this.field_J) {
            this.field_J.field_y = (rm) (this);
          }
          if (this.field_Q != null) {
            this.field_Q.field_y = (rm) (this);
          }
          if (null != this.field_J) {
            this.field_S.a(30, -102, 85, -95 + this.field_v, this.field_t);
            this.field_t = this.field_t + 60;
          } else {
            this.field_S.a(30, -127, 8, -6 + this.field_v - 10, this.field_t);
            this.field_t = this.field_t + 35;
          }
          if (null != this.field_J) {
            this.field_J.a(30, -115, 8, this.field_v - 16, this.field_t);
            this.field_t = this.field_t + 35;
          }
          if (this.field_Q != null) {
            if (!this.field_N &&
              !this.field_O) {
              this.field_Q.a(20, -115, 8, 40, this.field_t);
              this.field_t = this.field_t + 25;
            } else {
              this.field_Q.a(30, -124, 8, this.field_v - 6 - 10, this.field_t);
              this.field_t = this.field_t + 35;
            }
          }
          this.a(this.field_t + 3, -84, 0, this.field_v, 0);
          this.a(-1, this.field_S);
          if (null != this.field_J) {
            this.a(-1, this.field_J);
          }
          if (null != this.field_Q) {
            this.a(-1, this.field_Q);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("cl.<init>(");
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
          throw lj.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param3) {
            stackIn_6_0 = this.b(param1, 0);
            return stackIn_6_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(param1, (byte) 12);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("cl.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void p(int param0) {
        int var1 = 0;
        if (ee.field_J <= 32) {
          fc.a(0, (byte) 44);
        } else {
          var1 = ee.field_J % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          fc.a(-var1 + ee.field_J, (byte) 112);
        }
        if (param0 < 1) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          cl.a((java.awt.Canvas) null, 116, -52, -33);
        }
    }

    final static void q(int param0) {
        pj.a(u.b(-4440) < mk.b(45) ? true : false, (byte) -119);
        if (param0 > -59) {
          field_I = 80;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MinerDisturbance.field_ab;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (ra.a(122, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (ra.a(122, param1.charAt(-1 + var3))) {
              var3--;
              continue;
            }
            break;
          }
          if (param0 != -95) {
            stackIn_14_0 = (String) null;
            return stackIn_14_0;
          }
          var4 = -var2_int + var3;
          if (1 > var4) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param1.charAt(var6);
            if (wj.a((char) var7, 96)) {
              var8 = ha.a(242, (char) var7);
              if (0 != var8) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("cl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          if (param2 != this.field_S) {
            if (param2 == this.field_J) {
              fe.e(param1 ^ 26319);
            } else {
              if (param2 == this.field_Q) {
                if (this.field_N) {
                  ta.f((byte) 67);
                } else {
                  if (!this.field_O) {
                    nm.a(-6145);
                  } else {
                    hk.c(-121);
                  }
                }
              }
            }
          } else {
            this.r(125);
          }
          if (param1 != 6) {
            this.field_L = (ui) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("cl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (this.field_R != null) {
          bn.field_d.a(this.field_R, 20 + param1 + this.field_u, 15 + this.field_t + param2, this.field_v - 40, this.field_q, 16777215, -1, 1, 0, bn.field_d.field_I);
        }
        if (null != this.field_J) {
          eh.e(10 + param1, 134 + param2, -20 + this.field_v, 4210752);
        }
        if (param0 != 4) {
          String var6 = (String) null;
          this.a((String) null, 73);
        }
        super.a((byte) 4, param1, param2, param3);
    }

    public final void a(ui param0, int param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -7802) {
            return;
          }
          if (param0 == this.field_P) {
            this.field_L.a((fe) (this), param1 ^ -7687);
          }
          if (this.field_L == param0) {
            this.r(param1 ^ 7749);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("cl.J(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_M = "These platinum climbing hooks let you hold on to rock faces while mining them. Jump onto a wall to hold on and press down or turn away to fall off.";
    }
}
