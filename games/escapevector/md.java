/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends SingleChildContainer {
    static fk field_E;
    static volatile int mouseIdleTicks;
    static RasterBuffer field_D;
    int field_F;
    static String field_H;

    public md() {
        super(0, 0, 0, 0, (WidgetPainter) null, (UiListener) null);
        this.field_F = 256;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        if (param0 == 127) {
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
        md.releaseStatics(60);
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
          String stackIn_9_2 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              java.net.URL var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = WeightedCacheEntry.withSessionParameters((byte) 95, param0, var3);
              Bzip2State.a(true, true, param0, var3.toString());
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var3_ref2 = (Exception) (Object) decompiledCaughtException;
              var3_ref2.printStackTrace();
            }
            if (param1 < -91) {
              return;
            }
            field_H = (String) null;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var3_ref;
            StringBuilder stackIn_8_1 = new StringBuilder().append("md.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    md(UiComponent param0) {
        super(param0.x, param0.y, param0.width, param0.height, (WidgetPainter) null, (UiListener) null);
        try {
          param0.setBounds(this.width, 0, 0, true, this.height);
          this.child = param0;
          this.field_F = 256;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int guard) {
        int var1 = -26 / ((guard + 6) / 58);
        field_D = null;
        field_E = null;
        field_H = null;
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (layer != 0) {
          return;
        }
        if (null == this.child) {
          return;
        }
        if (this.field_F == 0) {
          return;
        }
        if (this.field_F == 256) {
          this.child.drawLayer(this.y + screenY, (byte) 95, layer, this.x + screenX);
          return;
        }
        Sprite var6 = new Sprite(this.child.width, this.child.height);
        eo.a(var6, (byte) -105);
        this.child.drawLayer(0, (byte) 91, layer, 0);
        if (guard >= 85) {
          dl.a((byte) 107);
          var6.d(this.x + screenX, this.y + screenY, this.field_F);
          return;
        }
        field_H = (String) null;
        dl.a((byte) 107);
        var6.d(this.x + screenX, this.y + screenY, this.field_F);
    }

    static {
        field_E = new fk(3);
        mouseIdleTicks = 0;
    }
}
