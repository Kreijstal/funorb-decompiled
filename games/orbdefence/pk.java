/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends ta implements jb, ai {
    private String field_L;
    static int field_H;
    static int[] field_F;
    private vi field_N;
    static String[] field_B;
    private boolean field_M;
    private s field_A;
    static String field_G;
    private boolean field_J;
    private vi field_C;
    private boolean field_D;
    private s field_K;
    private s field_I;

    final String a(byte param0) {
        if (this.field_N.field_l == null) {
          return "";
        }
        if (param0 < 77) {
          return (String) null;
        }
        return this.field_N.field_l;
    }

    public static void l(int param0) {
        field_B = null;
        field_G = null;
        field_F = null;
        if (param0 != -100) {
          ki var2 = (ki) null;
          pk.a(2, 65, (ki) null, 120);
        }
    }

    public final void a(vi param0, boolean param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_N == param0) {
            this.field_C.a(-81, (pj) (this));
          }
          if (this.field_C == param0) {
            this.k(99);
          }
          if (param1) {
            this.a(-16, 78, -13, 121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pk.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_L) {
          lm.field_f.a(this.field_L, 20 + this.field_s + param3, this.field_n + (param0 + 15), this.field_m - 40, this.field_r, 16777215, -1, 1, 0, lm.field_f.field_H);
        }
        if (this.field_K != null) {
          ul.d(param3 + 10, param0 + 134, -20 + this.field_m, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void m(int param0) {
        this.field_N.e((byte) -128);
        this.field_C.e((byte) -128);
        if (param0 > -7) {
          this.field_I = (s) null;
        }
    }

    final static boolean a(int param0, int param1, ki param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param2.b(param1, false, param3);
          var4 = var6;
          var5 = 28 / ((param0 - 28) / 40);
          if (var6 == null) {
            return false;
          }
          OrbDefence.a(var6, (byte) -93);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("pk.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(param2, false);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(param2, false);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pk.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param3 == this.field_I) {
            this.k(35);
          } else {
            if (this.field_K == param3) {
              d.c((byte) -66);
            } else {
              if (param3 != this.field_A) {
                var6_int = -47 % ((-3 - param0) / 62);
                return;
              }
              if (this.field_M) {
                pa.a(true);
              } else {
                if (!this.field_D) {
                  dk.a((byte) 19);
                } else {
                  qd.a((byte) 127);
                }
              }
            }
          }
          var6_intLifetime1 = -47 % ((-3 - param0) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("pk.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        vi var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          var4 = param1;
          var3.a(0, false, var4);
          if (param0 < 119) {
            this.field_N = (vi) null;
          }
          this.field_C.e((byte) -126);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "pk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vi param0, int param1) {
        try {
          if (param1 <= 27) {
            this.field_K = (s) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "pk.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    pk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (td) null);
        h dupTemp$0 = null;
        h dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        s stackIn_17_1 = null;
        s stackIn_17_2 = null;
        s stackIn_18_1 = null;
        s stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk var6 = null;
        RuntimeException var6_ref = null;
        kc var7 = null;
        String var8 = null;
        df var9 = null;
        h var12 = null;
        h var13 = null;
        try {
          this.field_L = param1;
          stackIn_4_1 = (param4);
          this.field_D = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_J = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_M = stackIn_10_1;
          if (this.field_M && (this.field_J ||
            this.field_D)) {
            throw new IllegalStateException();
          }
          this.field_N = (vi) ((Object) new oc(param0, (ag) (this), 100));
          this.field_C = (vi) ((Object) new oc("", (ag) (this), 20));
          if (this.field_M) {
            this.field_I = new s(tk.field_l, (ag) null);
            this.field_A = new s(ld.field_d, (ag) null);
            this.field_N.field_F = false;
          } else {
            this.field_I = new s(q.field_a, (ag) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_D) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = gl.field_k;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = vc.field_i;
            }
            this.field_A = new s(stackIn_18_3, (ag) null);
            if (this.field_J) {
              this.field_K = new s(ki.field_h, (ag) (this));
            }
          }
          this.field_N.field_j = (td) ((Object) new fg(10000536));
          this.field_C.field_j = (td) ((Object) new eg(10000536));
          var6 = new vk();
          this.field_I.field_j = (td) ((Object) var6);
          if (this.field_A != null) {
            this.field_A.field_j = (td) ((Object) var6);
          }
          this.field_N.field_i = rl.field_b;
          if (this.field_K != null) {
            this.field_K.field_j = (td) ((Object) var6);
          }
          if (this.field_K != null) {
            this.field_K.field_i = ec.field_J;
          }
          if (!this.field_M) {
            if (this.field_D) {
              this.field_A.field_i = og.field_j;
              this.field_A.field_j = (td) ((Object) new qc());
            } else {
              this.field_A.field_j = (td) ((Object) new qc());
            }
          } else {
            this.field_A.field_i = ql.field_d;
          }
          this.field_n = 15;
          var7 = lm.field_f;
          if (null != this.field_L) {
            this.field_n = this.field_n + (var7.a(this.field_L, -40 + this.field_m, var7.field_H) + 5);
          }
          var8 = le.field_d;
          var9 = oa.a(true, uj.b((byte) -120));
          if (mj.field_l == var9) {
            var8 = gl.field_h;
          } else {
            if (var9 == vh.field_s) {
              var8 = wd.field_k;
            }
          }
          dupTemp$0 = new h(10, this.field_n, -20 + this.field_m, 25, this.field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(dupTemp$0, (byte) 74);
          this.field_n = this.field_n + (((pj) ((Object) var12)).field_r + 5);
          dupTemp$1 = new h(10, this.field_n, this.field_m - 20, 25, this.field_C, false, 80, 3, var7, 16777215, hi.field_h);
          var13 = dupTemp$1;
          this.a(dupTemp$1, (byte) 74);
          this.field_n = this.field_n + (((pj) ((Object) var13)).field_r + 5);
          this.field_I.field_h = (ag) (this);
          if (this.field_K != null) {
            this.field_K.field_h = (ag) (this);
          }
          if (null != this.field_A) {
            this.field_A.field_h = (ag) (this);
          }
          if (this.field_K != null) {
            this.field_I.a(85, this.field_n, 30, (byte) -90, -95 + this.field_m);
            this.field_n = this.field_n + 60;
          } else {
            this.field_I.a(8, this.field_n, 30, (byte) -90, -6 + this.field_m - 10);
            this.field_n = this.field_n + 35;
          }
          if (this.field_K != null) {
            this.field_K.a(8, this.field_n, 30, (byte) -90, this.field_m - 6 - 10);
            this.field_n = this.field_n + 35;
          }
          if (null != this.field_A) {
            if (!this.field_M &&
              !this.field_D) {
              this.field_A.a(8, this.field_n, 20, (byte) -90, 40);
              this.field_n = this.field_n + 25;
            } else {
              this.field_A.a(8, this.field_n, 30, (byte) -90, -6 + (this.field_m - 10));
              this.field_n = this.field_n + 35;
            }
          }
          this.a(0, 0, 3 + this.field_n, (byte) -90, this.field_m);
          this.a(this.field_I, (byte) 74);
          if (null != this.field_K) {
            this.a(this.field_K, (byte) 74);
          }
          if (null != this.field_A) {
            this.a(this.field_A, (byte) 74);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("pk.<init>(");
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
          throw dd.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void k(int param0) {
        pj var3;
        if (qe.b(14388) ||
          !(this.field_N.field_l.length() <= 0) &&
          !(this.field_C.field_l.length() <= 0)) {
          vf.a((byte) 108, this.field_C.field_l, this.field_N.field_l);
        }
        if (param0 < 27) {
          var3 = (pj) null;
          this.a('￷', 82, (pj) null, -124);
        }
    }

    static {
        field_F = new int[4];
        field_H = 0;
        field_B = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_G = "Email address is unavailable";
    }
}
