/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NumericDateInputWidget extends DateInputWidget {
    static LobbyRoom roomSetup;
    static int[] field_U;
    static ClientUiComponent field_M;
    static RgbSprite field_P;
    static int field_J;
    private EditableTextWidget monthInput;
    static int responseTargetChannel;
    private EditableTextWidget yearInput;
    static ClientUiComponent field_T;
    private boolean monthFirst;
    private EditableTextWidget dayInput;
    static String cachedConsoleSource;

    final int getDay(int obfuscationGuard) {
        int day = 0;
        Throwable caughtFailure = null;
        int guardRemainder = 0;
        NumberFormatException parseFailure = null;
        guardRemainder = 47 % ((obfuscationGuard + 30) / 36);
        try {
          day = Integer.parseInt(this.dayInput.text);
          return day;
        } catch (java.lang.NumberFormatException caughtParameter) {
          caughtFailure = caughtParameter;
          parseFailure = (NumberFormatException) (Object) caughtFailure;
          return -1;
        }
    }

    final boolean isDateEmpty(int obfuscationGuard) {
        if (null == this.dayInput.text) {
          return true;
        }
        if (0 == this.dayInput.text.length()) {
          return true;
        }
        if (null != this.monthInput.text &&
          this.monthInput.text.length() != 0) {
          if (obfuscationGuard != -22339) {
            return false;
          }
          if (null != this.yearInput.text &&
            this.yearInput.text.length() != 0) {
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

    NumericDateInputWidget(WidgetPainter painter, boolean monthFirst, int x, int y, int width, int height) {
        this(painter, monthFirst);
        try {
          this.setBounds(x, width, y, 8192, height);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "no.<init>(" + (painter != null ? "{...}" : "null") + ',' + monthFirst + ',' + x + ',' + y + ',' + width + ',' + height + ')');
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

    final void setDateValidator(byte obfuscationGuard, DateOfBirthValidator validator) {
        try {
          super.setDateValidator((byte) -108, validator);
          this.dayInput.listener = (WidgetListener) ((Object) validator);
          this.monthInput.listener = (WidgetListener) ((Object) validator);
          if (obfuscationGuard > -21) {
            this.isDateEmpty(-25);
          }
          this.yearInput.listener = (WidgetListener) ((Object) validator);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "no.I(" + obfuscationGuard + ',' + (validator != null ? "{...}" : "null") + ')');
        }
    }

    final int getMonthIndex(int obfuscationGuard) {
        NumberFormatException parseFailure = null;
        int monthIndex = 0;
        Throwable caughtFailure = null;
        if (obfuscationGuard != -26458) {
          return -46;
        }
        try {
          monthIndex = Integer.parseInt(this.monthInput.text) - 1;
          return monthIndex;
        } catch (java.lang.NumberFormatException caughtParameter) {
          caughtFailure = caughtParameter;
          parseFailure = (NumberFormatException) (Object) caughtFailure;
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
        String var2 = this.monthInput.getTooltipText(obfuscationGuard ^ 0);
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
          this.a(MusicPatchNode.field_z, this.dayInput, originY, 16777215, originX);
          this.a(eb.field_e, this.monthInput, originY, 16777215, originX);
          this.a(BattleTutorial.field_l, this.yearInput, originY, 16777215, originX);
          return;
        }
    }

    final static String repeatCharacter(char character, boolean obfuscationGuard, int count) {
        int characterIndex = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        char[] characters = new char[count];
        char[] characterArrayAlias = characters;
        if (obfuscationGuard) {
          for (characterIndex = 0; count > characterIndex; characterIndex++) {
            characters[characterIndex] = character;
          }
          return new String(characters);
        }
        return (String) null;
    }

    private NumericDateInputWidget(WidgetPainter painter, boolean monthFirst) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.dayInput = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) null, 2));
          this.monthInput = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) null, 2));
          this.yearInput = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) null, 4));
          this.yearInput.painter = painter;
          this.monthInput.painter = painter;
          this.dayInput.painter = painter;
          this.monthFirst = monthFirst ? true : false;
          if (!this.monthFirst) {
            this.addChild((byte) 10, (Widget) (this.dayInput));
            this.addChild((byte) 10, (Widget) (this.monthInput));
          } else {
            this.addChild((byte) 10, (Widget) (this.monthInput));
            this.addChild((byte) 10, (Widget) (this.dayInput));
          }
          this.addChild((byte) 10, (Widget) (this.yearInput));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "no.<init>(" + (painter != null ? "{...}" : "null") + ',' + monthFirst + ')');
        }
    }

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        super.setBounds(x, width, y, 8192, height);
        int fieldsX = width - 130 >> 1;
        if (this.monthFirst) {
          this.monthInput.setBounds(fieldsX, 25, 0, 8192, height);
          this.dayInput.setBounds(fieldsX + 45, 25, 0, 8192, height);
          this.yearInput.setBounds(90 + fieldsX, 40, 0, obfuscationGuard, height);
          return;
        }
        this.dayInput.setBounds(fieldsX, 25, 0, 8192, height);
        this.monthInput.setBounds(45 + fieldsX, 25, 0, 8192, height);
        this.yearInput.setBounds(90 + fieldsX, 40, 0, obfuscationGuard, height);
    }

    final int getYear(byte obfuscationGuard) {
        NumberFormatException parseFailure = null;
        int year = 0;
        Throwable caughtFailure = null;
        if (obfuscationGuard != -77) {
          return -48;
        }
        try {
          year = Integer.parseInt(this.yearInput.text);
          return year;
        } catch (java.lang.NumberFormatException caughtParameter) {
          caughtFailure = caughtParameter;
          parseFailure = (NumberFormatException) (Object) caughtFailure;
          return -1;
        }
    }

    static {
        field_P = new RgbSprite(0, 0);
    }
}
