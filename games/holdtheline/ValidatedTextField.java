/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextField implements ValidatorProvider {
    static NamedSoundEffect field_T;
    static int[] field_Y;
    private int field_V;
    static UiTheme field_X;
    static String field_S;
    private Validator field_W;
    static int field_U;

    final void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        try {
          super.updateHover(param0, param1, param2, param3);
          this.field_V = -param0 + (NodeHashTableIterator.field_g - this.x);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "jb.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_Y = null;
        field_X = null;
        field_S = null;
        if (param0 != 7950) {
          return;
        }
        field_T = null;
    }

    final void notifyTextChanged(byte param0) {
        super.notifyTextChanged((byte) -104);
        int var2 = -106 % ((param0 + 44) / 59);
        if (this.field_W != null) {
          this.field_W.invalidate(21871);
        }
    }

    final void a(byte param0, Validator param1) {
        try {
          this.field_W = param1;
          if (param0 <= 35) {
            field_X = (UiTheme) null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "jb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Validator getValidator(int param0) {
        if (param0 != 1) {
          this.getValidator(106);
          return this.field_W;
        }
        return this.field_W;
    }

    final static void a(String param0, int param1) {
        try {
          MarkerSliderRenderer.a(param0, 0);
          IsaacPacketBuffer.a(false, TexturedRoadFillRenderer.field_g, 22676);
          if (param1 >= -46) {
            RoadFillRenderer var3 = (RoadFillRenderer) null;
            ValidatedTextField.a((RoadSegment[]) null, -122, false, 107, (RoadFillRenderer) null, 44);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "jb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ValidatedTextField(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final String getTooltip(int param0) {
        if (!this.hovered) {
          return null;
        }
        if (null != this.tooltip) {
          GrowableIntList.a(FullscreenErrorDialog.field_X, param0, this.width - this.field_V + NodeHashTableIterator.field_g);
          return this.tooltip;
        }
        return null;
    }

    final static void a(RoadSegment[] param0, int param1, boolean param2, int param3, RoadFillRenderer param4, int param5) {
        int var12 = 0;
        float var17 = 0.0f;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        GrowableIntList var6 = null;
        RuntimeException var6_ref = null;
        GrowableIntList var7 = null;
        RoadSegment var8 = null;
        Point2i var9 = null;
        Point2i var10 = null;
        int var11 = 0;
        RoadSegment var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        float var16 = 0.0f;
        int var18 = 0;
        GrowableIntList var19 = null;
        Point2i var20 = null;
        GrowableIntList var21 = null;
        Point2i var22 = null;
        GrowableIntList var23 = null;
        GrowableIntList var24 = null;
        Point2i var25 = null;
        Point2i var26 = null;
        Point2i var27 = null;
        Point2i var28 = null;
        var18 = HoldTheLine.field_D;
        try {
          if (param5 < param1) {
            ValidatedTextField.a(param0, param1, param2, 116, param4, param0.length);
            ValidatedTextField.a(param0, 0, param2, 107, param4, param5);
          }
          var19 = o.a((byte) 37);
          var6 = var19;
          var21 = o.a((byte) 18);
          var7 = var21;
          var8 = param0[param1];
          var20 = var8.k(255);
          var9 = var20;
          if (param3 <= 103) {
            return;
          }
          var22 = var8.n(3337);
          var10 = var22;
          var19.add(var20.x, (byte) 67);
          var19.add(var20.y, (byte) 88);
          var21.add(var22.x, (byte) 94);
          var21.add(var22.y, (byte) 92);
          var11 = var8.field_k;
          for (var12 = param1; param5 > var12; var12++) {
            var13 = param0[var12];
            if (var13.field_k != var11 &&
              param2) {
              param4.drawRoadFill(0.0f, var7.toArray(-92), var11, var6.toArray(-81), (byte) 49);
              var23 = o.a((byte) 29);
              var6 = var23;
              var24 = o.a((byte) 105);
              var7 = var24;
              var23.add(var9.x, (byte) 101);
              var23.add(var9.y, (byte) 104);
              var24.add(var10.x, (byte) 100);
              var24.add(var10.y, (byte) 99);
              var11 = var13.field_k;
            }
            var14 = var13.length(50);
            var15 = (int)(var14 / 5.0f) + 1;
            var16 = 1.0f / (float)var15;
            for (var17 = var16; 1.0f > var17; var17 = var17 + var16) {
              var25 = var13.c(var17, 109);
              var26 = var13.a(-851, var17);
              var6.add(var25.x, (byte) 123);
              var6.add(var25.y, (byte) 123);
              var7.add(var26.x, (byte) 83);
              var7.add(var26.y, (byte) 93);
            }
            var27 = var13.l(8421504);
            var28 = var13.m(-14);
            var6.add(var27.x, (byte) 101);
            var6.add(var27.y, (byte) 67);
            var7.add(var28.x, (byte) 95);
            var7.add(var28.y, (byte) 108);
          }
          param4.drawRoadFill(0.0f, var7.toArray(-58), var11, var6.toArray(-52), (byte) 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_20_0 = var6_ref;
          stackIn_20_1 = new StringBuilder().append("jb.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_Y = new int[8192];
        field_U = 0;
        field_S = "Members' Benefits";
    }
}
