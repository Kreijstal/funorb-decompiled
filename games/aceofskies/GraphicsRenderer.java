/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GraphicsRenderer {
    static of field_b;
    int field_c;
    d field_a;

    final void e(int param0) throws lp {
        this.b(0, 0);
        if (param0 >= -3) {
          field_b = (of) null;
        }
    }

    abstract void e();

    private final static GraphicsRenderer a(java.awt.Canvas param0, int param1, d param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        oa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -65 % ((4 - param4) / 50);
          stackIn_1_0 = new oa(param0, param2, param3, param1);
          return (GraphicsRenderer) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ha.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract int i();

    final void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 3105) {
          return;
        }
        this.a(param4, param2, param3, param1, param0, 1);
    }

    abstract void c(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void f(int param0, int param1);

    final synchronized static GraphicsRenderer a(int param0, ResourceArchive param1, int param2, java.awt.Canvas param3, int param4, int param5, int param6, d param7) {
        RuntimeException var8 = null;
        GraphicsRenderer stackIn_2_0 = null;
        GraphicsRenderer stackIn_6_0 = null;
        GraphicsRenderer stackIn_9_0 = null;
        GraphicsRenderer stackIn_12_0 = null;
        GraphicsRenderer stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            stackIn_2_0 = to.a(16, param7, param3, param6, param0);
            return stackIn_2_0;
          }
          if (2 == param2) {
            stackIn_6_0 = GraphicsRenderer.a(param3, param6, param7, param0, (byte) -64);
            return stackIn_6_0;
          }
          if (param2 == 1) {
            stackIn_9_0 = lh.a(param3, (byte) 66, param4, param7);
            return stackIn_9_0;
          }
          if (param2 == param5) {
            stackIn_12_0 = gt.a(-70, param7, param3, param1, param4);
            return stackIn_12_0;
          }
          if (param2 != 3) {
            throw new IllegalArgumentException("UM");
          }
          stackIn_15_0 = mn.a((byte) 1, param4, param3, param1, param7);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("ha.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    abstract void KA(int param0, int param1, int param2, int param3);

    abstract void a(sm param0);

    abstract int[] Y();

    abstract boolean b();

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void a(za param0);

    abstract void a();

    abstract gd a(int param0, int param1);

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.c(param1, param0, param2, param4, param3, param5);
    }

    abstract RendererBitmapFont a(BitmapFontMetrics param0, SpriteData[] param1, boolean param2);

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract sm a(ra param0, gd param1);

    final void a(int param0) {
        vj.field_f[this.field_c] = false;
        if (param0 != -9) {
          this.d();
        }
        this.c();
    }

    final RenderSprite a(int param0, int param1, int[] param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        RenderSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -44 % ((param0 - 43) / 53);
          stackIn_1_0 = this.a(param2, param3, param5, param4, param1, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("ha.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    abstract RenderSprite a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    abstract void K(int[] param0);

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 28321) {
          return;
        }
        this.U(param3, param0, param4, param1, 1);
    }

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract void T(int param0, int param1, int param2, int param3);

    final static void a(MusicTrack param0, byte param1, boolean param2, int param3) {
        int var4_int = 0;
        Object var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = -3 / ((param1 - 13) / 46);
          if (null != DualLinkNode.field_e) {
            dh.a(1000000, param3, param2, 1048576, param0);
          }
          if (mg.field_d != null) {
            var5 = um.field_m;
            synchronized (var5) {
              mg.field_d.a((byte) -116, param3, -1);
              if (param0 == dt.field_c) {
                return;
              }
              mg.field_d.d(-126);
              um.field_m.e();
              dt.field_c = param0;
              if (null != dt.field_c) {
                mg.field_d.a(param2, -2029711608, dt.field_c);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("ha.PA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void c();

    public static void a(boolean param0) {
        if (!param0) {
          GraphicsRenderer.a(false);
        }
        field_b = null;
    }

    abstract int XA();

    abstract za c(int param0);

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    protected void finalize() {
        this.a(-9);
    }

    abstract void b(int param0);

    abstract void b(int param0, int param1) throws lp;

    void a(RenderSprite param0, boolean param1) {
        try {
          this.a(this.a(param0, param1 ? this.a(param0.a(), param0.b()) : null));
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ha.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract RenderSprite createSprite(SpriteData data, boolean preferIndexed);

    abstract boolean d();

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.aa(param5, param2, param1, param0, param4, 1);
        if (param3 != -5782) {
          this.XA();
        }
    }

    GraphicsRenderer(d param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          this.field_a = param0;
          var2_int = -1;
          for (var3 = 0; var3 < 8; var3++) {
            if (!vj.field_f[var3]) {
              var2_int = var3;
              vj.field_f[var3] = true;
              break;
            }
          }
          if (var2_int == -1) {
            throw new IllegalStateException("NFTI");
          }
          this.field_c = var2_int;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new of();
    }
}
