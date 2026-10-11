/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ii implements jo, vg {
    static String[] field_N;
    private boolean field_X;
    private boolean field_P;
    private ck field_K;
    static String field_T;
    private boolean field_M;
    static String field_W;
    private rm field_O;
    static long field_Q;
    static String field_L;
    private ck field_U;
    private String field_S;
    private ck field_V;
    private rm field_R;

    final void i(int param0) {
        this.field_O.p(72);
        this.field_R.p(50);
        if (param0 != 22377) {
          dn.b(true);
        }
    }

    final void a(int param0, String param1) {
        rm var3 = null;
        String var4 = null;
        if (param0 != -12349) {
          return;
        }
        try {
          var3 = this.field_O;
          var4 = param1;
          var3.a(var4, false, (byte) 64);
          this.field_R.p(param0 + 12457);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "dn.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (param1 != 98) {
            return;
          }
          if (this.field_U != param0) {
            if (this.field_V != param0) {
              if (this.field_K == param0) {
                if (this.field_X) {
                  wk.a(-1);
                } else {
                  if (!this.field_M) {
                    ue.a(param1 - 178);
                  } else {
                    li.c(param1 + 218);
                  }
                }
              }
            } else {
              nh.c(true);
            }
          } else {
            this.j(-24327);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("dn.FA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final String a(int param0) {
        if (param0 != -16) {
          return (String) null;
        }
        if (this.field_O.field_w == null) {
          return "";
        }
        return this.field_O.field_w;
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 55) {
            this.a(-70);
          }
          if (super.a(param0, param1, param2, (byte) 61)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_9_0 = this.a(param0, (byte) 71);
            return stackIn_9_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_12_0 = this.a((byte) -5, param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("dn.W(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(rm param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_O) {
            this.field_R.a(34, (lm) (this));
          }
          if (this.field_R == param0) {
            this.j(-24327);
          }
          if (param1 >= -117) {
            this.field_O = (rm) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dn.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (!tl.field_l) {
          throw new IllegalStateException();
        }
        oj.field_b = true;
        t.a(param0, 0);
        kh.field_n = 0;
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        un var5 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 48) {
            var4 = (Object) null;
            dn.a((Object) null, true, (byte) 79);
          }
          if (param0 == null) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof un)) {
              throw new IllegalArgumentException();
            }
            var5 = (un) (param0);
            stackIn_13_0 = var5.b((byte) 60);
            return stackIn_13_0;
          }
          var3 = (byte[]) (param0);
          if (!param1) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = gg.a((byte) -92, var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("dn.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void j(int param0) {
        if (param0 != -24327) {
          return;
        }
        if (n.a((byte) 118) ||
          !(this.field_O.field_w.length() <= 0) &&
          !(this.field_R.field_w.length() <= 0)) {
          ck.a(this.field_R.field_w, 11, this.field_O.field_w);
        }
    }

    public static void f(byte param0) {
        field_L = null;
        int var1 = -53 % ((param0 + 56) / 38);
        field_W = null;
        field_N = null;
        field_T = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_S != null) {
          lp.field_C.a(this.field_S, 20 + this.field_q + param1, param3 + this.field_v + 15, -40 + this.field_x, this.field_s, 16777215, -1, 1, 0, lp.field_C.field_H);
        }
        if (null != this.field_V) {
          gf.b(10 + param1, param3 + 134, this.field_x - 20, 4210752);
        }
        super.a(param0, param1, param2 ^ param2, param3);
    }

    dn(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ca) null);
        dg dupTemp$0 = null;
        dg dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        ck stackIn_18_1 = null;
        ck stackIn_18_2 = null;
        ck stackIn_19_1 = null;
        ck stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        na var6 = null;
        RuntimeException var6_ref = null;
        se var7 = null;
        String var8 = null;
        ba var9 = null;
        dg var12 = null;
        dg var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_M = stackIn_4_1;
          stackIn_7_1 = (param2);
          this.field_X = stackIn_7_1;
          this.field_S = param1;
          stackIn_10_1 = (param3);
          this.field_P = stackIn_10_1;
          if (this.field_X && (this.field_P ||
            this.field_M)) {
            throw new IllegalStateException();
          }
          this.field_O = (rm) ((Object) new uh(param0, (pg) (this), 100));
          this.field_R = (rm) ((Object) new uh("", (pg) (this), 20));
          if (!this.field_X) {
            this.field_U = new ck(uo.field_e, (pg) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_M) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = gk.field_O;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = kd.field_b;
            }
            this.field_K = new ck(stackIn_19_3, (pg) null);
            if (this.field_P) {
              this.field_V = new ck(qp.field_c, (pg) (this));
            }
          } else {
            this.field_U = new ck(kn.field_a, (pg) null);
            this.field_K = new ck(db.field_u, (pg) null);
            this.field_O.field_B = false;
          }
          this.field_O.field_o = (ca) ((Object) new mc(10000536));
          this.field_R.field_o = (ca) ((Object) new ic(10000536));
          var6 = new na();
          this.field_U.field_o = (ca) ((Object) var6);
          if (null != this.field_K) {
            this.field_K.field_o = (ca) ((Object) var6);
          }
          if (null != this.field_V) {
            this.field_V.field_o = (ca) ((Object) var6);
          }
          this.field_O.field_i = rj.field_y;
          if (this.field_V != null) {
            this.field_V.field_i = hj.field_U;
          }
          if (!this.field_X) {
            if (this.field_M) {
              this.field_K.field_i = oh.field_n;
              this.field_K.field_o = (ca) ((Object) new oa());
            } else {
              this.field_K.field_o = (ca) ((Object) new oa());
            }
          } else {
            this.field_K.field_i = gd.field_D;
          }
          this.field_v = 15;
          var7 = lp.field_C;
          if (this.field_S != null) {
            this.field_v = this.field_v + (5 + var7.a(this.field_S, -40 + this.field_x, var7.field_H));
          }
          var8 = cp.field_T;
          var9 = gb.a(m.c(true), -119);
          if (ba.field_e == var9) {
            var8 = me.field_e;
          } else {
            if (var9 == gg.field_c) {
              var8 = hf.field_ub;
            }
          }
          dupTemp$0 = new dg(10, this.field_v, -20 + this.field_x, 25, this.field_O, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b((byte) -54, dupTemp$0);
          this.field_v = this.field_v + (((lm) ((Object) var12)).field_s + 5);
          dupTemp$1 = new dg(10, this.field_v, -20 + this.field_x, 25, this.field_R, false, 80, 3, var7, 16777215, fk.field_r);
          var13 = dupTemp$1;
          this.b((byte) -54, dupTemp$1);
          this.field_U.field_n = (pg) (this);
          this.field_v = this.field_v + (((lm) ((Object) var13)).field_s + 5);
          if (null != this.field_V) {
            this.field_V.field_n = (pg) (this);
          }
          if (this.field_K != null) {
            this.field_K.field_n = (pg) (this);
          }
          if (this.field_V != null) {
            this.field_U.b(0, -95 + this.field_x, this.field_v, 85, 30);
            this.field_v = this.field_v + 60;
          } else {
            this.field_U.b(0, this.field_x - 16, this.field_v, 8, 30);
            this.field_v = this.field_v + 35;
          }
          if (null != this.field_V) {
            this.field_V.b(0, this.field_x - 6 - 10, this.field_v, 8, 30);
            this.field_v = this.field_v + 35;
          }
          if (this.field_K != null) {
            if (!this.field_X &&
              !this.field_M) {
              this.field_K.b(0, 40, this.field_v, 8, 20);
              this.field_v = this.field_v + 25;
            } else {
              this.field_K.b(0, this.field_x - 6 - 10, this.field_v, 8, 30);
              this.field_v = this.field_v + 35;
            }
          }
          this.b(0, this.field_x, 0, 0, this.field_v + 3);
          this.b((byte) -55, this.field_U);
          if (null != this.field_V) {
            this.b((byte) -128, this.field_V);
          }
          if (this.field_K != null) {
            this.b((byte) -104, this.field_K);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("dn.<init>(");
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
          throw vk.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(rm param0, int param1) {
        try {
          if (param1 != 10000536) {
            rm var4 = (rm) null;
            this.a((rm) null, (byte) 51);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "dn.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_N = new String[]{"Fire Immunity", "Immune to dragonfire."};
        field_W = "Goblin Scout";
        field_T = "MEMBERS ONLY";
        field_L = "<col=2E5D17>Advance</col>";
    }
}
