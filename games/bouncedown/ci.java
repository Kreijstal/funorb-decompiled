/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends lc implements gl, rc {
    private boolean field_J;
    private String field_E;
    private wd field_H;
    private ba field_z;
    private ba field_I;
    private boolean field_B;
    private wd field_D;
    private wd field_K;
    static bc field_F;
    static tg[] field_G;
    private boolean field_C;
    static rg field_L;

    final void b(int param0, String param1) {
        ba var3 = null;
        String var4 = null;
        try {
          if (param0 != 190) {
            ci.k(125);
          }
          var3 = this.field_I;
          var4 = param1;
          var3.a(false, var4, true);
          this.field_z.h(117);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ci.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_E) {
          sg.field_a.a(this.field_E, this.field_r + (param3 + 20), 15 + (param1 + this.field_i), -40 + this.field_k, this.field_m, 16777215, -1, 1, 0, sg.field_a.field_s);
        }
        if (this.field_H != null) {
          na.a(10 + param3, 134 + param1, this.field_k - 20, 4210752);
        }
        super.a(param0, param1, 37, param3);
        if (param2 <= 33) {
          this.field_C = true;
        }
    }

    final static void a(byte param0, gk param1) {
        int var3 = 0;
        int var4 = 0;
        jk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ii var8 = null;
        int var9 = 0;
        ii var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Bounce.field_N;
        try {
          var8 = new ii(param1.b("logo.fo3d", "", -88));
          var10 = var8;
          var3 = var10.d((byte) -124);
          var10.o(8);
          wi.field_g = lb.a(98, var10);
          li.field_e = new int[var3][];
          q.field_G = new jk[var3];
          for (var4 = 0; var3 > var4; var4++) {
            q.field_G[var4] = lf.a(var8, (byte) -111);
          }
          var10.m(-91);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = q.field_G[var9];
            var5.a((byte) -26, 6, 6, 6, 1);
            var5.a(true);
            var6 = new int[]{var5.field_n + var5.field_e >> 1, var5.field_N + var5.field_H >> 1, var5.field_D + var5.field_R >> 1};
            li.field_e[var9] = var6;
            var5.a(-var6[1], 126, -var6[2], -var6[0]);
            var9++;
          }
          if (param0 != -116) {
            ci.k(-56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ci.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Bounce.field_N;
        try {
          if (param0 <= 6) {
            this.field_J = false;
          }
          if (param4 == this.field_D) {
            this.b(false);
          } else {
            if (this.field_H != param4) {
              if (param4 == this.field_K) {
                if (this.field_J) {
                  hh.c((byte) -60);
                } else {
                  if (this.field_B) {
                    oh.b(true);
                  } else {
                    wk.h((byte) -124);
                  }
                }
              }
            } else {
              ii.n(8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ci.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String a(int param0) {
        if (null == this.field_I.field_h) {
          return "";
        }
        if (param0 != 0) {
          this.field_B = false;
        }
        return this.field_I.field_h;
    }

    public static void a(boolean param0) {
        field_L = null;
        field_F = null;
        field_G = null;
        if (param0) {
          ci.k(29);
        }
    }

    ci(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fc) null);
        hb dupTemp$0 = null;
        hb dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        wd stackIn_17_1 = null;
        wd stackIn_17_2 = null;
        wd stackIn_18_1 = null;
        wd stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        jh var6 = null;
        RuntimeException var6_ref = null;
        tj var7 = null;
        String var8 = null;
        ph var9 = null;
        hb var12 = null;
        hb var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_B = stackIn_4_1;
          this.field_E = param1;
          stackIn_7_1 = (param3);
          this.field_C = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_J = stackIn_10_1;
          if (this.field_J && (this.field_C ||
            this.field_B)) {
            throw new IllegalStateException();
          }
          this.field_I = (ba) ((Object) new ti(param0, (sk) (this), 100));
          this.field_z = (ba) ((Object) new ti("", (sk) (this), 20));
          if (this.field_J) {
            this.field_D = new wd(mh.field_W, (sk) null);
            this.field_K = new wd(i.field_g, (sk) null);
            this.field_I.field_y = false;
          } else {
            this.field_D = new wd(bi.field_k, (sk) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_B) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = pe.field_h;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = bi.field_i;
            }
            this.field_K = new wd(stackIn_18_3, (sk) null);
            if (this.field_C) {
              this.field_H = new wd(gk.field_m, (sk) (this));
            }
          }
          this.field_I.field_j = (fc) ((Object) new tc(10000536));
          this.field_z.field_j = (fc) ((Object) new wg(10000536));
          var6 = new jh();
          this.field_D.field_j = (fc) ((Object) var6);
          if (null != this.field_K) {
            this.field_K.field_j = (fc) ((Object) var6);
          }
          if (this.field_H != null) {
            this.field_H.field_j = (fc) ((Object) var6);
          }
          this.field_I.field_q = hf.field_a;
          if (null != this.field_H) {
            this.field_H.field_q = ge.field_a;
          }
          if (this.field_J) {
            this.field_K.field_q = mi.field_e;
          } else {
            if (!this.field_B) {
              this.field_K.field_j = (fc) ((Object) new r());
            } else {
              this.field_K.field_q = nf.field_a;
              this.field_K.field_j = (fc) ((Object) new r());
            }
          }
          this.field_i = 15;
          var7 = sg.field_a;
          if (this.field_E != null) {
            this.field_i = this.field_i + (5 + var7.b(this.field_E, this.field_k - 40, var7.field_s));
          }
          var8 = wj.field_b;
          var9 = ib.a(vi.b(0), (byte) -90);
          if (nj.field_k != var9) {
            if (w.field_g == var9) {
              var8 = dl.field_a;
            }
          } else {
            var8 = ha.field_j;
          }
          dupTemp$0 = new hb(10, this.field_i, this.field_k - 20, 25, this.field_I, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b(dupTemp$0, true);
          this.field_i = this.field_i + (5 + ((lk) ((Object) var12)).field_m);
          dupTemp$1 = new hb(10, this.field_i, -20 + this.field_k, 25, this.field_z, false, 80, 3, var7, 16777215, ae.field_d);
          var13 = dupTemp$1;
          this.b(dupTemp$1, true);
          this.field_D.field_n = (sk) (this);
          this.field_i = this.field_i + (5 + ((lk) ((Object) var13)).field_m);
          if (this.field_H != null) {
            this.field_H.field_n = (sk) (this);
          }
          if (null != this.field_K) {
            this.field_K.field_n = (sk) (this);
          }
          if (this.field_H != null) {
            this.field_D.b(30, 80, -95 + this.field_k, 85, this.field_i);
            this.field_i = this.field_i + 60;
          } else {
            this.field_D.b(30, 80, -10 + this.field_k - 6, 8, this.field_i);
            this.field_i = this.field_i + 35;
          }
          if (null != this.field_H) {
            this.field_H.b(30, 80, -6 + (this.field_k - 10), 8, this.field_i);
            this.field_i = this.field_i + 35;
          }
          if (null != this.field_K) {
            if (!this.field_J &&
              !this.field_B) {
              this.field_K.b(20, 80, 40, 8, this.field_i);
              this.field_i = this.field_i + 25;
            } else {
              this.field_K.b(30, 80, -10 + (-6 + this.field_k), 8, this.field_i);
              this.field_i = this.field_i + 35;
            }
          }
          this.b(this.field_i + 3, 80, this.field_k, 0, 0);
          this.b(this.field_D, true);
          if (null != this.field_H) {
            this.b(this.field_H, true);
          }
          if (this.field_K != null) {
            this.b(this.field_K, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ci.<init>(");
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
          throw ii.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void e(byte param0) {
        if (param0 != -100) {
          return;
        }
        this.field_I.h(123);
        this.field_z.h(param0 + 225);
    }

    public final void a(byte param0, ba param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 12 / ((0 - param0) / 33);
          if (this.field_I == param1) {
            this.field_z.a((lk) (this), false);
          }
          if (this.field_z == param1) {
            this.b(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ci.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        if (td.a(1) ||
          !(this.field_I.field_h.length() <= 0) &&
          !(0 >= this.field_z.field_h.length())) {
          rg.a(-8742, this.field_I.field_h, this.field_z.field_h);
        }
        if (param0) {
          this.field_J = true;
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_5_0 = this.a((byte) -102, param0);
            return stackIn_5_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(param0, 19755);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ci.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean k(int param0) {
        gk var2;
        boolean stackIn_9_0 = false;
        if (param0 != -31077) {
          var2 = (gk) null;
          ci.a((byte) -62, (gk) null);
        }
        boolean decompiledFrameRemainder0 = true;
        if (sa.field_k >= 20 &&
          hi.a((byte) -126) && (!(0 < nb.field_d) ||
          cg.a(param0 + 31078))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public final void a(ba param0, byte param1) {
        try {
          if (param1 < 81) {
            this.field_I = (ba) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ci.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_F = new bc();
    }
}
