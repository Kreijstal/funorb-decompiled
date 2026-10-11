/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ch implements vo {
    static String field_K;
    static String field_I;
    private qm field_N;
    static String field_P;
    static int field_M;
    private qm field_L;
    static tf field_O;
    private qm field_J;

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        ak stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        ak stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        ak stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        ak stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        boolean stackIn_57_2 = false;
        ak stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        boolean stackIn_64_2 = false;
        ak stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        boolean stackIn_69_2 = false;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        c.m(67);
        if (gi.field_a < 0) {
          gk.field_lb.field_cb = null;
          if (param0 != 2) {
            return;
          }
          stackIn_8_0 = ql.field_n;
          stackIn_8_1 = -28476;
          stackIn_9_2 = (param2) && (!param3) && (!uj.field_Wb) && (null == io.field_c) && (null == bn.field_S);
          ((ak) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
          stackIn_15_0 = ti.field_E;
          stackIn_15_1 = param0 - 28478;
          stackIn_16_2 = (param2) && (!param3) && (!uj.field_Wb) && (io.field_c == null) && (null == bn.field_S);
          ((ak) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2);
          stackIn_20_0 = nc.field_e;
          stackIn_20_1 = param0 - 28478;
          stackIn_21_2 = (param2) && (!param3) && (uj.field_Wb);
          ((ak) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_21_2);
        } else {
          gk.field_lb.field_cb = sd.a(oi.field_d, 89, new String[]{Integer.toString(gi.field_a)});
          if (param0 != 2) {
            return;
          }
          stackIn_56_0 = ql.field_n;
          stackIn_56_1 = -28476;
          stackIn_57_2 = (param2) && (!param3) && (!uj.field_Wb) && (null == io.field_c) && (null == bn.field_S);
          ((ak) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_57_2);
          stackIn_63_0 = ti.field_E;
          stackIn_63_1 = param0 - 28478;
          stackIn_64_2 = (param2) && (!param3) && (!uj.field_Wb) && (io.field_c == null) && (null == bn.field_S);
          ((ak) (Object) stackIn_63_0).a(stackIn_63_1, stackIn_64_2);
          stackIn_68_0 = nc.field_e;
          stackIn_68_1 = param0 - 28478;
          stackIn_69_2 = (param2) && (!param3) && (uj.field_Wb);
          ((ak) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_69_2);
        }
        cl.field_g.field_g.b((byte) -88);
        if (gk.field_cb.field_P != 0) {
          fc.field_a = true;
        }
        if (lg.field_c.field_P != 0) {
          if (fe.field_a) {
            ao.a(83, param1);
          } else {
            if (0 < uo.field_j) {
              ao.a(83, param1);
            } else {
              if (2 > wo.field_h) {
                hd.field_g = true;
              } else {
                if (bc.field_m[12]) {
                  ao.a(83, param1);
                } else {
                  hd.field_g = true;
                }
              }
            }
          }
        }
        if (0 != in.field_p.field_P) {
          if (1 == ia.field_a.length &&
            tn.field_o != ia.field_a[0]) {
            tn.field_o = ia.field_a[0];
          }
          si.a(param1, bg.field_d, tn.field_o, 0, true, (byte) -76);
        }
        if (hk.field_h.field_P != 0) {
          uj.field_Wb = false;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = this.field_z + param2;
        int var6 = this.field_p + param0;
        int var7 = 87 % ((70 - param3) / 49);
        he.field_d.a(wi.field_n, 20 + var5, 20 + var6, -40 + this.field_E, -50 + this.field_C, 16777215, -1, 1, 0, he.field_d.field_w);
        super.a(param0, param1, param2, (byte) 122);
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
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
          if (98 == param0) {
            stackIn_6_0 = this.a(0, param2);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(10, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("jh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        ng var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 != 11) {
            var8 = (ng) null;
            this.a(-91, 51, (ng) null, '0');
          }
          if (this.field_N != param0) {
            if (this.field_J != param0) {
              if (param0 == this.field_L) {
                jo.a(-22218);
              }
            } else {
              id.a(param2 + 87);
            }
          } else {
            nm.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("jh.Q(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public jh() {
        super(0, 0, 476, 225, (eb) null);
        this.field_J = new qm(sd.field_M, (fn) null);
        this.field_N = new qm(ii.field_v, (fn) null);
        this.field_L = new qm(fc.field_c, (fn) null);
        ad var1 = new ad();
        this.field_J.field_y = (eb) ((Object) var1);
        this.field_N.field_y = (eb) ((Object) var1);
        this.field_L.field_y = (eb) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_N.a(var4, (byte) 98, -var2 + (this.field_C - 48), -var3 + this.field_E >> 1, 30);
        this.field_L.a(var4, (byte) 85, -var2 + this.field_C - 48, var2 + (var4 + (-var3 + this.field_E >> 1)), 30);
        this.field_J.a(var3, (byte) 103, -(2 * var2) + (this.field_C - 78), this.field_E - var3 >> 1, 30);
        this.field_N.field_n = (fn) (this);
        this.field_J.field_n = (fn) (this);
        this.field_J.field_l = rp.field_a;
        this.field_L.field_n = (fn) (this);
        this.field_L.field_l = up.field_q;
        this.b(this.field_N, 80);
        this.b(this.field_J, 80);
        this.b(this.field_L, 80);
    }

    public static void a(byte param0) {
        field_K = null;
        if (param0 != -123) {
          return;
        }
        field_P = null;
        field_I = null;
        field_O = null;
    }

    static {
        field_I = "Loading music";
        field_K = "Return to Main Menu";
        field_P = "Public chat is unavailable while setting up a rated game.";
    }
}
