/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pja extends vw {
    private hk field_f;
    private kda field_e;
    private mf field_d;

    final void a(int param0, boolean param1) {
        int var3 = 127 / ((param0 - 41) / 62);
        jaggl.OpenGL.glBindProgramARB(34336, this.field_d.field_b);
        jaggl.OpenGL.glEnable(34336);
        this.field_c.a(lja.field_j, 0, -37);
    }

    final void a(int param0, iva param1, int param2) {
        try {
          if (param2 != 24595) {
            this.field_d = (mf) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pja.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 == 1185) {
          return null != this.field_d ? true : false;
        }
        this.field_e = (kda) null;
        return null != this.field_d ? true : false;
    }

    final void a(boolean param0, int param1) {
        this.field_c.a(jv.field_m, (byte) -110, ln.field_F);
        if (param1 != 5744) {
          this.a(false, 34);
        }
    }

    final void a(int param0) {
        this.field_c.a(ej.field_c, 0, -123);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        if (param0 <= -4) {
          jaggl.OpenGL.glDisable(34336);
          return;
        }
        this.field_f = (hk) null;
        jaggl.OpenGL.glDisable(34336);
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        float var4_float = 0.0f;
        if (this.field_f.field_g) {
          var4_float = (float)(this.field_c.field_Dc % 4000) / 4000.0f;
          this.field_c.a(true, this.field_f.field_c);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
        } else {
          var4 = 16 * (this.field_c.field_Dc % 4000) / 4000;
          this.field_c.a(true, this.field_f.field_d[var4]);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        if (param0 == 55) {
          return;
        }
        this.a(11, true);
    }

    pja(kda param0, cn param1, hk param2) {
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
          this.field_f = param2;
          this.field_e = param0;
          if (param1 != null &&
            this.field_f.c(-30634) &&
            this.field_e.field_qd) {
            this.field_d = wd.a((byte) -70, this.field_e, param1.a("gl", (byte) 123, "transparent_water"), 34336);
            return;
          }
          this.field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("pja.<init>(");
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
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
