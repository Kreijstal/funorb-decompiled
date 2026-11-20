/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteButtonRenderer extends TextWidgetStyle {
    static int[] field_v;
    static String field_y;
    static Point2i field_q;
    private Sprite[] field_t;
    private int field_u;
    private int field_s;
    private int field_x;
    static BitmapFont field_w;
    static SpriteAsset field_r;

    final static EntitySound createEntitySound(int param0, int param1, MovingEntity param2, PcmSample param3) {
        EntitySound var4 = null;
        RuntimeException var4_ref = null;
        EntitySound stackIn_2_0 = null;
        EntitySound stackIn_5_0 = null;
        EntitySound stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sm.field_b.isEmpty(0)) {
            stackIn_2_0 = new EntitySound(param3, param2, param0);
            return stackIn_2_0;
          }
          var4 = (EntitySound) (sm.field_b.removeLast((byte) 74));
          var4.initializeEmitter(param2, (byte) -79, param0, param3);
          if (param1 == 2931) {
            stackIn_7_0 = var4;
            return stackIn_7_0;
          }
          stackIn_5_0 = (EntitySound) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("mo.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_r = null;
        field_w = null;
        if (param0 == -1351579448) {
          field_v = null;
          field_y = null;
          field_q = null;
          return;
        }
        field_v = (int[]) null;
        field_v = null;
        field_y = null;
        field_q = null;
    }

    final static boolean containsPoint(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 < 4) {
          CharSequence var8 = (CharSequence) null;
          SpriteButtonRenderer.parseInt((CharSequence) null, (byte) 105);
          if (param1 < param5) {
            return false;
          }
          if (param5 + param2 <= param1) {
            return false;
          }
          if (param6 > param3) {
            return false;
          }
          if (param3 < param0 + param6) {
            return true;
          }
          return false;
        }
        if (param1 < param5) {
          return false;
        }
        if (param5 + param2 <= param1) {
          return false;
        }
        if (param6 > param3) {
          return false;
        }
        if (param3 < param0 + param6) {
          return true;
        }
        return false;
    }

    public SpriteButtonRenderer() {
        this(2188450, 2591221, 9543);
    }

    public final void drawWidget(boolean param0, int param1, int param2, UiWidget param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        try {
          if (!param3.hovered) {
            stackIn_6_0 = (param3.isFocused((byte) -20)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param3 instanceof TextButton) {
            param0 = param0 & ((TextButton) (param3)).field_D;
          }
          if (!param0) {
            stackIn_13_0 = this.field_u;
          } else {
            if (var6_int == 0) {
              stackIn_13_0 = this.field_x;
            } else {
              stackIn_13_0 = this.field_s;
            }
          }
          var7 = stackIn_13_0;
          stackIn_16_0 = (param0) ? 16777215 : 7105644;
          var8 = stackIn_16_0;
          oj.a(this.field_t, var7, param3.x + param1, param4 + param3.y + (param3.height - this.field_t[0].canvasHeight >> 1), -102, param3.width);
          if (param2 >= -48) {
            var9 = (CharSequence) null;
            SpriteButtonRenderer.parseInt((CharSequence) null, (byte) -73);
          }
          this.field_f.drawParagraph(param3.text, param1 + param3.x, -2 + (param3.y + param4), param3.width, param3.height, var8, -1, 1, 1, this.field_f.ascent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("mo.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int parseInt(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -116) {
            var3 = (CharSequence) null;
            SpriteButtonRenderer.parseInt((CharSequence) null, (byte) -11);
          }
          stackIn_3_0 = IntHashTable.parseRadixInteger(true, 10, (byte) 106, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("mo.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int nextPowerOfTwo(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        if (param0 == 7) {
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
        return 107;
    }

    private SpriteButtonRenderer(int param0, int param1, int param2) {
        this.field_s = param1;
        this.field_f = DisplayNameForm.field_I;
        this.field_u = param2;
        this.field_t = NameCheckProgressDialog.field_Ab;
        this.field_x = param0;
    }

    static {
        field_v = new int[]{119, 100, 180, 100};
        field_y = "Connection timed out. Please try using a different server.";
        field_q = new Point2i(0, 0);
    }
}
