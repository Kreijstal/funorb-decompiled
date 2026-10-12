/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kv extends tj implements he {
    private String[] field_H;
    static String field_J;
    private fw[] field_E;
    private mf field_G;
    static String field_I;
    static int field_F;

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        td var4 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_D.b(param0 - 11);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_H = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_H[var4_int] = ug.a(GrowthEvent.b(param0, 116), (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new td(ArmiesOfGielinor.field_J, 0, 1);
            this.field_E = new fw[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_E[var5] = new fw(this.field_H[var5], (qo) (this));
              this.field_E[var5].field_k = (kh) ((Object) var4);
              this.field_E[var5].field_s = wl.field_J;
              this.field_E[var5].a(0, 80, 20 + 16 * var5, 8192, 15);
              this.a((byte) 10, (kb) (this.field_E[var5]));
            }
            this.field_E[var3_int] = new fw(h.field_h, (qo) (this));
            this.field_E[var3_int].field_k = (kh) ((Object) var4);
            this.field_E[var3_int].a(0, param0, var3_int * 16 + 16 + 20, param0 ^ 8292, 15);
            this.a((byte) 10, (kb) (this.field_E[var3_int]));
            return;
          }
          this.field_H = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("kv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int[] var2 = new int[3];
        int[] var1 = var2;
        var2[0] = 1;
        var2[2] = 16777215;
        var2[1] = 14737632;
        ll.field_Rb = new CombatSandbox(oh.field_J, IsaacRandom.field_k, rs.field_n, var2, 0, 0);
        if (param0 != -28541) {
          field_F = 18;
        }
        le.field_b = new cg();
        TriangleRasterizer.useRasterClip();
        TriangleRasterizer.b(0.75f);
    }

    final static fl k(int param0) {
        if (param0 != 5) {
          field_J = (String) null;
        }
        if (iv.field_b == null) {
          iv.field_b = new fl();
          iv.field_b.a(13421772, ArmiesOfGielinor.field_J);
          iv.field_b.field_s = 7697781;
          iv.field_b.field_o = 14;
          iv.field_b.field_h = 0;
          iv.field_b.field_c = 2763306;
          iv.field_b.field_m = gl.field_e;
          iv.field_b.field_d = 4;
          iv.field_b.field_x = 6;
          iv.field_b.field_r = 5;
        }
        return iv.field_b;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -95, param3);
        if (0 != param3) {
          return;
        }
        BitmapFont var5 = ArmiesOfGielinor.field_J;
        if (param2 > -82) {
          kv.b(true);
        }
        if (this.field_H != null) {
          var5.a(we.field_i, param0 + this.field_B, param1 + this.field_p, this.field_l, 20, 16777215, -1, 0, 0, var5.field_L + var5.field_H);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ph.a(-19, param2)) {
            return false;
          }
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (param0) {
            field_F = 103;
          }
          if (var3_int >= 12) {
            return false;
          }
          if (!rs.a(param2, (byte) -87)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("kv.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -12215) {
            return false;
          }
          if (super.a(param0, param1, param2, param3 ^ 0)) {
            return true;
          }
          if (98 == param1) {
            stackIn_8_0 = this.a(false, param0);
            return stackIn_8_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_12_0 = this.b((byte) -125, param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("kv.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    kv(mf param0) {
        super(0, 0, 0, 0, (kh) null);
        try {
          this.field_G = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 11) {
            kv.a(false, (CharSequence) null, 'ﾪ');
          }
          for (var6_int = 0; this.field_H.length > var6_int; var6_int++) {
            if (param4 == this.field_E[var6_int]) {
              this.field_G.a(-1, this.field_H[var6_int]);
            }
          }
          if (this.field_E[this.field_H.length] == param4) {
            this.field_G.a((byte) -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("kv.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_I = null;
        if (!param0) {
          return;
        }
        field_J = null;
    }

    static {
        field_J = "No special action";
        field_I = "You cannot use this equipment until turn <%0>.";
    }
}
