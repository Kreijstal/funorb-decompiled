/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends td implements jg, m {
    private og field_C;
    static boolean field_D;
    private rh field_E;
    static int field_G;
    private el field_F;

    private final String j(int param0) {
        if (param0 != 11844) {
          int[] var3 = (int[]) null;
          ge.a((int[]) null, true);
        }
        return "</col></u>";
    }

    public final void a(el param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int[] var7 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 == 0) {
            ue.a("terms.ws", false);
          } else {
            if (1 != param1) {
              if (param1 == 2) {
                ue.a("conduct.ws", false);
              }
            } else {
              ue.a("privacy.ws", false);
            }
          }
          if (param3 != 1) {
            var7 = (int[]) null;
            ge.a((int[]) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ge.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ge(og param0) {
        super(0, 0, 288, 0, (t) null);
        String var7 = null;
        int var3 = 0;
        ic var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_C = param0;
          this.field_E = new rh(hd.field_m, (tg) null);
          this.field_E.field_y = (t) ((Object) new dc());
          var7 = dh.a((byte) -81, new String[]{this.k(0), this.j(11844)}, qd.field_b);
          var3 = 20;
          var4 = new ic(gk.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, gk.field_c.field_G, -1, 2147483647, true);
          this.field_F = new el(var7, var4);
          this.field_F.field_n = "";
          this.field_F.a((byte) 58, bb.field_a, 0);
          this.field_F.a((byte) 80, bb.field_a, 1);
          this.field_F.field_l = (tg) (this);
          this.field_F.field_x = -40 + this.field_x;
          this.field_F.a(var3, (byte) -44, this.field_x - 40, 26);
          var3 = var3 + (this.field_F.field_u + 15);
          this.a(false, this.field_F);
          var5 = 4;
          var6 = 200;
          this.field_E.a(40, -3050, var3, var6, 300 - var6 >> 1);
          this.field_E.field_l = (tg) (this);
          this.a(false, this.field_E);
          this.a(55 + var3 + var5, -3050, 0, 300, 0);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String k(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 82 / ((param0 - 17) / 51);
          if (super.a((byte) -75, param1, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_5_0 = this.a(param2, 121);
            return stackIn_5_0;
          }
          if (99 != param3) {
            return false;
          }
          stackIn_8_0 = this.a(param2, true);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ge.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        el var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 == this.field_E) {
            nh.a((byte) -97);
            this.field_C.t(20252);
          }
          if (param4 != -27322) {
            var7 = (el) null;
            this.a((el) null, -97, -102, 71);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ge.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(int[] param0, boolean param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        wa var4_ref_wa = null;
        int var4 = 0;
        wa var5 = null;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          if (jc.field_a != ka.field_b) {
            return false;
          }
          var2_long = qg.a(param1);
          if (s.field_b != 0 &&
            vd.field_K < 0) {
            var4_ref_wa = (wa) (cg.field_f.b(2));
            if (var4_ref_wa != null &&
              var4_ref_wa.field_l < var2_long) {
              var4_ref_wa.a(-60);
              hd.field_o = var4_ref_wa.field_m.length;
              ne.field_a.field_k = 0;
              for (var5_int = 0; hd.field_o > var5_int; var5_int++) {
                ne.field_a.field_j[var5_int] = var4_ref_wa.field_m[var5_int];
              }
              o.field_a = u.field_o;
              u.field_o = mc.field_L;
              mc.field_L = uk.field_c;
              uk.field_c = var4_ref_wa.field_i;
              return true;
            }
          }
          while (true) {
            if (vd.field_K < 0) {
              ne.field_a.field_k = 0;
              if (!hf.a(1, false)) {
                return false;
              }
              vd.field_K = ne.field_a.e(false);
              ne.field_a.field_k = 0;
              hd.field_o = param0[vd.field_K];
            }
            if (!fh.a(520)) {
              return false;
            }
            if (s.field_b == 0) {
              o.field_a = u.field_o;
              u.field_o = mc.field_L;
              mc.field_L = uk.field_c;
              uk.field_c = vd.field_K;
              vd.field_K = -1;
              return true;
            }
            var4 = s.field_b;
            if (0.0 != w.field_U) {
              var4 = (int)((double)var4 + ta.field_c.nextGaussian() * w.field_U);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new wa((long)var4 + var2_long, vd.field_K, new byte[hd.field_o]);
            for (var6 = 0; var6 < hd.field_o; var6++) {
              var5.field_m[var6] = ne.field_a.field_j[var6];
            }
            cg.field_f.a((byte) -110, var5);
            vd.field_K = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("ge.F(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_D = true;
    }
}
