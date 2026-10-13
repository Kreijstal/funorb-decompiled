/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static String field_a;
    static lo field_b;
    static String field_c;
    static String field_d;

    abstract byte[] toByteArray(int obfuscationGuard);

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 == 10) {
          field_c = null;
          field_b = null;
          return;
        }
        RgbSprite var2 = (RgbSprite) null;
        ByteStorage.a((RgbSprite) null, (byte) 73, 53, -72, (RgbSprite) null, (RgbSprite) null, 93, 73, -92, 81, -52);
        field_c = null;
        field_b = null;
    }

    abstract void store(int obfuscationGuard, byte[] data);

    final static void a(RgbSprite param0, byte param1, int param2, int param3, RgbSprite param4, RgbSprite param5, int param6, int param7, int param8, int param9, int param10) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        try {
          if (param1 != -78) {
            field_c = (String) null;
          }
          param0.drawAt((-param0.canvasWidth + param3) / 2 + (param9 + (param6 * 5 >> 16)), param2);
          param5.drawTransparent(-(8 / param10) + ((param6 * 10 >> 16) + ((param3 - param5.canvasWidth) / 2 + param9)), -(30 / param10) + (param2 + (param7 + 480) - param5.canvasHeight));
          param4.drawTransparent((20 * param6 >> 16) + ((param3 - param4.canvasWidth) / 2 + param9), 480 - param4.canvasHeight);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("tl.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    static {
        field_a = "FROM ONLY";
        field_c = "Never mind! <%0>";
        field_d = "Elapsed time";
        field_b = new lo();
    }
}
