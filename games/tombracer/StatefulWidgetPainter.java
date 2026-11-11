/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatefulWidgetPainter extends TextWidgetPainter {
    private WidgetStyleLayer[] field_o;
    static IntrusiveDeque field_n;
    static boolean field_q;
    private WidgetStyleLayer field_p;

    public StatefulWidgetPainter() {
        this.field_o = new WidgetStyleLayer[6];
        this.field_p = new WidgetStyleLayer();
        WidgetStyleLayer dupTemp$0 = new WidgetStyleLayer();
        this.field_o[0] = dupTemp$0;
        WidgetStyleLayer var1 = dupTemp$0;
        var1.a(true);
    }

    final static void checkAppletUsername(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -96) {
            StatefulWidgetPainter.releaseStatics(91);
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (PasswordValidator.encodeBase37(var3, 19) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("vga.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, Sprite[] param1) {
        int var4 = 0;
        WidgetStyleLayer[] var3 = null;
        WidgetStyleLayer var5 = null;
        int var6 = 0;
        StatefulWidgetPainter var7 = null;
        WidgetStyleLayer[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = this.field_o;
          var3 = var8;
          if (param0 != -18379) {
            var7 = (StatefulWidgetPainter) null;
            this.a((byte) -79, (StatefulWidgetPainter) null, false);
          }
          for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_i = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("vga.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void setIconForAllStates(Sprite param0, byte param1) {
        int var4 = 0;
        WidgetStyleLayer[] var3 = null;
        int var5 = 0;
        WidgetStyleLayer var6 = null;
        int var7 = 0;
        WidgetStyleLayer[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = this.field_o;
          var3 = var8;
          var5 = -107 / ((-39 - param1) / 62);
          for (var4 = 0; var8.length > var4; var4++) {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_c = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vga.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        if (param0 < 36) {
          field_q = true;
        }
    }

    final void setStateFrameSprites(int param0, int param1, Sprite[] param2) {
        int var4_int = 0;
        try {
          if (param0 != 0) {
            this.field_p = (WidgetStyleLayer) null;
          }
          var4_int = param1;
          if (null == this.field_o[var4_int]) {
            this.field_o[var4_int] = new WidgetStyleLayer();
          }
          this.field_o[param1].field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vga.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final WidgetStyleLayer createStateLayer(int param0, byte param1) {
        if (param1 < 40) {
          this.createStateLayer(100, (byte) 15);
        }
        WidgetStyleLayer dupTemp$0 = new WidgetStyleLayer();
        this.field_o[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public final void paintWidget(UiWidget param0, int param1, int param2, int param3, boolean param4) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        WidgetStyleLayer var7 = null;
        WidgetStyleLayer var9 = null;
        FocusableWidget var10 = null;
        WidgetStyleLayer var11 = null;
        WidgetStyleLayer var12 = null;
        WidgetStyleLayer var13 = null;
        WidgetStyleLayer var14 = null;
        try {
          if (!(param0 instanceof FocusableWidget)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiWidget) (param0);
          }
          var10 = (FocusableWidget) (stackIn_3_0);
          tga.intersectClip(param2 - 16799168, param0.field_i + param1, param1 + param0.field_i + param0.field_m, param0.field_n + param3, param0.field_n + param3 + param0.field_p);
          if (var10 != null) {
            param4 = param4 & var10.field_y;
          }
          var7 = this.field_o[0];
          this.field_p.a(true);
          if (param2 != 16777215) {
            this.field_o = (WidgetStyleLayer[]) null;
          }
          var7.mergeIntoWorkingSkin(this, param0, 123, param3, param1, this.field_p);
          if (var10 != null) {
            if (var10.field_w) {
              var11 = this.field_o[1];
              if (var11 != null) {
                var11.mergeIntoWorkingSkin(this, param0, 125, param3, param1, this.field_p);
              }
            }
            if (var10.field_f) {
              var12 = this.field_o[3];
              if (0 != var10.field_s &&
                var12 != null) {
                var12.mergeIntoWorkingSkin(this, param0, 123, param3, param1, this.field_p);
              } else {
                var9 = this.field_o[2];
                if (var9 != null) {
                  var9.mergeIntoWorkingSkin(this, param0, param2 ^ 16777092, param3, param1, this.field_p);
                }
              }
            }
          }
          if (param0.hasKeyboardFocus((byte) -34)) {
            var13 = this.field_o[5];
            if (var13 != null) {
              var13.mergeIntoWorkingSkin(this, param0, 123, param3, param1, this.field_p);
            }
          }
          if (!param4) {
            var14 = this.field_o[4];
            if (var14 != null) {
              var14.mergeIntoWorkingSkin(this, param0, 126, param3, param1, this.field_p);
            }
          }
          this.field_p.paint(-83, param1, this, param3, param0);
          pfa.popRasterState(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_36_0 = var6;
          stackIn_36_1 = new StringBuilder().append("vga.B(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(byte param0, StatefulWidgetPainter param1, boolean param2) {
        int var4_int = 0;
        WidgetStyleLayer dupTemp$0 = null;
        WidgetStyleLayer stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        WidgetStyleLayer stackIn_11_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        WidgetStyleLayer var5 = null;
        WidgetStyleLayer var6 = null;
        int var7 = 0;
        Sprite[] var8 = null;
        WidgetStyleLayer var6Lifetime1;
        WidgetStyleLayer var6Lifetime2;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -16) {
            var8 = (Sprite[]) null;
            this.a(-72, (Sprite[]) null);
          }
          super.copyTo(param1, param0 - 64);
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_o[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param1.field_o[var4_int];
                stackIn_10_0 = var5;
                stackIn_10_1 = true;
                if (var6Lifetime2 != null) {
                  stackIn_11_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new WidgetStyleLayer();
                  param1.field_o[var4_int] = dupTemp$0;
                  stackIn_11_2 = dupTemp$0;
                }
                ((WidgetStyleLayer) (Object) stackIn_10_0).copyTo(stackIn_10_1, stackIn_11_2);
              } else {
                param1.field_o[var4_int] = null;
              }
            }
            return;
          }
          ArrayUtils.copy(this.field_o, 0, param1.field_o, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("vga.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    StatefulWidgetPainter(StatefulWidgetPainter param0, boolean param1) {
        this();
        try {
          param0.a((byte) -16, this, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_n = new IntrusiveDeque();
    }
}
