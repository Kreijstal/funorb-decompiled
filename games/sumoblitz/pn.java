/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends rq {
    static int[] field_k;
    static String field_n;
    private wg field_f;
    static int field_r;
    static jn field_q;
    private boolean field_e;
    private wg field_g;
    private boolean field_u;
    static hr field_t;
    private float[] field_s;
    private wg field_m;
    private boolean field_h;
    private wg field_j;
    private ru field_o;
    private boolean field_l;
    static int field_i;
    static int[] field_p;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var2Lifetime1;
        int var3Lifetime1;
        float var4Lifetime1;
        float var5Lifetime1;
        if (param0 == 260) {
          if (this.field_l) {
            var2 = this.field_b.XA();
            var3 = this.field_b.i();
            var4 = (float)var2 - (float)(-var3 + var2) * 0.125f;
            var5 = -(0.25f * (float)(var2 - var3)) + (float)var2;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_b.S(98), (float)this.field_b.e((byte) 99) / 255.0f);
            this.field_b.g(1, -116);
            this.field_b.a(false, this.field_b.v(15));
            this.field_b.g(0, -117);
          }
          return;
        }
        this.a(-12, 3, -112);
        if (this.field_l) {
          var2Lifetime1 = this.field_b.XA();
          var3Lifetime1 = this.field_b.i();
          var4Lifetime1 = (float)var2Lifetime1 - (float)(-var3Lifetime1 + var2Lifetime1) * 0.125f;
          var5Lifetime1 = -(0.25f * (float)(var2Lifetime1 - var3Lifetime1)) + (float)var2Lifetime1;
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5Lifetime1, var4Lifetime1, 1.0f / (float)this.field_b.S(98), (float)this.field_b.e((byte) 99) / 255.0f);
          this.field_b.g(1, -116);
          this.field_b.a(false, this.field_b.v(15));
          this.field_b.g(0, -117);
        }
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 == 12) {
          field_q = null;
          field_k = null;
          field_p = null;
          field_t = null;
          return;
        }
        field_t = (hr) null;
        field_q = null;
        field_k = null;
        field_p = null;
        field_t = null;
    }

    private final void e(byte param0) {
        int var2 = this.field_b.M(-125);
        ut var3 = this.field_b.g((byte) -28);
        if (this.field_e) {
          jaggl.OpenGL.glBindProgramARB(34336, var2 != 2147483647 ? this.field_g.field_b : this.field_j.field_b);
        } else {
          jaggl.OpenGL.glBindProgramARB(34336, 2147483647 != var2 ? this.field_f.field_b : this.field_m.field_b);
        }
        jaggl.OpenGL.glEnable(34336);
        this.field_l = true;
        var3.a(0.0f, this.field_s, (byte) 71, 0.0f, -1.0f, (float)var2);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_s[0], this.field_s[1], this.field_s[2], this.field_s[3]);
        this.a(param0 + 246);
        if (param0 == 14) {
          return;
        }
        this.a(true, 123);
    }

    pn(on param0, ki param1) {
        super(param0);
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_s = new float[4];
        this.field_h = false;
        try {
          if (param1 != null &&
            param0.field_Ac) {
            this.field_m = ve.a((byte) 83, param0, param1.a("uw_ground_unlit", "gl", -1), 34336);
            this.field_j = ve.a((byte) 83, param0, param1.a("uw_ground_lit", "gl", -1), 34336);
            this.field_f = ve.a((byte) 73, param0, param1.a("uw_model_unlit", "gl", -1), 34336);
            this.field_g = ve.a((byte) -120, param0, param1.a("uw_model_lit", "gl", -1), 34336);
            stackIn_7_0 = (this.field_f == null) ? 0 : 1;
            if (this.field_j == null) {
              stackIn_10_1 = 0;
            } else {
              stackIn_10_1 = 1;
            }
            if (this.field_m == null) {
              stackIn_13_2 = 0;
            } else {
              stackIn_13_2 = 1;
            }
            stackIn_15_0 = stackIn_7_0 & (stackIn_10_1 & stackIn_13_2);
            if (null == this.field_g) {
              stackIn_16_1 = 0;
            } else {
              stackIn_16_1 = 1;
            }
            if ((stackIn_15_0 & stackIn_16_1) == 0) {
              this.field_u = false;
              return;
            }
            this.field_o = this.field_b.a(new int[]{0, -1}, 1, false, -119, 2);
            this.field_o.a(false, false, true);
            this.field_u = true;
            return;
          }
          this.field_u = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("pn.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 >= -71) {
          pn.d(26);
        }
    }

    final void c(boolean param0) {
        this.field_b.g(1, -119);
        this.field_b.a((ed) null, 113);
        this.field_b.a((byte) -83, vi.field_v, vi.field_v);
        this.field_b.a(jq.field_a, 0, 0);
        this.field_b.a(mm.field_h, 2, 0);
        this.field_b.a(jq.field_a, 0, true);
        this.field_b.g(0, -108);
        if (this.field_h) {
          this.field_b.a(jq.field_a, 0, 0);
          this.field_b.a(jq.field_a, 0, true);
          this.field_h = false;
        }
        if (this.field_l) {
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          this.field_l = false;
        }
        if (!param0) {
          return;
        }
        this.field_h = false;
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
          pn.d(21);
          return this.field_u;
        }
        return this.field_u;
    }

    final static void d(byte param0) {
        int var1 = uv.b(-25843);
        int var2 = fu.e((byte) 78);
        gk.field_v.a(var1 + (kf.field_B << 1), -kf.field_B + hu.field_b, (pd.field_l << 1) + var2, 19, hh.field_f - pd.field_l);
        if (param0 == -7) {
          sj.a((byte) 124);
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 18834) {
            field_i = -7;
          }
          if (param2 != null) {
            if (this.field_h) {
              this.field_b.a(jq.field_a, 0, 0);
              this.field_b.a(jq.field_a, 0, true);
              this.field_h = false;
            }
            this.field_b.a(param2, 121);
            this.field_b.h(37, param0);
            return;
          }
          if (this.field_h) {
            return;
          }
          this.field_b.a(this.field_b.field_D, 97);
          this.field_b.h(113, 1);
          this.field_b.a(ta.field_a, 0, 0);
          this.field_b.a(ta.field_a, 0, true);
          this.field_h = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("pn.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
          this.a(-3, -116, 82);
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 == 20186) {
          this.field_e = param0 ? true : false;
          this.field_b.g(1, -112);
          this.field_b.a(this.field_o, param1 - 20070);
          this.field_b.a((byte) -83, lf.field_e, ua.field_n);
          this.field_b.a(mm.field_h, 0, 0);
          this.field_b.a((byte) 85, 2, true, false, jq.field_a);
          this.field_b.a(ta.field_a, 0, true);
          this.field_b.g(0, -108);
          this.e((byte) 14);
          return;
        }
    }

    static {
        field_k = new int[12];
        field_q = new jn();
    }
}
