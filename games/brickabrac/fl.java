/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends k {
    private String field_k;
    static long field_l;
    static String field_m;
    private boolean field_n;

    final static void f(byte param0) {
        int var1 = 50 / ((31 - param0) / 52);
        LevelCompleteScreen.field_J = null;
        go.field_e = 0;
        th.field_h = false;
        b.field_a = -1;
        CappedUrlRequest.field_j = -1;
    }

    final static void e(int param0) {
        RgbSprite var1 = null;
        RgbSprite var3 = null;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var1 = new RgbSprite(540, 140);
          int var2 = 5 / ((16 - param0) / 50);
          IndexedSpriteGeometry.pushSpriteRaster(-89, var1);
          mg.c();
          Rasterizer2D.clear();
          MatchResultScreen.field_t = 0;
          jl.b(-115);
          var3 = var1.copy();
          for (var4 = 0; 15 > var4; var4++) {
            var3.d(-2, -2, 16777215);
            Rasterizer2D.e(4, 4, 0, 0, 540, 140);
          }
          aa.field_b.bindRasterTarget();
          var1.a(0, 0);
          sc.popRaster(-123);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "fl.Q(" + param0 + ')');
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        oh var4_ref_oh = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = th.a(var5, -106);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_k)) {
            var4_ref_oh = GameplayAudioEvent.a(param1, 0);
            if (var4_ref_oh == null) {
              return null;
            }
            if (null != var4_ref_oh.field_g) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
            this.field_n = var4_ref_oh.field_c;
            this.field_k = param1;
          }
          if (!this.field_n) {
            stackIn_13_0 = ng.field_f;
            return stackIn_13_0;
          }
          var4 = 21 / ((-16 - param0) / 50);
          stackIn_15_0 = MouseWheelSource.field_d;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          fl.f((byte) -72);
          OptionsScreen.field_A.setLength(0);
          ng.field_b = 0;
          return;
        }
        OptionsScreen.field_A.setLength(0);
        ng.field_b = 0;
    }

    fl(vb param0) {
        super(param0);
        this.field_n = false;
    }

    public static void f(int param0) {
        if (param0 >= -35) {
          field_l = 72L;
          field_m = null;
          return;
        }
        field_m = null;
    }

    final qh a(String param0, byte param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qh stackIn_4_0 = null;
        qh stackIn_11_0 = null;
        qh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 106) {
            fl.f((byte) -106);
          }
          var4 = (CharSequence) ((Object) param0);
          if (!se.a(17165, var4)) {
            stackIn_4_0 = lp.field_xb;
            return stackIn_4_0;
          }
          if (!param0.equals(this.field_k)) {
            var3 = GameplayAudioEvent.a(param0, 0);
            if (var3 != null &&
              var3.field_g == null) {
              this.field_k = param0;
              this.field_n = var3.field_c;
            } else {
              stackIn_11_0 = SaveResultsPromptScreen.field_z;
              return stackIn_11_0;
            }
          }
          if (!this.field_n) {
            stackIn_16_0 = lp.field_xb;
          } else {
            stackIn_16_0 = DualLinkIterator.field_c;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("fl.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -28734) {
            field_m = (String) null;
          }
          stackIn_3_0 = sq.a((byte) -32, 10, true, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fl.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void e(byte param0) {
        this.field_k = null;
        if (param0 != -22) {
          this.e((byte) -82);
        }
    }

    static {
        field_m = "Orb coins: ";
    }
}
