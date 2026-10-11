/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends cj implements nc, ij {
    private br field_H;
    static int field_P;
    static cr field_G;
    static ej field_N;
    static int[] field_O;
    private d field_L;
    private d field_M;
    oj field_K;
    static er[] field_I;
    static java.awt.Canvas field_F;

    public final void a(int param0) {
        if (param0 == -4384) {
          ((hk) (this.field_H.a((byte) -5))).h(-1);
          return;
        }
        field_F = (java.awt.Canvas) null;
        ((hk) (this.field_H.a((byte) -5))).h(-1);
    }

    private final void i(int param0) {
        if (param0 >= -92) {
          ne.c(false);
          if (!this.k(-76)) {
            return;
          }
          kr.a(this.field_H.field_w, (byte) -70);
          return;
        }
        if (!this.k(-76)) {
          return;
        }
        kr.a(this.field_H.field_w, (byte) -70);
    }

    final static void c(boolean param0) {
        il.field_k = new cr(0L, (cr) null);
        if (db.field_S) {
          il.field_k.b(bf.field_c, 121);
        }
        il.field_k.b(im.field_j, 118);
        if (!param0) {
          qo.field_D = new lb(fb.field_A, il.field_k);
          ca.field_h = new cr(0L, (cr) null);
          ca.field_h.b(qo.field_D.field_b, 123);
          ca.field_h.b(vb.field_j, 123);
          jr.a(98);
          return;
        }
    }

    public static void a(byte param0) {
        field_G = null;
        if (param0 < -106) {
          field_O = null;
          field_N = null;
          field_I = null;
          field_F = null;
          return;
        }
        ne.j(36);
        field_O = null;
        field_N = null;
        field_I = null;
        field_F = null;
    }

    private final boolean k(int param0) {
        if (!this.a(this.field_H, true)) {
          return false;
        }
        int var2 = -24 / ((param0 + 7) / 56);
        return true;
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        try {
          if (param0 < 6) {
            d var6 = (d) null;
            this.a(-59, (d) null, (byte) -25, -54, -33);
          }
          super.a((byte) 122, param1, param2, param3);
          this.field_L.field_F = this.k(-94);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ne.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, String param2, int param3, int param4, String param5, iq param6) {
        RuntimeException var8 = null;
        qe var9 = null;
        mg var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new mg(20, param0, 120 + param1, 25, param6, false, 120, 3, qc.field_x, 16777215, param2);
          this.c((byte) -78, var10);
          var9 = new qe(((ik) ((Object) param6)).a((byte) -5), param5, 126, param0 + var10.field_s, param1 - param3, param4);
          var9.field_v = (uf) (this);
          this.c((byte) 104, var9);
          stackIn_1_0 = var10.field_s + var9.field_s;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ne.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == this.field_M) {
            sd.f((byte) -1);
          } else {
            if (param1 == this.field_L) {
              this.i(-95);
            }
          }
          var6_int = -68 / ((param2 + 63) / 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ne.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(String param0, String param1, iq param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5) {
            field_O = (int[]) null;
          }
          stackIn_3_0 = this.a(param4, param3, param0, -25, 35, param1, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ne.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(String param0, int param1) {
        br var3 = null;
        boolean discarded$0 = false;
        String var4 = null;
        try {
          var3 = this.field_H;
          if (param1 != 4944) {
            discarded$0 = this.k(-123);
          }
          var4 = param0;
          ((kp) ((Object) var3)).a(var4, -86, false);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ne.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public ne() {
        super(0, 0, 496, 0, (ur) null);
        this.field_H = new br("", (uf) null, 12);
        va var1 = new va(bl.field_N, 0, 0, 0, 0, 16777215, -1, 3, 0, qc.field_x.field_z, -1, 2147483647, true);
        iq var2 = new iq(km.field_v, var1, (uf) null);
        this.field_L = new d(bm.field_y, (uf) null);
        this.field_M = new d(mp.field_c, (uf) null);
        this.field_H.field_q = ho.field_d;
        this.field_H.a(true, new hk(this.field_H));
        this.field_L.field_F = false;
        this.field_L.field_B = (ur) ((Object) new vo());
        this.field_M.field_B = (ur) ((Object) new jc());
        this.field_H.field_B = (ur) ((Object) new ml(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(false, 20, var3, 50, 270);
        var3 += 50;
        this.c((byte) -117, var2);
        var3 = var3 + (this.a(kd.field_q, jg.field_m, this.field_H, 170, var3, false) + 5);
        this.field_L.a(false, -var5 + 496 >> 1, var3, 40, var5);
        this.field_M.a(false, 3 + var4, var3 + 15, 40, 60);
        this.field_M.field_v = (uf) (this);
        this.field_L.field_v = (uf) (this);
        this.c((byte) -31, this.field_L);
        this.c((byte) -71, this.field_M);
        this.field_K = new oj((nc) (this));
        this.field_K.a(false, this.field_H.field_o + (this.field_H.field_n + 60), 20, 150, -60 + this.field_n - this.field_H.field_o - this.field_H.field_n);
        this.c((byte) 125, this.field_K);
        this.a(false, 0, 0, var3 + 55 + var4, 496);
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        int discarded$1 = 0;
        RuntimeException var5 = null;
        iq var6 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13) {
            var6 = (iq) null;
            discarded$1 = this.a((String) null, (String) null, (iq) null, -104, -105, false);
          }
          if (super.a(param0, param1 + 0, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_8_0 = this.a(32345, param3);
            return stackIn_8_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_11_0 = this.b((byte) -98, param3);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ne.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean a(ik param0, boolean param1) {
        of var3 = null;
        RuntimeException var3_ref = null;
        ba var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.a((byte) -5);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a(-23996);
          if (param1) {
            stackIn_9_0 = (qm.field_G == var4);
            return stackIn_9_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ne.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean j(int param0) {
        if (param0 != 0) {
          return true;
        }
        return true;
    }

    static {
        field_O = new int[8192];
        field_N = new ej("");
    }
}
