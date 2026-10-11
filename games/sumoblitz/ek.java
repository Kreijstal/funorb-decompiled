/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ht {
    static String field_k;
    int field_o;
    int field_p;
    int field_q;
    static volatile int field_l;
    private int field_m;
    private int field_n;

    ek(fr param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param4 * (param2 * param3), false);
        this.field_n = -1;
        this.field_m = -1;
        try {
          this.field_p = param2;
          this.field_q = param3;
          this.field_o = param4;
          this.field_d.a(63, (ht) (this));
          jaggl.OpenGL.glTexImage3Dub(this.field_c, 0, this.field_a, this.field_p, this.field_q, this.field_o, 0, be.a(false, this.field_a), 5121, (byte[]) null, 0);
          this.a(true, 0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != -21551) {
          return;
        }
        field_k = null;
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(this.field_n, this.field_m, this.field_c, 0, 0, 0);
        this.field_n = -1;
        int var2 = -76 / ((44 - param0) / 58);
        this.field_m = -1;
    }

    final static void a(String param0, int param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          qf.field_a = qf.field_a + 1;
          if (tm.field_d == -1 &&
            dm.field_e == -1) {
            dm.field_e = pi.field_e;
            tm.field_d = ko.field_p;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(hp.field_l));
          } else {
            decompiledFrameRemainder0 = (hp.field_l == null);
          }
          if (decompiledFrameRemainder0) {
            if (!up.field_d) {
              if (qf.field_a >= fn.field_s) {
                stackIn_17_0 = (fn.field_s + sb.field_c > qf.field_a) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param0 == null) {
              qf.field_a = 0;
            } else {
              if (up.field_d) {
                qf.field_a = fn.field_s;
              } else {
                if (var2_int == 0) {
                  qf.field_a = 0;
                } else {
                  qf.field_a = fn.field_s;
                }
              }
            }
            za.field_k = dm.field_e;
            hq.field_b = tm.field_d;
            if (param0 != null) {
              up.field_d = false;
            } else {
              if (var2_int != 0) {
                up.field_d = true;
              }
            }
          }
          hp.field_l = param0;
          var2_intLifetime1 = -62 % ((-74 - param1) / 35);
          if (!up.field_d &&
            qf.field_a < fn.field_s &&
            sl.field_d) {
            qf.field_a = 0;
            za.field_k = dm.field_e;
            hq.field_b = tm.field_d;
          }
          if (up.field_d &&
            qf.field_a == fe.field_T) {
            qf.field_a = 0;
            up.field_d = false;
          }
          dm.field_e = -1;
          tm.field_d = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("ek.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_d.a(param1 ^ 36, (ht) (this));
        jaggl.OpenGL.glCopyTexSubImage3D(this.field_c, 0, param0, param2, param3, param7, param6, param5, param4);
        jaggl.OpenGL.glFlush();
        if (param1 != 80) {
          this.field_n = 57;
        }
    }

    ek(fr param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param3 * param2 * param4, false);
        this.field_n = -1;
        this.field_m = -1;
        try {
          this.field_p = param2;
          this.field_q = param3;
          this.field_o = param4;
          this.field_d.a(72, (ht) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage3Dub(this.field_c, 0, this.field_a, this.field_p, this.field_q, this.field_o, 0, param6, 5121, param5, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.a(true, 0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static void b(boolean param0, int param1) {
        mf var2 = mf.a(rc.field_l[param1], 100, 96);
        if (param0) {
          var2.c(-1);
          qq.a(18416, var2);
          return;
        }
        ek.b(true, 27);
        var2.c(-1);
        qq.a(18416, var2);
    }

    static {
        field_l = 0;
    }
}
