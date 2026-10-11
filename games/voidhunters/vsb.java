/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vsb extends uda {
    private rga field_e;
    private jp field_f;
    private gla field_g;

    final void a(int param0, boolean param1) {
        jaggl.OpenGL.glBindProgramARB(34336, this.field_g.field_c);
        jaggl.OpenGL.glEnable(34336);
        this.field_d.a(0, pja.field_l, 7);
        if (param0 != 5) {
          ura var4 = (ura) null;
          this.a((byte) -95, 120, (ura) null);
        }
    }

    final boolean a(byte param0) {
        int var2 = 38 / ((34 - param0) / 63);
        return this.field_g != null ? true : false;
    }

    final static void e(int param0) {
        if (param0 != -24248) {
          vsb.e(30);
          cea.a(113, 4);
          return;
        }
        cea.a(113, 4);
    }

    final void b(int param0, boolean param1) {
        this.field_d.a(je.field_c, true, et.field_c);
        if (param0 != 5) {
          this.a(0, 25, 20);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var4_float = 0.0f;
        if (this.field_e.field_b) {
          var4_float = (float)(this.field_d.field_pc % 4000) / 4000.0f;
          this.field_d.a(this.field_e.field_d, -125);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
        } else {
          var4 = 16 * (this.field_d.field_pc % 4000) / 4000;
          this.field_d.a(this.field_e.field_a[var4], -116);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        if (param2 == 5) {
          return;
        }
        this.b(102, true);
    }

    final void a(byte param0, int param1, ura param2) {
        try {
          if (param0 <= 42) {
            this.field_e = (rga) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vsb.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    vsb(jp param0, asb param1, rga param2) {
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
          this.field_f = param0;
          this.field_e = param2;
          if (param1 != null &&
            this.field_e.c((byte) -65) &&
            this.field_f.field_Ac) {
            this.field_g = mha.a(0, param1.a("transparent_water", true, "gl"), 34336, this.field_f);
            return;
          }
          this.field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vsb.<init>(");
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
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_d.a(0, qcb.field_q, param0 - 2536);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        jaggl.OpenGL.glDisable(34336);
        if (param0 != 2543) {
          this.field_f = (jp) null;
        }
    }

    static {
    }
}
