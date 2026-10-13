/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends en {
    static LobbyRoom roomSetup;
    static int[] field_U;
    static ClientUiComponent field_M;
    static RgbSprite field_P;
    static int field_J;
    private EditableTextWidget field_Q;
    static int responseTargetChannel;
    private EditableTextWidget field_O;
    static ClientUiComponent field_T;
    private boolean field_R;
    private EditableTextWidget field_L;
    static String cachedConsoleSource;

    final int l(int param0) {
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        NumberFormatException var3 = null;
        var2 = 47 % ((param0 + 30) / 36);
        try {
          stackIn_2_0 = Integer.parseInt(this.field_L.text);
          return stackIn_2_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean k(int param0) {
        if (null == this.field_L.text) {
          return true;
        }
        if (0 == this.field_L.text.length()) {
          return true;
        }
        if (null != this.field_Q.text &&
          this.field_Q.text.length() != 0) {
          if (param0 != -22339) {
            return false;
          }
          if (null != this.field_O.text &&
            this.field_O.text.length() != 0) {
            return false;
          }
          return true;
        }
        return true;
    }

    private final void a(String param0, Widget param1, int param2, int param3, int param4) {
        try {
          gl.field_e.drawCentered(param0, param4 - (-param1.x - (param1.width >> 1)), param1.y + (param2 - 5), param3, -1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "no.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    no(WidgetPainter param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds(param2, param4, param3, 8192, param5);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "no.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void readTaggedFields(CipherPacketBuffer packet, TaggedFieldReader target, int recordBitLength, int obfuscationGuard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = recordBitLength + packet.getReadBitPosition(false);
          while (packet.getReadBitPosition(false) < var4_int) {
            var5 = TextCursor.readTagName(packet, true);
            var6 = packet.getReadBitPosition(false);
            var7 = AiPlanner.readCompactInt(packet, true);
            var8 = packet.getReadBitPosition(false) - var6;
            kq.enterTaggedPayload(var6, obfuscationGuard + 489, var8, var7, packet);
            target.decodeTaggedField(var7, packet, var5, (byte) 37);
            ao.finishTaggedPayload(var6, 4, var8, packet, var7);
          }
          if (obfuscationGuard == -24721) {
            return;
          }
          field_M = (ClientUiComponent) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("no.K(");
          if (packet == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (target == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(recordBitLength).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(byte param0, sb param1) {
        try {
          super.a((byte) -108, param1);
          this.field_L.listener = (WidgetListener) ((Object) param1);
          this.field_Q.listener = (WidgetListener) ((Object) param1);
          if (param0 > -21) {
            this.k(-25);
          }
          this.field_O.listener = (WidgetListener) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "no.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int m(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -26458) {
          return -46;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_Q.text) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    public static void c(boolean param0) {
        cachedConsoleSource = null;
        field_U = null;
        field_P = null;
        field_T = null;
        field_M = null;
        roomSetup = null;
        if (param0) {
          field_U = (int[]) null;
        }
    }

    final String getTooltipText(int obfuscationGuard) {
        String var2 = this.field_Q.getTooltipText(obfuscationGuard ^ 0);
        if (var2 != null) {
          return var2;
        }
        if (this.hovered) {
          return this.tooltipText == null ? this.text : this.tooltipText;
        }
        if (obfuscationGuard != 21384) {
          roomSetup = (LobbyRoom) null;
          return null;
        }
        return null;
    }

    final static void b(boolean param0) {
        tf.a((byte) -99, CombatEvent.d((byte) -111));
        if (param0) {
          cachedConsoleSource = (String) null;
        }
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        super.drawWidget(originX, originY, (byte) -84, renderLayer);
        if (0 != renderLayer) {
          return;
        }
        if (obfuscationGuard < -82) {
          originX = originX + this.x;
          originY = originY + this.y;
          this.a(MusicPatchNode.field_z, this.field_L, originY, 16777215, originX);
          this.a(eb.field_e, this.field_Q, originY, 16777215, originX);
          this.a(BattleTutorial.field_l, this.field_O, originY, 16777215, originX);
          return;
        }
    }

    final static String a(char param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (param1) {
          for (var4 = 0; param2 > var4; var4++) {
            var6[var4] = param0;
          }
          return new String(var6);
        }
        return (String) null;
    }

    private no(WidgetPainter param0, boolean param1) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_L = (EditableTextWidget) ((Object) new ma("", (WidgetListener) null, 2));
          this.field_Q = (EditableTextWidget) ((Object) new ma("", (WidgetListener) null, 2));
          this.field_O = (EditableTextWidget) ((Object) new ma("", (WidgetListener) null, 4));
          this.field_O.painter = param0;
          this.field_Q.painter = param0;
          this.field_L.painter = param0;
          this.field_R = param1 ? true : false;
          if (!this.field_R) {
            this.a((byte) 10, (Widget) (this.field_L));
            this.a((byte) 10, (Widget) (this.field_Q));
          } else {
            this.a((byte) 10, (Widget) (this.field_Q));
            this.a((byte) 10, (Widget) (this.field_L));
          }
          this.a((byte) 10, (Widget) (this.field_O));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "no.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        super.setBounds(x, width, y, 8192, height);
        int var6 = width - 130 >> 1;
        if (this.field_R) {
          this.field_Q.setBounds(var6, 25, 0, 8192, height);
          this.field_L.setBounds(var6 + 45, 25, 0, 8192, height);
          this.field_O.setBounds(90 + var6, 40, 0, obfuscationGuard, height);
          return;
        }
        this.field_L.setBounds(var6, 25, 0, 8192, height);
        this.field_Q.setBounds(45 + var6, 25, 0, 8192, height);
        this.field_O.setBounds(90 + var6, 40, 0, obfuscationGuard, height);
    }

    final int a(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -77) {
          return -48;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_O.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    static {
        field_P = new RgbSprite(0, 0);
    }
}
