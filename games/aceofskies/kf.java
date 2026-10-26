/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends sk {
    private mo field_o;
    private mo field_p;
    private mo field_j;
    private float[] field_l;
    private boolean field_f;
    private boolean field_i;
    private boolean field_k;
    static eg field_m;
    private mo field_g;
    private boolean field_h;
    private qi field_n;

    final void a(boolean param0) {
        this.field_b.a(1, (byte) 116);
        this.field_b.a((jj) null, -9135);
        this.field_b.a(ru.field_a, param0, ru.field_a);
        this.field_b.a((byte) 126, 0, CipherPacketBuffer.field_p);
        this.field_b.a((byte) 119, 2, bs.field_a);
        this.field_b.a(CipherPacketBuffer.field_p, 0, 0);
        if (!param0) {
          return;
        }
        this.field_b.a(0, (byte) 79);
        if (!this.field_i) {
          if (this.field_h) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            this.field_h = false;
          }
          return;
        }
        this.field_b.a((byte) 125, 0, CipherPacketBuffer.field_p);
        this.field_b.a(CipherPacketBuffer.field_p, 0, 0);
        this.field_i = false;
        if (this.field_h) {
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          this.field_h = false;
        }
    }

    private final void h(int param0) {
        int var2 = this.field_b.n((byte) -103);
        ec var3 = this.field_b.t(-11198);
        if (this.field_f) {
          jaggl.OpenGL.glBindProgramARB(34336, var2 == 2147483647 ? this.field_g.field_d : this.field_j.field_d);
        } else {
          jaggl.OpenGL.glBindProgramARB(34336, var2 == 2147483647 ? this.field_o.field_d : this.field_p.field_d);
        }
        jaggl.OpenGL.glEnable(34336);
        if (param0 == -23521) {
          this.field_h = true;
          var3.a(0.0f, -1.0f, this.field_l, 0.0f, (float)var2, 11);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_l[0], this.field_l[1], this.field_l[2], this.field_l[3]);
          this.a(10);
          return;
        }
        field_m = (eg) null;
        this.field_h = true;
        var3.a(0.0f, -1.0f, this.field_l, 0.0f, (float)var2, 11);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_l[0], this.field_l[1], this.field_l[2], this.field_l[3]);
        this.a(10);
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
          this.field_o = (mo) null;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          return true;
        }
        return this.field_k;
    }

    kf(jc param0, ResourceArchive param1) {
        super(param0);
        boolean stackIn_10_1 = false;
        boolean stackIn_13_2 = false;
        boolean stackIn_16_1 = false;
        String stackIn_23_2 = null;
        String stackIn_26_2 = null;
        this.field_l = new float[4];
        this.field_i = false;
        try {
          if (param1 != null &&
            param0.field_Vc) {
            this.field_o = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_ground_unlit"), param0);
            this.field_g = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_ground_lit"), param0);
            this.field_p = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_model_unlit"), param0);
            this.field_j = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_model_lit"), param0);
            boolean stackIn_7_0 = !(null == this.field_p);
            stackIn_10_1 = !(this.field_o == null);
            stackIn_13_2 = !(this.field_g == null);
            boolean stackIn_15_0 = stackIn_7_0 & (stackIn_10_1 & stackIn_13_2);
            stackIn_16_1 = !(this.field_j == null);
            if (!(stackIn_15_0 & stackIn_16_1)) {
              this.field_k = false;
              return;
            }
            this.field_n = this.field_b.a(new int[]{0, -1}, 2, 0, false, 1);
            this.field_n.a(false, false, (byte) -127);
            this.field_k = true;
            return;
          }
          this.field_k = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3;
          StringBuilder stackIn_22_1 = new StringBuilder().append("kf.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        if (param0 != 25320) {
          kf.g(57);
          field_m = null;
          return;
        }
        field_m = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
          this.field_g = (mo) null;
        }
    }

    final void a(int param0, int param1, jj param2) {
        String stackIn_14_2 = null;
        try {
          if (param1 <= 66) {
            kf.g(59);
          }
          if (param2 != null) {
            if (this.field_i) {
              this.field_b.a((byte) 120, 0, CipherPacketBuffer.field_p);
              this.field_b.a(CipherPacketBuffer.field_p, 0, 0);
              this.field_i = false;
            }
            this.field_b.a(param2, -9135);
            this.field_b.b(param0, false);
            return;
          }
          if (this.field_i) {
            return;
          }
          this.field_b.a(this.field_b.field_Kb, -9135);
          this.field_b.b(1, false);
          this.field_b.a((byte) 118, 0, un.field_i);
          this.field_b.a(un.field_i, 0, 0);
          this.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var4;
          StringBuilder stackIn_13_1 = new StringBuilder().append("kf.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void f(int param0) {
        ud.field_e = null;
        ji.field_b = null;
        lh.field_a = null;
        fk.field_a = (byte[][]) null;
        ee.field_e = null;
        if (param0 == 1) {
          lg.field_j = null;
          return;
        }
        field_m = (eg) null;
        lg.field_j = null;
    }

    final void a(int param0) {
        if (this.field_h) {
          int var2 = this.field_b.XA();
          int var3 = this.field_b.i();
          float var4 = (float)var2 - 0.125f * (float)(-var3 + var2);
          float var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_b.j((byte) 5), (float)this.field_b.H(param0 ^ 111) / 255.0f);
          this.field_b.a(1, (byte) 52);
          this.field_b.a((byte) -74, this.field_b.q(0));
          this.field_b.a(0, (byte) 35);
        }
        if (param0 == 10) {
          return;
        }
        kf.g(-79);
    }

    final void a(boolean param0, byte param1) {
        if (param1 > 2) {
          this.field_f = param0 ? true : false;
          this.field_b.a(1, (byte) 81);
          this.field_b.a(this.field_n, -9135);
          this.field_b.a(du.field_l, true, bd.field_C);
          this.field_b.a((byte) 127, 0, bs.field_a);
          this.field_b.a(true, 2, true, CipherPacketBuffer.field_p, false);
          this.field_b.a(un.field_i, 0, 0);
          this.field_b.a(0, (byte) 109);
          this.h(-23521);
          return;
        }
        this.field_k = false;
        this.field_f = param0 ? true : false;
        this.field_b.a(1, (byte) 81);
        this.field_b.a(this.field_n, -9135);
        this.field_b.a(du.field_l, true, bd.field_C);
        this.field_b.a((byte) 127, 0, bs.field_a);
        this.field_b.a(true, 2, true, CipherPacketBuffer.field_p, false);
        this.field_b.a(un.field_i, 0, 0);
        this.field_b.a(0, (byte) 109);
        this.h(-23521);
    }

    static {
        field_m = new eg();
    }
}
