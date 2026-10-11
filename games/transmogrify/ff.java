/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends aj implements fb, df {
    static String field_C;
    static String field_x;
    static ti field_z;
    private boolean field_E;
    private lj field_J;
    private lj field_w;
    private rg field_G;
    static int[] field_H;
    private boolean field_y;
    private rg field_L;
    private boolean field_K;
    private lj field_A;
    private String field_B;
    static hj field_D;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 != this.field_A) {
            if (param0 == this.field_J) {
              hg.c(0);
            } else {
              if (this.field_w == param0) {
                if (!this.field_K) {
                  if (this.field_E) {
                    kc.a((byte) -128);
                  } else {
                    qa.b(param1 - 13);
                  }
                } else {
                  gb.a((byte) 81);
                }
              }
            }
          } else {
            this.d((byte) -123);
          }
          if (param1 != 17) {
            this.field_A = (lj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ff.MA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, rg param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_L == param1) {
            this.field_G.a((qg) (this), param0 - 1421);
          }
          if (param0 != 1330) {
            return;
          }
          if (param1 == this.field_G) {
            this.d((byte) -123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ff.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void d(byte param0) {
        if (bg.g(-43) ||
          !(this.field_L.field_k.length() <= 0) &&
          !(this.field_G.field_k.length() <= 0)) {
          hd.a(this.field_G.field_k, this.field_L.field_k, -4776);
        }
        if (param0 != -123) {
          field_D = (hj) null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (null != this.field_B) {
          vd.field_h.a(this.field_B, 20 + (this.field_p + param0), 15 + (this.field_n + param1), -40 + this.field_l, this.field_h, 16777215, -1, 1, 0, vd.field_h.field_y);
        }
        int var5 = -124 / ((param3 - 77) / 34);
        if (this.field_J != null) {
          sb.d(10 + param0, param1 + 134, this.field_l - 20, 4210752);
        }
        super.a(param0, param1, param2, (byte) 119);
    }

    ff(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ui) null);
        oc dupTemp$0 = null;
        oc dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        lj stackIn_18_1 = null;
        lj stackIn_18_2 = null;
        lj stackIn_19_1 = null;
        lj stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        qa var6 = null;
        RuntimeException var6_ref = null;
        kg var7 = null;
        String var8 = null;
        kh var9 = null;
        oc var12 = null;
        oc var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_y = stackIn_4_1;
          this.field_B = param1;
          stackIn_7_1 = (param4);
          this.field_E = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_K = stackIn_10_1;
          if (this.field_K && (this.field_y ||
            this.field_E)) {
            throw new IllegalStateException();
          }
          this.field_L = (rg) ((Object) new vc(param0, (ma) (this), 100));
          this.field_G = (rg) ((Object) new vc("", (ma) (this), 20));
          if (!this.field_K) {
            this.field_A = new lj(da.field_B, (ma) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_E) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = gl.field_z;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = te.field_f;
            }
            this.field_w = new lj(stackIn_19_3, (ma) null);
            if (this.field_y) {
              this.field_J = new lj(je.field_c, (ma) (this));
            }
          } else {
            this.field_A = new lj(rc.field_b, (ma) null);
            this.field_w = new lj(ta.field_b, (ma) null);
            this.field_L.field_t = false;
          }
          this.field_L.field_q = (ui) ((Object) new ni(10000536));
          this.field_G.field_q = (ui) ((Object) new nc(10000536));
          var6 = new qa();
          this.field_A.field_q = (ui) ((Object) var6);
          if (null != this.field_w) {
            this.field_w.field_q = (ui) ((Object) var6);
          }
          this.field_L.field_j = fc.field_e;
          if (this.field_J != null) {
            this.field_J.field_q = (ui) ((Object) var6);
          }
          if (null != this.field_J) {
            this.field_J.field_j = uf.field_b;
          }
          if (!this.field_K) {
            if (!this.field_E) {
              this.field_w.field_q = (ui) ((Object) new ek());
            } else {
              this.field_w.field_j = pa.field_a;
              this.field_w.field_q = (ui) ((Object) new ek());
            }
          } else {
            this.field_w.field_j = je.field_a;
          }
          this.field_n = 15;
          var7 = vd.field_h;
          if (this.field_B != null) {
            this.field_n = this.field_n + (var7.a(this.field_B, this.field_l - 40, var7.field_y) + 5);
          }
          var8 = e.field_q;
          var9 = ga.a(125, ha.b(81));
          if (aa.field_d == var9) {
            var8 = pf.field_c;
          } else {
            if (of.field_f == var9) {
              var8 = te.field_b;
            }
          }
          dupTemp$0 = new oc(10, this.field_n, this.field_l - 20, 25, this.field_L, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a((qg) (dupTemp$0), (byte) -83);
          this.field_n = this.field_n + (((qg) ((Object) var12)).field_h + 5);
          dupTemp$1 = new oc(10, this.field_n, this.field_l - 20, 25, this.field_G, false, 80, 3, var7, 16777215, ee.field_y);
          var13 = dupTemp$1;
          this.a((qg) (dupTemp$1), (byte) -84);
          this.field_n = this.field_n + (((qg) ((Object) var13)).field_h + 5);
          this.field_A.field_m = (ma) (this);
          if (null != this.field_J) {
            this.field_J.field_m = (ma) (this);
          }
          if (this.field_w != null) {
            this.field_w.field_m = (ma) (this);
          }
          if (null != this.field_J) {
            this.field_A.a(-116, this.field_n, 85, this.field_l - 95, 30);
            this.field_n = this.field_n + 60;
          } else {
            this.field_A.a(-102, this.field_n, 8, -6 + this.field_l - 10, 30);
            this.field_n = this.field_n + 35;
          }
          if (null != this.field_J) {
            this.field_J.a(92, this.field_n, 8, -16 + this.field_l, 30);
            this.field_n = this.field_n + 35;
          }
          if (null != this.field_w) {
            if (!this.field_K &&
              !this.field_E) {
              this.field_w.a(58, this.field_n, 8, 40, 20);
              this.field_n = this.field_n + 25;
            } else {
              this.field_w.a(113, this.field_n, 8, -6 + this.field_l - 10, 30);
              this.field_n = this.field_n + 35;
            }
          }
          this.a(26, 0, 0, this.field_l, this.field_n + 3);
          this.a((qg) (this.field_A), (byte) -104);
          if (this.field_J != null) {
            this.a((qg) (this.field_J), (byte) -96);
          }
          if (this.field_w != null) {
            this.a((qg) (this.field_w), (byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ff.<init>(");
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
          throw ch.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(pl param0, boolean param1, int param2, int param3, byte param4) {
        if (param4 < 0) {
          return;
        }
        try {
          jj.field_a.a(param3, !param1 ? true : false, param2, 1000000, param0, 100);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ff.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1) {
        rg var3 = null;
        String var4 = null;
        try {
          if (param1 != 30) {
            ff.m(-73);
          }
          var3 = this.field_L;
          var4 = param0;
          var3.a(var4, false, param1 - 29);
          this.field_G.i(81);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ff.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) 123, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a(2, param1);
            return stackIn_6_0;
          }
          var5_int = 39 % ((param2 - 65) / 55);
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.b(param1, 108);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ff.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void m(int param0) {
        field_D = null;
        if (param0 <= 119) {
          field_x = (String) null;
        }
        field_H = null;
        field_C = null;
        field_x = null;
        field_z = null;
    }

    public final void a(rg param0, int param1) {
        try {
          if (param1 >= -55) {
            this.field_K = false;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ff.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String e(byte param0) {
        int var2 = -69 / ((-53 - param0) / 57);
        if (null != this.field_L.field_k) {
          return this.field_L.field_k;
        }
        return "";
    }

    final void l(int param0) {
        this.field_L.i(81);
        this.field_G.i(param0 ^ -31940);
        if (param0 != -31891) {
          field_z = (ti) null;
        }
    }

    final static void a(byte param0) {
        int var1 = -124 / ((param0 + 63) / 57);
        String var2 = (String) null;
        ec.a(hf.field_g, -126, (String) null);
    }

    static {
        field_C = "Names can only contain letters, numbers, spaces and underscores";
        field_H = new int[]{7059175, 8189570, 16770707, 16536152};
        field_x = "Not yet achieved";
    }
}
