/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends sk {
    private jc field_f;
    private em field_g;
    private mo field_h;

    final void a(int param0, int param1, jj param2) {
        try {
          if (param1 <= 66) {
            this.field_f = (jc) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "fm.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_b.a(bd.field_C, true, lo.field_j);
        if (param0) {
          this.e(-33);
        }
    }

    final void a(boolean param0, byte param1) {
        jaggl.OpenGL.glBindProgramARB(34336, this.field_h.field_d);
        jaggl.OpenGL.glEnable(34336);
        this.field_b.a((byte) 125, 0, un.field_i);
        if (param1 <= 2) {
          this.e(51);
        }
    }

    final void a(boolean param0) {
        if (param0) {
          this.field_b.a((byte) 125, 0, dl.field_p);
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          return;
        }
        this.field_g = (em) null;
        this.field_b.a((byte) 125, 0, dl.field_p);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        jaggl.OpenGL.glDisable(34336);
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        float var4 = 0.0f;
        int var4_intLifetime1;
        float var4Lifetime1;
        if (param0 == 1786747298) {
          if (!this.field_g.field_e) {
            var4_int = 16 * (this.field_b.field_r % 4000) / 4000;
            this.field_b.a(this.field_g.field_i[var4_int], -9135);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
          } else {
            var4 = (float)(this.field_b.field_r % 4000) / 4000.0f;
            this.field_b.a(this.field_g.field_f, -9135);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0f, 0.0f, 1.0f);
          }
          return;
        }
        this.field_f = (jc) null;
        if (!this.field_g.field_e) {
          var4_intLifetime1 = 16 * (this.field_b.field_r % 4000) / 4000;
          this.field_b.a(this.field_g.field_i[var4_intLifetime1], -9135);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        } else {
          var4Lifetime1 = (float)(this.field_b.field_r % 4000) / 4000.0f;
          this.field_b.a(this.field_g.field_f, -9135);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4Lifetime1, 0.0f, 0.0f, 1.0f);
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 1 << param2;
        if (param1 != 111) {
          return;
        }
        if ((var3 & hg.field_D) != 0) {
          return;
        }
        hg.field_D = hg.field_D | var3;
        r.field_n = r.field_n | var3;
        nk.field_g.a(92, new iq(param2));
        if (!tt.field_a) {
          sb.field_c.a(param1 + 6, new oc(param2, param0, ct.field_x, bo.field_h, se.field_b, ei.field_a - or.field_a));
          if (param2 == 6) {
            nk.field_g.a(116, new iq(-1));
            si.c(true);
            return;
          }
          return;
        }
        if (param2 != 6) {
          return;
        }
        nk.field_g.a(116, new iq(-1));
        si.c(true);
    }

    fm(jc param0, gk param1, em param2) {
        super(param0);
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param2;
          this.field_f = param0;
          if (param1 != null &&
            this.field_g.b(false) &&
            this.field_f.field_Vc) {
            this.field_h = ac.a(true, 34336, param1.a("gl", (byte) -71, "transparent_water"), this.field_f);
            return;
          }
          this.field_h = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fm.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 == 3) {
          return null != this.field_h ? true : false;
        }
        this.field_h = (mo) null;
        return null != this.field_h ? true : false;
    }

    static {
    }
}
