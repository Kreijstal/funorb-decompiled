/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends vd implements fca, lja {
    private hf field_K;
    private hf field_M;
    private boolean field_I;
    private lka field_Q;
    private String field_L;
    static int field_E;
    private boolean field_J;
    private lka field_H;
    private hf field_O;
    static int field_G;
    static int field_D;
    private boolean field_F;
    static String field_N;
    static long field_P;
    static kv field_C;

    public final void a(lka param0, byte param1) {
        try {
          int var3_int = 85 % ((0 - param1) / 49);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ph.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        if (ch.b(68) ||
          !(this.field_Q.field_w.length() <= 0) &&
          !(this.field_H.field_w.length() <= 0)) {
          g.a(this.field_H.field_w, this.field_Q.field_w, (byte) 81);
        }
        if (param0 > -2) {
          this.k(78);
        }
    }

    final void b(boolean param0) {
        this.field_Q.j((byte) -108);
        this.field_H.j((byte) -69);
        if (param0) {
          field_E = -85;
        }
    }

    public final void a(lka param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_Q) {
            this.field_H.a((wj) (this), -83);
          }
          if (this.field_H == param0) {
            this.k(-118);
          }
          if (param1 != 0) {
            field_P = -122L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ph.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = -90 % ((param0 + 20) / 54);
        if (this.field_L != null) {
          jca.field_a.a(this.field_L, this.field_s + param3 + 20, 15 + (param1 + this.field_v), this.field_p - 40, this.field_q, 16777215, -1, 1, 0, jca.field_a.field_u);
        }
        if (null != this.field_O) {
          dg.e(param3 + 10, param1 + 134, this.field_p - 20, 4210752);
        }
        super.a((byte) -102, param1, param2, param3);
    }

    final String a(int param0) {
        if (null == this.field_Q.field_w) {
          return "";
        }
        if (param0 != 1) {
          lka var3 = (lka) null;
          this.a((lka) null, (byte) 127);
        }
        return this.field_Q.field_w;
    }

    public static void j(int param0) {
        field_C = null;
        if (param0 != 31826) {
          field_C = (kv) null;
        }
        field_N = null;
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (this.field_M != param1) {
            if (param1 == this.field_O) {
              qfa.f(-27);
            } else {
              if (param1 == this.field_K) {
                if (!this.field_J) {
                  if (!this.field_F) {
                    f.a((byte) 101);
                  } else {
                    jja.d((byte) 70);
                  }
                } else {
                  ola.b((byte) -67);
                }
              }
            }
          } else {
            this.k(-94);
          }
          if (param3 < 50) {
            ph.j(13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ph.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
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
            stackIn_6_0 = this.a(-126, param3);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(param3, 1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ph.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ph(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (qda) null);
        ge dupTemp$0 = null;
        ge dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        hf stackIn_17_1 = null;
        hf stackIn_17_2 = null;
        hf stackIn_18_1 = null;
        hf stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ff var6 = null;
        RuntimeException var6_ref = null;
        po var7 = null;
        String var8 = null;
        hk var9 = null;
        ge var12 = null;
        ge var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_I = stackIn_4_1;
          this.field_L = param1;
          stackIn_7_1 = (param2);
          this.field_J = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_F = stackIn_10_1;
          if (this.field_J && (this.field_I ||
            this.field_F)) {
            throw new IllegalStateException();
          }
          this.field_Q = (lka) ((Object) new vn(param0, (pl) (this), 100));
          this.field_H = (lka) ((Object) new vn("", (pl) (this), 20));
          if (this.field_J) {
            this.field_M = new hf(bga.field_k, (pl) null);
            this.field_K = new hf(uda.field_ab, (pl) null);
            this.field_Q.field_z = false;
          } else {
            this.field_M = new hf(tq.field_n, (pl) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_F) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = tja.field_b;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ina.field_s;
            }
            this.field_K = new hf(stackIn_18_3, (pl) null);
            if (this.field_I) {
              this.field_O = new hf(sca.field_b, (pl) (this));
            }
          }
          this.field_Q.field_f = (qda) ((Object) new oka(10000536));
          this.field_H.field_f = (qda) ((Object) new cm(10000536));
          var6 = new ff();
          this.field_M.field_f = (qda) ((Object) var6);
          if (this.field_K != null) {
            this.field_K.field_f = (qda) ((Object) var6);
          }
          this.field_Q.field_h = ba.field_r;
          if (null != this.field_O) {
            this.field_O.field_f = (qda) ((Object) var6);
          }
          if (null != this.field_O) {
            this.field_O.field_h = qha.field_h;
          }
          if (!this.field_J) {
            if (this.field_F) {
              this.field_K.field_h = lna.field_h;
              this.field_K.field_f = (qda) ((Object) new pka());
            } else {
              this.field_K.field_f = (qda) ((Object) new pka());
            }
          } else {
            this.field_K.field_h = wha.field_e;
          }
          this.field_v = 15;
          var7 = jca.field_a;
          if (null != this.field_L) {
            this.field_v = this.field_v + (5 + var7.a(this.field_L, -40 + this.field_p, var7.field_u));
          }
          var8 = rw.field_b;
          var9 = hha.a((byte) 127, nia.d(-31768));
          if (se.field_u == var9) {
            var8 = kr.field_zb;
          } else {
            if (er.field_x == var9) {
              var8 = ji.field_g;
            }
          }
          dupTemp$0 = new ge(10, this.field_v, -20 + this.field_p, 25, this.field_Q, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.c(dupTemp$0, 15);
          this.field_v = this.field_v + (((wj) ((Object) var12)).field_q + 5);
          dupTemp$1 = new ge(10, this.field_v, this.field_p - 20, 25, this.field_H, false, 80, 3, var7, 16777215, mp.field_r);
          var13 = dupTemp$1;
          this.c(dupTemp$1, -120);
          this.field_v = this.field_v + (5 + ((wj) ((Object) var13)).field_q);
          this.field_M.field_k = (pl) (this);
          if (null != this.field_O) {
            this.field_O.field_k = (pl) (this);
          }
          if (null != this.field_K) {
            this.field_K.field_k = (pl) (this);
          }
          if (null != this.field_O) {
            this.field_M.a(85, 30, (byte) 59, this.field_p - 95, this.field_v);
            this.field_v = this.field_v + 60;
          } else {
            this.field_M.a(8, 30, (byte) 59, -6 + this.field_p - 10, this.field_v);
            this.field_v = this.field_v + 35;
          }
          if (this.field_O != null) {
            this.field_O.a(8, 30, (byte) 59, -10 + this.field_p - 6, this.field_v);
            this.field_v = this.field_v + 35;
          }
          if (this.field_K != null) {
            if (!this.field_J &&
              !this.field_F) {
              this.field_K.a(8, 20, (byte) 59, 40, this.field_v);
              this.field_v = this.field_v + 25;
            } else {
              this.field_K.a(8, 30, (byte) 59, -16 + this.field_p, this.field_v);
              this.field_v = this.field_v + 35;
            }
          }
          this.a(0, 3 + this.field_v, (byte) 59, this.field_p, 0);
          this.c(this.field_M, -126);
          if (null != this.field_O) {
            this.c(this.field_O, -123);
          }
          if (this.field_K != null) {
            this.c(this.field_K, -120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ph.<init>(");
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
          throw pe.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        lka var3 = null;
        String var4 = null;
        if (param0 >= -89) {
          return;
        }
        try {
          var3 = this.field_Q;
          var4 = param1;
          var3.a((byte) 123, var4, false);
          this.field_H.j((byte) 101);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ph.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "This game option is only available to members.";
        pja.a(false, 50);
    }
}
