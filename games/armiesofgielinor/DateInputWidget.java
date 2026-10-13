/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DateInputWidget extends DequeWidgetContainer implements ValidationProvider {
    private DateOfBirthValidator validator;
    static BinaryBitmapFont field_E;
    static int field_F;
    static String field_G;

    abstract int getYear(byte obfuscationGuard);

    public static void n(int param0) {
        if (param0 != 0) {
          return;
        }
        field_G = null;
        field_E = null;
    }

    void setDateValidator(byte obfuscationGuard, DateOfBirthValidator validator) {
        try {
          if (obfuscationGuard >= -21) {
            PacketBuffer var4 = (PacketBuffer) null;
            DateInputWidget.readUnsignedByteArray((PacketBuffer) null, (byte) -110);
          }
          this.validator = validator;
          this.validator.input = this;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "en.I(" + obfuscationGuard + ',' + (validator != null ? "{...}" : "null") + ')');
        }
    }

    abstract int getDay(int obfuscationGuard);

    final static int[] readUnsignedByteArray(PacketBuffer packet, byte obfuscationGuard) {
        int var3 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int[] var5 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -24) {
            DateInputWidget.n(-95);
          }
          var5 = new int[packet.readUnsignedByte(obfuscationGuard ^ -24)];
          var2 = var5;
          for (var3 = 0; var5.length > var3; var3++) {
            var5[var3] = packet.readUnsignedByte(0);
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("en.D(");
          if (packet == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    DateInputWidget(int x, int y, int width, int height, WidgetPainter painter) {
        super(x, y, width, height, painter);
    }

    public final ValidationSource getValidationSource(int obfuscationGuard) {
        if (obfuscationGuard != -918933630) {
          PacketBuffer var3 = (PacketBuffer) null;
          DateInputWidget.readUnsignedByteArray((PacketBuffer) null, (byte) 126);
          return (ValidationSource) ((Object) this.validator);
        }
        return (ValidationSource) ((Object) this.validator);
    }

    abstract int getMonthIndex(int obfuscationGuard);

    abstract boolean isDateEmpty(int obfuscationGuard);

    static {
        field_G = "Loading extra data";
    }
}
