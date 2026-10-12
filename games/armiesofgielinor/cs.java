/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs extends sf implements he {
    static String[] field_W;
    private Widget field_ab;
    private fw field_gb;
    private fw field_Z;
    static ModelMeshBase[] field_db;
    private long field_fb;
    static int field_Y;
    static String field_X;
    static java.awt.Frame field_bb;
    static java.math.BigInteger field_cb;
    static String field_eb;

    cs(gk param0) {
        super(param0, 200, 200);
        Widget var3 = null;
        try {
          this.field_fb = vi.monotonicMillis(-95);
          var3 = new Widget(ro.field_vb, (qo) null);
          var3.y = 50;
          var3.height = 100;
          var3.width = this.width;
          var3.x = 0;
          var3.painter = (WidgetPainter) ((Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a((byte) 10, var3);
          this.field_ab = new Widget(ro.field_vb, (qo) null);
          this.field_ab.width = this.width;
          this.field_ab.x = 0;
          this.field_ab.y = 20 + (var3.y + var3.height);
          this.field_ab.height = 80;
          this.field_ab.painter = (WidgetPainter) ((Object) new lk(CipherPacketBuffer.field_t, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a((byte) 10, this.field_ab);
          this.field_Z = this.a(DualNodeDeque.field_e, -63, (qo) (this));
          this.field_gb = this.a(WeightedScoreStrategy.field_m, -74, (qo) (this));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        fw var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.field_Z) {
            this.n(10);
          } else {
            if (param4 == this.field_gb) {
              ck.b(-65);
              this.n(10);
            }
          }
          if (param1 == 11) {
            return;
          }
          var7 = (fw) null;
          this.a(-91, -43, 76, 119, (fw) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("cs.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void n(int param0) {
        if (!this.field_L) {
          return;
        }
        if (param0 != 10) {
          field_db = (ModelMeshBase[]) null;
          this.field_L = false;
          return;
        }
        this.field_L = false;
    }

    public static void b(boolean param0) {
        field_bb = null;
        if (param0) {
          field_db = null;
          field_X = null;
          field_W = null;
          field_eb = null;
          field_cb = null;
          return;
        }
        cs.b(false);
        field_db = null;
        field_X = null;
        field_W = null;
        field_eb = null;
        field_cb = null;
    }

    final void a(int param0, int param1, int param2, Widget param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          super.a(param0, param1, param2, param3);
          if (lk.field_f) {
            param3.f(param0 - 32721);
          }
          var5_long = vi.monotonicMillis(92) - this.field_fb;
          var7 = (int)((10999L - var5_long) / 1000L);
          if (0 >= var7) {
            ck.b(-62);
            this.n(10);
            this.field_G.a(new ud(this.field_G, tn.field_cb), 0);
          } else {
            this.field_ab.field_v = "" + var7;
          }
          if (this.field_L &&
            null == FixedQuaternion.field_a) {
            this.n(param0 ^ 32728);
            this.field_G.a(new ud(this.field_G, mp.field_Mb), 0);
          }
          if (null != FixedQuaternion.field_a &&
            FixedQuaternion.field_a.field_k) {
            this.n(10);
            this.field_G.a(new ud(this.field_G, mp.field_Mb), param0 ^ 32722);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("cs.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(Widget param0, int param1, char param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        Widget var7 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = param1;
          if (99 == var5_int) {
            this.field_gb.a(11, (Widget) (this));
            return true;
          }
          if (var5_int == 98) {
            this.field_Z.a(11, (Widget) (this));
            return true;
          }
          if (param3 != -12215) {
            var7 = (Widget) null;
            this.a((Widget) null, 104, 'ﾑ', 60);
          }
          stackIn_12_0 = super.a(param0, param1, param2, -12215);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("cs.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final fw a(String param0, int param1, qo param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fw(param0, param2);
          var4.painter = (WidgetPainter) ((Object) new nu());
          var5 = this.height - 6;
          this.height = this.height + 38;
          var4.setBounds(15, -30 + this.width, var5, 8192, 30);
          this.a((byte) 10, (Widget) (var4));
          this.e(0);
          var6 = 121 % ((1 - param1) / 62);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("cs.C(");
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_W = new String[]{"proj_aviansie_axe/aviansie_axe", "proj_arrow/proj_arrow", "proj_cannonball/proj_cannonball", "proj_dart/proj_dart", "proj_grenwall_spikes/proj_grenwall_spikes", "proj_rock/proj_catapultloadimpact", "proj_spear/spear"};
        field_db = new ModelMeshBase[field_W.length];
        field_X = "This item can only be used on a goblin priest.";
        field_cb = new java.math.BigInteger("65537");
        field_eb = "Performance";
    }
}
